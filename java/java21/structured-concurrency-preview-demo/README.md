# Structured Concurrency (Java 21 Preview) Demo

## Feature

Java 21 预览 `StructuredTaskScope`（[JEP 453](https://openjdk.org/jeps/453)），把一组相关并发任务当作一个有生命周期的工作单元管理。

## Version & Status

- JDK: 21
- Status: preview；构建、测试和运行需要 `--enable-preview`。

## Background

用 `Future` 分散提交的任务，常使取消、等待和异常处理脱离请求的生命周期，排查时很难知道哪些任务属于同一次操作。

## Problem

组装一个页面或 API 响应时，用户资料与未读数可并行读取；若其中一个关键读取失败，其他读取不应继续消耗资源。

## Example

`DashboardLoader` 在 `ShutdownOnFailure` 作用域内分叉两个任务。`join().throwIfFailed()` 既等待任务，也把失败传播到调用者；try-with-resources 负责结束作用域。

## Code Walkthrough

- `scope.fork` 声明与当前请求相关的子任务。
- `ShutdownOnFailure` 是失败策略，而不是通用线程池。
- `Subtask.get()` 只在成功 join 后读取结果。

## Business Mapping

问题 → 聚合多个远程/阻塞调用时，取消和异常传播容易遗漏；特性 → Structured Concurrency；收益 → 生命周期、失败与可观测性按请求边界收拢；风险/替代 → Java 21 仍是预览特性，稳定生产基线可使用 `CompletableFuture` 并显式设计超时与取消。

## Usage Scenario

适合扇出后聚合的读取流程，例如资料页、报价聚合或批量校验。真实系统还必须加超时、限流和下游连接池容量控制。

## Limitations

- API 为预览，后续 JDK 可能修改；不要把它当成 Java 21 的长期稳定 API。
- 它不替代并发度限制，也不能让 CPU 密集型任务更快。

## Learning Resources

- 官方设计文档：[JEP 453](https://openjdk.org/jeps/453)（★★★★★，理解任务作用域与取消语义）
- 官方教程：[Dev.java — Structured Concurrency](https://dev.java/learn/structured-concurrency/)（★★★★★，适合按示例实践）
- 社区延伸：[Inside Java — Structured Concurrency](https://inside.java/tag/structured-concurrency/)（★★★★☆，持续跟踪预览演进）

## Run

```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn package
java --enable-preview -cp target/classes com.tu.languagelab.java21.structuredconcurrency.StructuredConcurrencyDemo
```

## Verification

Maven 编译器和 Surefire 均已配置 `--enable-preview`。主类输出 `u-100:3`。
