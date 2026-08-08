# JFR / AOT Startup Observation (Java 25) Demo

## Feature
为 Java 25 的 JFR 与 AOT 启动优化准备可重复的最小启动负载。
## Version & Status
JDK 25；`pending_jdk25_verification`；JFR/AOT 参数需按 JDK 25 发行说明确认。
## Background
启动延迟和预热时间影响 CLI、弹性扩缩容与短任务服务。
## Problem
需要区分启动成本、类加载成本和稳态执行成本。
## Example
`StartupWorkload` 提供稳定 marker，配合 JFR 录制和 AOT cache 命令观察。
## Usage Scenario
CLI、serverless 冷启动和滚动扩容。
## Limitations
AOT cache 受 classpath、JDK build 和启动参数影响；本机无 JDK 25。
## Code Walkthrough
负载不嵌入 AOT 专用 API，便于对比普通启动与缓存启动。
## Business Mapping
问题 → 冷启动延迟；特性 → JFR/AOT 观察；收益 → 可分解启动阶段；风险/替代 → 仍需真实应用 classpath 验证。
## Learning Resources
- [JDK 25 Release](https://openjdk.org/projects/jdk/25/)（★★★★★，版本清单）
- [JFR Documentation](https://docs.oracle.com/en/java/javase/25/jfapi/)（★★★★★，事件 API）
- [Inside Java](https://inside.java/)（★★★★☆，AOT/JFR 动态）
## Run
JDK 25 下先 `mvn clean test`，再按 JDK 25 `java` 手册执行 AOT cache/JFR 命令。
## Verification
`pending_jdk25_verification`；需记录启动命令、JFR 文件摘要和 AOT cache 生成结果。
