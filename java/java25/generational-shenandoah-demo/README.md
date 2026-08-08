# Generational Shenandoah (Java 25) Demo

## Feature
用短生命周期对象负载观察 Generational Shenandoah 收集器。
## Version & Status
JDK 25；`pending_jdk25_verification`；收集器参数和默认状态需以 JDK 25 为准。
## Background
分代假设利用新生对象更快死亡的规律，减少不必要的全堆工作。
## Problem
高分配吞吐服务需要在暂停、并发工作和内存占用间权衡。
## Example
`ShenandoahWorkload` 产生 allocation churn，README 给出 `-XX:+UseShenandoahGC -XX:+UnlockExperimentalVMOptions -XX:+ShenandoahGCMode=generational` 实验入口。
## Usage Scenario
低暂停服务、消息处理和缓存更新负载。
## Limitations
不能从小样本推导业务收益；本机没有 JDK 25，未验证参数状态。
## Code Walkthrough
负载代码与收集器选择分离，避免把 JVM 策略写进业务代码。
## Business Mapping
问题 → 分配峰值导致暂停；特性 → 分代 Shenandoah；收益 → 可能改善年轻对象回收；风险/替代 → G1/ZGC 需同等压测比较。
## Learning Resources
- [Shenandoah GC](https://wiki.openjdk.org/display/shenandoah/Main)（★★★★☆，项目资料）
- [JDK 25 GC Tuning](https://docs.oracle.com/en/java/javase/25/gctuning/)（★★★★★，官方参数）
- [Shipilev](https://shipilev.net/)（★★★★★，GC 方法论）
## Run
JDK 25 下执行测试，再用上述参数运行主类并收集 `-Xlog:gc`。
## Verification
`pending_jdk25_verification`；需记录收集器、堆大小、OS 和 GC 日志摘要。
