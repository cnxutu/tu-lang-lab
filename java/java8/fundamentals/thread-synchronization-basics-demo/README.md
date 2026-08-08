# Thread Synchronization Basics Demo

## Feature
使用 `Thread`、`Runnable`、`synchronized` 和 `join` 保护共享计数器。

## Version & Status
JDK 8；`stable`。

## Background
多线程共享可变状态时，操作可能交错，导致丢失更新或主线程过早读取。

## Problem
多个 worker 同时递增同一计数器，结果必须稳定。

## Example
`SafeCounter.increment` 是同步临界区，`ThreadBasics` 启动并 join 所有 worker。

## Usage Scenario
理解线程生命周期、共享状态和最基本的 happens-before 边界。

## Limitations
示例不比较线程池、锁性能或无锁算法；生产代码应优先使用高层并发工具。

## Code Walkthrough
`start` 提交工作，`join` 等待完成，`synchronized` 保护读改写操作。

## Business Mapping
问题 → 并发更新丢失；特性 → intrinsic lock 与 join；收益 → 正确性边界清楚；风险/替代 → 复杂并发可使用 ExecutorService/CompletableFuture。

## Learning Resources
- [Concurrency Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/)（★★★★★，官方教程）
- [Thread API](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)（★★★★★，契约）
- [JavaGuide 并发](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文复习）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `ThreadSynchronizationBasicsDemo`。

## Verification
测试验证 4 个 worker 各递增 500 次后结果恒为 2,000。
