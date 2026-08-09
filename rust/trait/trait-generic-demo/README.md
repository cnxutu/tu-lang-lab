# Rust Trait 与泛型 Demo

## Feature

通过 trait 定义能力，再用 trait bound 约束泛型函数。

## Background

Rust 使用 trait 表达共享行为，不依赖传统继承层次。

## Problem

重复为不同类型编写相同算法会降低复用性和静态检查能力。

## Example

`Summarize` 定义摘要能力，`print_summary` 接收任意实现者。

## Usage Scenario

日志格式化、序列化能力和可插拔算法的静态抽象。

## Limitations

泛型单态化可能增加编译体积；需要运行时异构集合时考虑 trait object。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：Traits](https://doc.rust-lang.org/book/ch10-02-traits.html) ★★★★★。
- [Rust Reference：Traits](https://doc.rust-lang.org/reference/items/traits.html) ★★★★☆。
- [Effective Rust](https://www.lurklurk.org/effective-rust/) ★★★★☆ 实践建议。

## Code Walkthrough

`impl Summarize for Lesson` 提供具体行为，泛型函数通过 bound 调用它；注释说明了能力约束。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：多类型共享协议 → trait/泛型 → 编译期复用 → 需要插件动态加载时使用 trait object 或进程边界。

## Verification

安装 Rust 后执行 `cargo test`；当前仅静态复核。

## Run

```bash
cargo test
cargo run
```
