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
| [JavaGuide](https://github.com/Snailclimb/JavaGuide) | 中文开源 Java 知识库，覆盖基础、集合、并发与 JVM | 用中文梳理既有知识并定位 JVM 主题；不把面试题式结论当作语言规范 |
| [OpenJDK JDK Source](https://github.com/openjdk/jdk) | OpenJDK 主线源码、测试与构建资料 | 在掌握 API 契约后，沿实现与测试追踪 JDK 行为；不建议作为入门第一读物 |
| [Caffeine Wiki](https://github.com/ben-manes/caffeine/wiki) | 高质量 Java 库的设计与性能说明 | 用于观察现代 Java 集合、并发与缓存设计如何落到真实开源库；不属于语言规范 |
| [SegmentFault Lessons](https://github.com/mercyblitz/segmentfault-lessons) | 中文技术讲堂的示例工程集合 | 选择性阅读 Java/JVM 主题的中文实践材料，并以本仓库最小 Demo 验证理解 |

## 推荐资源星级

星级表示 K5 的学习优先级，先用官方资料核实语义，再用社区材料补足示例和经验。

| 资源 | 类型 | 推荐 | 理由 |
| --- | --- | --- | --- |
| [Dev.java Learn](https://dev.java/learn/) | 官方教程 | ★★★★★ | 现代 Java 教程入口，适合每个 Demo 的第一阅读。 |
| [OpenJDK JEP Index](https://openjdk.org/jeps/0) | 官方设计记录 | ★★★★★ | 可核实版本、状态、目标和非目标；预览特性必读。 |
| [Java SE API / JLS / JVMS](https://docs.oracle.com/en/java/javase/25/docs/api/) | 官方规范 | ★★★★★ | API、语法和字节码语义的最终依据。 |
| [Inside Java](https://inside.java/) | 官方技术社区 | ★★★★☆ | 适合理解版本演进、JFR、GC 和设计动机。 |
| [Foojay](https://foojay.io/) | 国际社区 | ★★★★☆ | Loom、JVM 与迁移实践丰富，关键事实需回查 JEP。 |
| [Java Design Patterns](https://java-design-patterns.com/) | 开源知识库 | ★★★★☆ | 连接语言能力与设计问题，适合选择性阅读。 |
| [Progress Java](https://progressjava.com/) | 开源现代 Java 指南 | ★★★★☆ | 提供 Java 8→17→21 的版本导向路径。 |
| [HappyCoders Virtual Threads](https://www.happycoders.eu/java/virtual-threads/) | 国际深度博客 | ★★★★☆ | 虚拟线程机制和限制讲解完整，适合 JEP 444 后阅读。 |
| [JEPs 中文阅读](https://jeps.dev/docs/jdk21/444/) | 中文资料 | ★★★☆☆ | 降低首次阅读门槛，译文与状态需交叉核对。 |
| [Baeldung Java](https://www.baeldung.com/java-tutorial) | 国际实践博客 | ★★★☆☆ | 小型示例便于上手，不直接采用其旧版本或性能结论。 |
| [OpenJDK JDK Source](https://github.com/openjdk/jdk) | 国际 GitHub 源码 | ★★★★☆ | 是 JDK 主线实现与测试的第一手材料，适合从 API/JEP 走向实现；源码体量大，不适合作为起点。 |
| [Caffeine Wiki](https://github.com/ben-manes/caffeine/wiki) | 国际 GitHub / 开源项目 | ★★★★☆ | 能看到语言与并发能力在成熟库中的设计权衡；定位是工程参考，不替代语言规范。 |
| [JavaGuide](https://github.com/Snailclimb/JavaGuide) | 国内 GitHub / 中文知识库 | ★★★★☆ | 中文覆盖面广，适合作为 Java 与 JVM 的复习索引；其面试导向内容须回查 JLS、JEP 与 API。 |
| [SegmentFault Lessons](https://github.com/mercyblitz/segmentfault-lessons) | 国内 GitHub / 中文示例 | ★★★☆☆ | 有中文配套示例，便于对照实践；按专题挑读并自行验证版本前提。 |

## 推荐阅读路径

1. **Java 8**：Dev.java 的 Stream/Optional 教程 → Java SE API 文档 → 自己实现最小 Demo。
2. **Java 17**：JEP Index 确认语言能力状态 → JLS 查语义边界 → 为 Record、Sealed Class 和 switch 分别建案例。
3. **Java 21 并发**：先读 Virtual Threads 官方教程与 JEP 444 → 用 JFR 观察 → 再阅读 Foojay 的延伸材料。
4. **Java 25**：先从 JDK 25 Release Page 建立清单 → 每项能力进入对应 JEP → 对预览/孵化能力单独建立实验案例。
5. **JVM**：先定义可复现实验，再参考 JFR 文档与 Shipilëv 的性能方法论；不要从博客数据直接推导性能结论。

## JDK 8 基础入门资源

| 资源 | 推荐 | 理由 |
| --- | --- | --- |
| [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/) | ★★★★★ | 面向初学者覆盖类、集合、异常、IO、网络和并发，适合与 `java8/fundamentals` 逐章对照。 |
| [Java SE 8 API](https://docs.oracle.com/javase/8/docs/api/) | ★★★★★ | 查集合、泛型、Files、URLConnection、Thread 的精确方法契约。 |
| [JavaGuide](https://github.com/Snailclimb/JavaGuide) | ★★★★☆ | 国内中文索引覆盖 Java 基础、集合、并发和 JVM，适合复习和定位主题；规范结论需回查 API/JLS。 |
| [The Java™ Tutorials Archive](https://github.com/javaee/tutorial-examples) | ★★★☆☆ | 可用于观察官方示例工程组织方式，但仓库已归档，适合历史/JDK8 对照，不作为现代 API 首选。 |
| [Baeldung Java Basics](https://www.baeldung.com/java-tutorial) | ★★★☆☆ | 小节短、适合补充直觉；版本和性能结论必须结合 K5 测试重新验证。 |

## GitHub / 博客使用原则

1. GitHub 项目用来观察真实代码、测试与演进记录；不要复制整段实现替代自己动手。
2. 国内资料优先解决术语和背景理解，涉及版本、预览状态、JVM 参数与性能结论时回到 JEP、JLS、API 和本机输出。
3. 每个 Demo 的 README 保留最多一个社区延伸阅读，避免阅读清单超过动手练习本身。
