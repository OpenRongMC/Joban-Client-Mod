# 常磐客户端模组（JCM）

简体中文 · [English](./README.en.md)

MTR 的车站设施扩展，提供紧急停车按钮、求助设施和可定制的乘客资讯显示系统（PIDS）。部分显示内容由扩展脚本和资源控制。

## 下载与安装

- 版本 · [v2.0.0-port.1+26.3](https://github.com/OpenRongMC/Joban-Client-Mod/releases/tag/v2.0.0-port.1%2B26.3) (已发布)
- 下载文件 · `rongmc-jcm-2.0.0-port.1.26.3.jar`
- 运行环境 · Minecraft Java 26.3, Fabric, Java 25
- Fabric Loader · `>=0.19.0`
- Fabric 模组 ID · `rongmc_jsblock`
- JAR 声明的依赖 · [Fabric API](https://modrinth.com/mod/fabric-api), [`rongmc_mtr`](https://github.com/OpenRongMC/Minecraft-Transit-Railway) `4.0.5-port.1+26.3`

把发行 JAR 放入对应实例的 `mods/` 目录。尽管名字含 Client Mod，它注册了世界方块，联机要在客户端和服务端都装。使用同系列的 MTR 与 JCM。

## 如何验证

在车站放置一块 PIDS，选一个显示配置并检查乘客资讯能刷新。自定义显示异常时，同时提供脚本或资源包版本及遇到问题的显示器型号。

## 开发

与同一版本的 MTR 和平台映射一起联调。交通套件的 RongMC 发布构建使用 Java 25，应以配套工作区和发行 JAR 的元数据为准。

## 文档与反馈

- [原 README（旧版指南、贡献者与署名）](https://github.com/OpenRongMC/Joban-Client-Mod/blob/363a4d46f1ace059cb9673ca3edaa1a1618264e3/README.md)
- [上游项目与文档](https://github.com/DistrictOfJoban/Joban-Client-Mod)
- [报告 RongMC 移植问题](https://github.com/OpenRongMC/Joban-Client-Mod/issues) · 请附游戏版本、两端 JAR 文件名、复现步骤和相关日志。

## 许可与署名

请参阅本仓库的 [LICENSE](./LICENSE) 及原项目的许可、署名和第三方资源说明。
