# Structured Concurrency (Java 25) Demo

## Feature
展示 Java 25 仍处于预览演进中的 Structured Concurrency。
## Version & Status
JDK 25；`pending_jdk25_verification`；预览能力，必须 `--enable-preview`。
## Background
并发子任务需要和请求生命周期一起取消、等待和传播异常。
## Problem
分散 Future 容易遗留未取消任务。
## Example
`ShutdownOnFailure` 聚合 profile 与 alerts 两个子任务。
## Usage Scenario
扇出读取、聚合 API 和并行校验。
## Limitations
预览 API 可能继续变化；限流、超时和下游容量仍需业务设计。
## Code Walkthrough
`fork`、`join`、`throwIfFailed` 构成完整作用域。
## Business Mapping
问题 → 并发失败传播不一致；特性 → StructuredTaskScope；收益 → 生命周期清晰；风险/替代 → 稳定基线可用 CompletableFuture。
## Learning Resources
- [JEP 505](https://openjdk.org/jeps/505)（★★★★★，Java 25 预览状态）
- [Dev.java Structured Concurrency](https://dev.java/learn/structured-concurrency/)（★★★★★，官方示例）
- [Inside Java](https://inside.java/tag/structured-concurrency/)（★★★★☆，演进追踪）
## Run
JDK 25 下执行 `mvn clean test`，并用 `java --enable-preview` 运行主类。
## Verification
`pending_jdk25_verification`；不能把 Java 21/25 预览版当稳定 API。
