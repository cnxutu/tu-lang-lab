# Rust Async 语法 Demo

## Feature

展示 `async fn` 生成 Future 的语法形态，不绑定具体异步运行时。

## Background

Rust 将异步执行器与语言语法分离，让生态可以按场景选择运行时。

## Problem

网络和文件 I/O 需要在等待期间让出线程，避免一个阻塞任务占满执行资源。

## Example

`greeting` 返回隐式 Future；本例不引入第三方 runtime。

## Usage Scenario

适合作为 Tokio、async-std 等运行时学习前的语法入口。

## Limitations

没有 executor 时 Future 不会自动执行；生产项目要明确 runtime、取消和背压策略。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Async Book](https://rust-lang.github.io/async-book/) ★★★★★ 官方异步教程。
- [Rust Book：Async and Await](https://doc.rust-lang.org/book/ch17-00-async-await.html) ★★★★★。
- [Tokio Tutorial](https://tokio.rs/tokio/tutorial) ★★★★★ 社区主流运行时实践。

## Code Walkthrough

注释强调 `async fn` 只生成惰性 Future；测试验证函数可以被声明和构造。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：大量 I/O 等待 → async/Future → 高并发少线程 → CPU 密集任务需线程池，运行时选择影响调度与可观测性。

## Verification

安装 Rust 后执行 `cargo test`；本机没有 Cargo，因此未运行。

## Run

```bash
cargo test
cargo run
```
