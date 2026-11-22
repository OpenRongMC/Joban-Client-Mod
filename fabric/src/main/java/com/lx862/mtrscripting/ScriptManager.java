package com.lx862.mtrscripting;

import com.lx862.mtrscripting.core.MTRClassShutter;
import com.lx862.mtrscripting.core.ParsedScript;
import com.lx862.mtrscripting.data.ScriptContent;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ScriptManager implements AutoCloseable {
    public static final Logger LOGGER = LogManager.getLogger("JCM Scripting");
    private static final ObjectList<TriConsumer<String, Context, Scriptable>> onParseScriptCallback = new ObjectArrayList<>();
    private final MTRClassShutter classShutter;

    private final ScriptInstanceManager instanceManager;
    private ExecutorService scriptThread;
    private boolean closed;
    private static final java.util.concurrent.atomic.AtomicInteger WORKER_IDS = new java.util.concurrent.atomic.AtomicInteger();

    private static ExecutorService createScriptExecutor() {
        return Executors.newSingleThreadExecutor(task -> {
            Thread thread = new Thread(task, "JCM-script-" + WORKER_IDS.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        });
    }

    public ScriptManager() {
        this.instanceManager = new ScriptInstanceManager();
        this.scriptThread = createScriptExecutor();
        this.classShutter = new MTRClassShutter();
    }

    public ScriptInstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public void onParseScript(String contextName, Context context, Scriptable scriptable) {
        for(TriConsumer<String, Context, Scriptable> entry : onParseScriptCallback) {
            entry.accept(contextName, context, scriptable);
        }
    }

    /**
     * Register a callback that will be called when a script is to be parsed.<br>
     * This can be to add new types/objects to the script.
     * @param callback The callback to run (Context type, Rhino Context, Scriptable)
     */
    public void onParseScript(TriConsumer<String, Context, Scriptable> callback) {
        onParseScriptCallback.add(callback);
    }

    /**
     * Obtain the class shutter, this could be used to explicitly allow/deny java package/class accesses for scripts.
     */
    public MTRClassShutter getClassShutter() {
        return this.classShutter;
    }

    public ParsedScript parseScript(String contextName, List<ScriptContent> scripts) throws Exception {
        return new ParsedScript(this, contextName, scripts);
    }

    /** Currently this checks and dispose dead script instances (i.e. Those that are no longer active).<br>
     * This should be called from time to time. */
    public void tick() {
        this.instanceManager.clearDeadInstance();
    }

    /** Clear all script instances<br>
     * This should be called on resource reload */
    public void reset() {
        if (closed) return;
        instanceManager.reset();
        scriptThread.shutdownNow();
        scriptThread = createScriptExecutor();
    }

    /** Dispose live scripts and let queued disposal callbacks finish at client shutdown. */
    @Override
    public void close() {
        if (closed) return;
        instanceManager.reset();
        closed = true;
        scriptThread.shutdown();
    }

    /** Submit a task to the script thread executor */
    public Future<?> submitScriptTask(Runnable runnable) {
        return scriptThread.submit(runnable);
    }
}
