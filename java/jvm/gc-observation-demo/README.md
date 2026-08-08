# JVM GC Observation Demo

## Feature
构造短生命周期对象，并用 GC 日志观察收集器行为。

## Version & Status
- JDK 17；日志参数依赖 HotSpot。

## Background
GC 关注的是对象生命周期与暂停/并发成本，不是简单的“使用率越低越好”。

## Problem
需要把分配负载、收集器选择和日志事件联系起来。

## Example
`GcWorkload` 重复分配 1KB 临时数组；它只生成观察负载，不模拟业务吞吐。

## Code Walkthrough
分配循环是可复现入口；`-Xlog:gc` 是观察点。

## Business Mapping
问题 → 频繁分配导致暂停或吞吐波动；特性 → GC 日志与分配负载；收益 → 学会先看证据再选参数；风险/替代 → 生产调优需结合 JFR、业务指标和压测。

## Usage Scenario
收集器日志教学、对象生命周期实验和启动参数对比。

## Limitations
`System.gc()` 不应作为生产控制手段；日志格式和收集器实现会变化。

## Learning Resources
- [Java GC Tuning Guide](https://docs.oracle.com/en/java/javase/17/gctuning/)（★★★★★，官方调优指南）
- [JEP Index](https://openjdk.org/jeps/0)（★★★★★，确认收集器状态）
- [Aleksey Shipilev](https://shipilev.net/)（★★★★★，性能实验方法）

## Run
`mvn clean test`；`java -Xlog:gc -cp target/classes com.tu.languagelab.jvm.gc.GcWorkload`。

## Verification
记录 JDK、收集器、堆参数、OS 和命令；不提交完整大日志。
