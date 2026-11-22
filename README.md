<p align="center">
  <img src="assets/JCM_logo.png" width="180px" alt="JCM Logo">
</p>

<h1 align="center">
  Joban Client Mod
</h1>

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

## Future plans
Due to the shift away from **Minecraft Mappings** in the upcoming MTR version, JCM will need to make sweeping changes to adapt.

A [port of JCM v2 for NeoMTR (MTR 3/Architectury)](https://github.com/DistrictOfJoban/NeoMTR/tree/lx/common/src/main/java/com/lx862/jcm) have been made, which is expected to align closer with the architectury port of MTR. 

## Links
- [Website](https://www.joban.org/jcm)
- Documentation (Work In Progress!)

## License
This project is licensed under the MIT License.

---

## RongMC · Minecraft 26.3 Fabric 移植说明

本仓库是 RongMC 维护的 **Minecraft 26.3 / Fabric / Java 25** 移植构建，不是上游官方发行渠道。

### 与原版的主要差异
- 依赖本组织的 `rongmc_mtr`（而非上游官方 MTR jar）。
- Fabric id：`rongmc_jsblock`（provides `jsblock`）；目标 MC 26.3。

### 已知问题 / 限制
- 上游 README 提到的 NeoMTR / 映射层迁移规划与本移植无关；本仓只维护 26.3 Fabric 可用构建。
- PIDS / 装饰方块在极端资源包冲突下可能出现贴图或字体回退（与上游同类风险）。

### 构建与安装
- Fabric mod id：`rongmc_jsblock`（`provides`：`jsblock`，旧依赖名一般仍可解析）
- Release 产物见本仓库 Releases（jar 名带 `rongmc-` 前缀）
- 许可证：本仓以 **GPL-3.0** 发布（见 `LICENSE`）；请同时尊重上游原作者条款与署名

