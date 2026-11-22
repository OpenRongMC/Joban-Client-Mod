<p align="center">
  <img src="assets/JCM_logo.png" width="180px" alt="JCM Logo">
</p>

<h1 align="center">
  Joban Client Mod
</h1>

[简体中文](./README.md) · English


<p align="center">Bring your transit world to life with various decoration blocks!</p>

<p align="center">
  <a href="https://modrinth.com/mod/jcm">
    <img alt="Available on Modrinth" height="50" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">
  </a>
  <a href="https://discord.com/invite/FNc2rgWmP2">
    <img alt="Chat with us on Discord" height="50" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/social/discord-plural_vector.svg">
  </a>
</p>

Joban Client Mod is an addon mod for the **Minecraft Transit Railway 4.0**, adding various blocks from **Emergency stop button**, **Helpline** to fully customizable Passenger Information Display System and more!  

This repository contains the source code for Joban Client Mod.

## What changed in the RongMC 26.3 port

The port adapts JCM to the MTR 26.3 platform, updates resource generation and the PIDS rendering path, and shuts down script workers when the client exits.

## Installation

Download **v2.0.0-port.1+26.3** from [GitHub Releases](https://github.com/OpenRongMC/Joban-Client-Mod/releases/tag/v2.0.0-port.1%2B26.3) for Minecraft Java **26.3** on **Fabric** with **Java 25**. Dependencies include [Fabric API](https://modrinth.com/mod/fabric-api), [MTR](https://github.com/OpenRongMC/Minecraft-Transit-Railway). Place the release JAR in the instance’s `mods/` directory. Despite its name, JCM registers world blocks and belongs on both the client and server. Pair it with MTR from the same release family.

## Future plans
Due to the shift away from **Minecraft Mappings** in the upcoming MTR version, JCM will need to make sweeping changes to adapt.

A [port of JCM v2 for NeoMTR (MTR 3/Architectury)](https://github.com/DistrictOfJoban/NeoMTR/tree/lx/common/src/main/java/com/lx862/jcm) have been made, which is expected to align closer with the architectury port of MTR. 

## Links
- [Website](https://www.joban.org/jcm)
- Documentation (Work In Progress!)

## License
This project is licensed under the MIT License.
