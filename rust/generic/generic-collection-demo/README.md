# Rust 泛型集合 Demo

## Feature

使用泛型函数处理不同元素类型的切片，并用 `Option` 表达空集合。

## Background

泛型让算法复用，同时保留编译期类型检查和单态化性能。

## Problem

为 `i32`、字符串等类型重复编写相同的“取首元素”逻辑会造成维护分叉。

## Example

`first<T>` 同时接受整数和字符串切片。

## Usage Scenario

集合工具、排序算法和数据管道的类型安全复用。

## Limitations

泛型约束过多会增加签名复杂度；跨动态类型边界时需要 trait object。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：Generic Types](https://doc.rust-lang.org/book/ch10-01-syntax.html) ★★★★★。
- [Rust Reference：Generics](https://doc.rust-lang.org/reference/items/generics.html) ★★★★☆。
- [Rustlings：Generics](https://github.com/rust-lang/rustlings) ★★★★★。

## Code Walkthrough

注释解释泛型约束的最小边界；测试用两种类型验证同一函数。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：相同算法适配多类型 → 泛型 → 复用且零运行时类型判断 → 动态插件边界改用 trait object。

## Verification

安装 Rust 后执行 `cargo test`；当前机器未安装 Cargo。

## Run

```bash
cargo test
cargo run
```
