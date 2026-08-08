# Virtual Thread Demo

## Feature

Java 21 的 Virtual Thread 和 `Executors.newVirtualThreadPerTaskExecutor()`。

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
