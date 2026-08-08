# Compact Object Headers (Java 25) Demo

## Feature
观察 Java 25 的 Compact Object Headers JVM 实验能力。
## Version & Status
JDK 25；`pending_jdk25_verification`；JVM 参数实验，不是 Java 源码 API。
## Background
对象头是每个对象的运行时元数据，压缩可能降低对象占用并提高缓存密度。
## Problem
大量小对象场景需要评估布局收益与兼容边界。
## Example
`ObjectHeaderWorkload` 生成短生命周期小对象，配合 `-XX:+UseCompactObjectHeaders` 观察。
## Usage Scenario
缓存节点、消息对象和元数据密集型服务的 JVM 实验。
## Limitations
收益依赖堆大小、对象形态和平台；本机没有 JDK 25，未验证参数。
## Code Walkthrough
Java 代码只产生负载，布局由 JVM 参数决定。
## Business Mapping
问题 → 小对象内存密度；特性 → compact headers；收益 → 可能降低 footprint；风险/替代 → 必须压测和检查工具兼容。
## Learning Resources
- [JDK 25 JEP Index](https://openjdk.org/jeps/0)（★★★★★，确认参数状态）
- [HotSpot VM Options](https://docs.oracle.com/en/java/javase/25/docs/specs/man/java.html)（★★★★★，启动参数）
- [Shipilev JVM Articles](https://shipilev.net/)（★★★★★，布局分析）
## Run
JDK 25 下执行 `mvn clean test`；再运行 `java -XX:+UseCompactObjectHeaders -cp target/classes com.tu.languagelab.java25.objectheaders.ObjectHeaderWorkload`。
## Verification
`pending_jdk25_verification`；需记录 JDK build、堆参数和对象布局工具输出。
