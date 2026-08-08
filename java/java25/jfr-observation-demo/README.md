# JFR Observation (Java 25) Demo

## Feature
Java 25 的 JFR CPU-time、协作采样和方法计时等诊断能力的最小负载入口。
## Version & Status
JDK 25；`pending_jdk25_verification`；具体事件按 JEP 509、518、520 核对。
## Background
性能排查需要时间线和采样证据，而不是只看单点耗时。
## Problem
CPU、方法调用和线程状态之间的关系难以从普通日志还原。
## Example
`Jfr25Workload` 生成固定计算负载，待 JDK 25 安装后用 `jcmd JFR.start` 录制。
## Usage Scenario
CPU 热点、方法计时和低开销线上诊断。
## Limitations
事件名称、权限和采样开销需以 JDK 25 build 为准；本机未验证。
## Code Walkthrough
负载与 JFR 配置分离，便于比较不同事件模板。
## Business Mapping
问题 → 性能异常缺少时间线；特性 → JFR 采样/方法计时；收益 → 关联热点与线程；风险/替代 → 录制数据要脱敏和限时。
## Learning Resources
- [JEP 509](https://openjdk.org/jeps/509)（★★★★★，CPU-time profiling）
- [JFR API](https://docs.oracle.com/en/java/javase/25/jfapi/)（★★★★★，官方指南）
- [Inside Java JFR](https://inside.java/tag/jfr/)（★★★★☆，实践解读）
## Run
JDK 25 下执行 `mvn clean test`，再按 `jcmd`/JFR 文档录制该主类。
## Verification
`pending_jdk25_verification`；需记录 JDK build、事件配置和 JFR 文件摘要。
