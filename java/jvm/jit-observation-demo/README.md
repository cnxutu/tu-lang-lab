# JVM JIT Observation Demo

## Feature
用热循环制造可观察的 JIT 编译候选方法。

## Version & Status
- JDK 17；观察参数是 HotSpot 实现相关。

## Background
解释执行、编译执行和去优化共同影响运行时表现；一次冷启动无法代表稳态。

## Problem
性能问题需要知道方法是否被编译，而不是只猜测“JVM 会优化”。

## Example
`JitWorkload.main` 重复调用 `sumSquares`，可配合 `-XX:+PrintCompilation` 查看编译日志。

## Code Walkthrough
循环是可重复的观察负载；它不是正式基准，未控制预热、分支和系统噪声。

## Business Mapping
问题 → 延迟分析缺少运行态证据；特性 → JIT 编译观察；收益 → 建立“源码方法—编译事件”的关联；风险/替代 → 正式性能结论应使用 JMH。

## Usage Scenario
性能诊断教学、编译阈值实验和 JIT 日志阅读。

## Limitations
`PrintCompilation` 输出随 JDK、编译器和参数变化；不比较不同机器的耗时。

## Learning Resources
- [HotSpot VM Guide](https://docs.oracle.com/en/java/javase/17/vm/java-virtual-machine-technology-overview.html)（★★★★★，官方背景）
- [JVMCI/JIT 文档](https://openjdk.org/groups/compiler/)（★★★★☆，编译器项目）
- [Aleksey Shipilev](https://shipilev.net/)（★★★★★，JVM 性能方法论）

## Run
`mvn clean test`；`java -XX:+PrintCompilation -cp target/classes com.tu.languagelab.jvm.jit.JitWorkload`。

## Verification
记录 JDK 17、HotSpot 参数和观察命令；不把日志指令编号当作跨版本保证。
