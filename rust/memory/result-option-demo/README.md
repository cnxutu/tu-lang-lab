# Rust Result 与 Option Demo

## Feature

用 `Result` 表达可恢复错误，用 `Option` 表达值可能不存在。

## Background

Rust 将失败和缺失值放入类型，调用方必须显式选择传播、转换或处理策略。

## Problem

异常和空指针若没有清晰边界，会在远处才暴露根因。

## Example

`parse_port` 返回解析错误，`find_lesson` 返回可选课程。

## Usage Scenario

配置解析、数据库查询、文件读取和 API 边界。

## Limitations

类型表达不替代错误分类、日志和用户提示；错误链仍需设计。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：Recoverable Errors](https://doc.rust-lang.org/book/ch09-02-recoverable-errors-with-result.html) ★★★★★。
- [Rust Book：Option](https://doc.rust-lang.org/book/ch06-01-defining-an-enum.html) ★★★★★。
- [Rust By Example：Error handling](https://doc.rust-lang.org/rust-by-example/error.html) ★★★★☆。

## Code Walkthrough

中文注释说明 `Result` 的强制处理；测试覆盖错误和缺失两条边界。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：错误和缺失值语义混淆 → Result/Option → 编译器督促处理 → 复杂错误链需统一领域错误类型。

## Verification

安装 Rust 后执行 `cargo test`；当前机器未安装 Cargo。

## Run

```bash
cargo test
cargo run
```
