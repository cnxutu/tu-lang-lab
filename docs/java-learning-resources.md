# Java 学习资源

先读官方资料确认版本、API 状态和语义，再使用社区文章理解设计动机、诊断方法和实践经验。外部文章不替代案例中的本机验证。

## 官方资料

| 资源 | 功能说明 | 推荐用途 |
| --- | --- | --- |
| [Dev.java Learn](https://dev.java/learn/) | 面向开发者的 Java 教程与 API 学习入口 | Java 8 Stream、Optional、并发和现代语言特性的入门与练习 |
| [OpenJDK JDK Project](https://openjdk.org/projects/jdk/) | 发布节奏和各 JDK 版本状态 | 确认目标 JDK 是否已发布、是否为 LTS，以及版本时间线 |
| [JDK 25 Release Page](https://openjdk.org/projects/jdk/25/) | JDK 25 集成特性与 JEP 清单 | 规划 Java 25 的稳定、预览、孵化和实验案例 |
| [OpenJDK JEP Index](https://openjdk.org/jeps/0) | 每项 JEP 的状态、目标版本与设计背景 | 编写案例前确认一项能力的首次版本、最终状态和兼容性 |
| [Java SE API 文档](https://docs.oracle.com/en/java/javase/25/docs/api/) | 标准库的权威 API 参考 | 查 `java.util.concurrent`、`java.time`、集合与诊断 API 的精确契约 |
| [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se25/html/index.html) | Java 语法、类型系统和运行规则 | 深入模式匹配、Record、switch、初始化顺序等语言语义 |
| [JDK Flight Recorder 文档](https://docs.oracle.com/en/java/javase/25/jfapi/) | JFR API 与诊断能力参考 | JVM、Virtual Thread、GC 和性能观察案例 |

## 官方技术社区

| 资源 | 功能说明 | 推荐用途 |
| --- | --- | --- |
| [Inside Java](https://inside.java/) | Oracle Java 团队的版本解读、视频与 JEP Cafe | 跟踪 JDK 21 到 25 的语言、API、GC 和性能变化 |
| [Java YouTube](https://www.youtube.com/@java) | Java 团队与社区的发布活动、技术分享 | 配合 Java 21/25 发布主题建立学习清单 |

## 社区博客与知识库

| 资源 | 功能说明 | 推荐用途 |
| --- | --- | --- |
| [Foojay](https://foojay.io/) | Java 社区文章、术语页与技术动态 | 用于理解 Project Loom、JVM 生态和经验性实践；关键结论回查 JEP |
| [Aleksey Shipilëv](https://shipilev.net/) | JVM、JIT、GC 与性能方法论材料 | JVM 性能实验、基准设计和 GC/JIT 深入阅读 |
| [Baeldung Java](https://www.baeldung.com/java-tutorial) | 面向实践的 Java API 与语言教程集合 | 为单一特性补充可运行示例；版本与性能结论需回查官方资料 |

## 推荐阅读路径

1. **Java 8**：Dev.java 的 Stream/Optional 教程 → Java SE API 文档 → 自己实现最小 Demo。
2. **Java 17**：JEP Index 确认语言能力状态 → JLS 查语义边界 → 为 Record、Sealed Class 和 switch 分别建案例。
3. **Java 21 并发**：先读 Virtual Threads 官方教程与 JEP 444 → 用 JFR 观察 → 再阅读 Foojay 的延伸材料。
4. **Java 25**：先从 JDK 25 Release Page 建立清单 → 每项能力进入对应 JEP → 对预览/孵化能力单独建立实验案例。
5. **JVM**：先定义可复现实验，再参考 JFR 文档与 Shipilëv 的性能方法论；不要从博客数据直接推导性能结论。
