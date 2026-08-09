# Rust 基础类型与枚举 Demo

## Feature

使用结构化的枚举表示有限状态，并通过 `match` 消费结果。

## Background

Rust 在类型层表达状态，减少用魔法字符串和整数传递状态的歧义。

## Problem

输入校验、订单状态、解析阶段等场景需要让非法状态不能被悄悄忽略。

## Example

`src/main.rs` 的 `ParseState` 演示枚举与模式匹配。

## Usage Scenario

适合解析器、工作流状态机和 API 响应状态建模。

## Limitations

枚举只解决状态表达；复杂状态机仍需明确迁移规则。

## Version & Status

Rust stable / `toolchain_pending_verification`（本机未安装 `rustc`/`cargo`）。

## Learning Resources

- [Rust Book：Enums and Pattern Matching](https://doc.rust-lang.org/book/ch06-00-enums.html) ★★★★★ 官方系统教程。
- [Rust Reference：Types](https://doc.rust-lang.org/reference/types.html) ★★★★☆ 语义细节。
- [Rust By Example：Enums](https://doc.rust-lang.org/rust-by-example/custom_types/enum.html) ★★★★☆ 短例上手。

## Code Walkthrough

`classify` 返回 `ParseState`，测试验证空输入分支；中文注释解释了为什么用枚举表达状态。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：状态值容易漂移 → 枚举 → 编译器帮助覆盖分支 → 状态数量巨大时考虑领域状态机库。

## Verification

安装 Rust 后执行 `cargo test` 与 `cargo run`；当前仅完成源码静态复核。

## Run

```bash
cargo test
cargo run
```
