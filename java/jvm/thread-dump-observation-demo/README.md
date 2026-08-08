# JVM Thread Dump Observation Demo

## Feature
在进程内读取线程栈快照，并说明如何与外部线程转储命令配合。

## Version & Status
- JDK 17；`Thread.getAllStackTraces` 为 stable API。

## Background
死锁、阻塞和线程耗尽通常需要线程状态、栈和锁关系的同一时刻证据。

## Problem
只看线程数量无法解释“为什么不动”，必须保留栈快照和现场参数。

## Example
`threadCount` 返回当前 JVM 可见线程快照数量。

## Code Walkthrough
示例刻意不打印完整栈，避免提交机器路径和敏感信息；外部 `jcmd` 更适合现场采集。

## Business Mapping
问题 → 请求卡顿或线程池耗尽；特性 → thread dump；收益 → 从 RUNNABLE/BLOCKED/WAITING 状态找线索；风险/替代 → 快照有时间窗口，需结合指标和 JFR。

## Usage Scenario
线程泄漏教学、阻塞诊断和运行手册演练。

## Limitations
进程内 API 不包含所有 jcmd 诊断信息，也不能保证快照完全一致。

## Learning Resources
- [Thread API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html)（★★★★★，官方契约）
- [jcmd 文档](https://docs.oracle.com/en/java/javase/17/docs/specs/man/jcmd.html)（★★★★★，现场命令）
- [JavaGuide JVM](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文排查索引）

## Run
`mvn clean test`；执行主类；现场可用 `jcmd <pid> Thread.print`，不要把真实 PID 写入文档。

## Verification
验证 JDK 17、OS、JVM 参数、观察工具与命令；仅提交可复现步骤，不提交大日志。
