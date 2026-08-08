# Virtual Thread Demo

## Feature

Java 21 的 Virtual Thread 和 `Executors.newVirtualThreadPerTaskExecutor()`。

## Version & Status

JDK 21，`stable`。

## Background

平台线程与操作系统线程绑定，数量大时会带来显著内存和调度成本。虚拟线程允许大量以阻塞 I/O 为主的任务保留直观的同步控制流。

## Problem

如何为一组独立任务创建一个虚拟线程执行器，并以稳定顺序收集每个任务的结果。

## Example

`VirtualThreadTasks.collectTaskResults(4)` 为四个任务分别提交虚拟线程，记录 `Thread.currentThread().isVirtual()`，再按任务编号排序输出。

## Usage Scenario

适合大量、主要等待网络或其他阻塞 I/O 的独立任务。生产代码仍应按具体资源使用连接池、信号量或限流，而不是池化虚拟线程。

## Limitations

本案例不是性能基准，不说明 CPU 密集任务会受益，也不使用 Structured Concurrency 等预览 API。遇到可疑 pinning 时，可用 JFR 或 `-Djdk.tracePinnedThreads=full` 进一步观察。

## Learning Resources

- 官方规范：[JEP 444: Virtual Threads](https://openjdk.org/jeps/444)。
- 官方教程：[Dev.java Virtual Threads](https://dev.java/learn/new-features/virtual-threads/)。
- 延伸阅读：[Foojay Virtual Threads](https://foojay.io/pedia/virtual-threads/)。

## Code Walkthrough

从 `VirtualThreadDemo.main` 进入，查看 `collectTaskResults` 创建的虚拟线程执行器、任务提交、`Future.get` 收集和最终排序。

## Business Mapping

问题：大量请求等待远程 I/O 时，平台线程容易成为资源瓶颈。特性：一个任务对应一个虚拟线程。收益：保持同步控制流并提高 I/O 并发承载。风险：CPU 密集任务、外部资源限额和 pinning 仍需单独治理。

## Verification

`VirtualThreadTasksTest` 验证任务数、稳定顺序和 `Thread.isVirtual()`；主程序验证确定性统计输出。

## Run

在 macOS 或 WSL2 中切换到 JDK 21 后运行：

```bash
export JAVA_HOME=/path/to/jdk21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
java -cp target/classes com.tu.languagelab.java21.virtualthreads.VirtualThreadDemo
```

预期输出：

```text
completed=4
virtualThreads=4
taskIds=[1, 2, 3, 4]
```
