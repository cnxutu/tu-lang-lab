# Rust 借用与切片 Demo

## Feature

使用 `&mut String` 修改内容，再用 `&str` 只读借用。

## Background

借用让数据可以临时共享，同时由编译器检查别名与可变性规则。

## Problem

函数若总是接管所有权，会让组合和复用变得笨重。

## Example

`title_case` 使用可变借用，`word_count` 使用不可变切片。

## Usage Scenario

文本解析、序列化和校验函数通常只需要借用输入。

## Limitations

同一作用域不能同时存在冲突的可变和不可变借用。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：References and Borrowing](https://doc.rust-lang.org/book/ch04-02-references-and-borrowing.html) ★★★★★。
- [Rust Reference：References](https://doc.rust-lang.org/reference/types/pointer.html) ★★★★☆。
- [Rustlings](https://github.com/rust-lang/rustlings) ★★★★★ 练习丰富。

## Code Walkthrough

先结束可变借用，再创建只读借用，体现借用检查器要求的生命周期顺序。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：工具函数不应复制大对象 → 借用 → 零拷贝组合 → 跨线程共享需 `Arc` 与同步原语。

## Verification

安装 Rust 后执行 `cargo test`；当前未安装 Cargo。

## Run

```bash
cargo test
cargo run
```
