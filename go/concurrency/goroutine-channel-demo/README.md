# Go Goroutine 与 Channel Demo

## Feature

使用 goroutine 并发计算，使用 channel 收集结果。

## Background

Go 把轻量协程和通信原语作为并发编程基础，强调“通过通信共享”。

## Problem

直接共享可变内存容易产生数据竞争和锁边界错误。

## Example

`SquareAll` 为每个输入启动任务，通过有缓冲 channel 收集平方结果。

## Usage Scenario

并行 I/O、工作队列和有限 fan-out/fan-in。

## Limitations

任务数量、取消、错误传播和 backpressure 需要显式设计；并发不等于 CPU 性能必然提升。

## Version & Status

Go 1.0+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Tour：Goroutines](https://go.dev/tour/concurrency/1) ★★★★★。
- [Go Tour：Channels](https://go.dev/tour/concurrency/2) ★★★★★。
- [Go Blog：Pipelines](https://go.dev/blog/pipelines) ★★★★★。

## Code Walkthrough

中文注释说明 goroutine 与 channel 的职责；测试对非确定顺序先排序再断言。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：独立任务需要并发汇聚 → goroutine/channel → 清晰 fan-out/fan-in → 生产代码必须补取消、错误和容量控制。

## Verification

安装 Go 后执行 `go test ./...`，建议额外执行 `go test -race ./...`。

## Run

```bash
go test ./...
go test -race ./...
```
