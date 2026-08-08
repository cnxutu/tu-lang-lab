# JVM Memory Observation Demo

## Feature
通过 `Runtime` 读取 JVM 堆的 used、committed 和 max 快照。

## Version & Status
- JDK 17；stable API。

## Background
内存排查需要先区分 JVM 堆容量、当前使用量和上限，不能只看操作系统进程大小。

## Problem
没有基线时，容易把一次 GC 前后的瞬时数值误判为泄漏。

## Example
`MemorySnapshot.capture()` 计算 `totalMemory - freeMemory` 并打印快照。

## Code Walkthrough
关键观察点是 `Runtime.getRuntime()`；它描述 JVM 视角，不提供对象级 retained size。

## Business Mapping
问题 → 服务内存告警缺少 JVM 语义；特性 → Runtime 内存快照；收益 → 建立初步基线；风险/替代 → 精确对象分析应使用 JFR、堆转储或 MAT。

## Usage Scenario
启动检查、诊断实验和简单回归记录。

## Limitations
数值受 GC、堆扩展和 JVM 参数影响，不用于跨机器性能比较。

## Learning Resources
- [Runtime API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Runtime.html)（★★★★★，契约）
- [JVM Specification](https://docs.oracle.com/javase/specs/jvms/se17/html/)（★★★★★，运行时背景）
- [JavaGuide JVM](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文复习索引）

## Run
`mvn clean test`；`mvn package` 后执行 `java -cp target/classes com.tu.languagelab.jvm.memory.MemoryObservationDemo`。

## Verification
验证 JDK 17、OS、JVM 参数和命令；输出只作为本机快照，不记录路径或进程号。
