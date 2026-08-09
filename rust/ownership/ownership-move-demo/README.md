# Rust 所有权与 Move Demo

## Feature

展示 `String` 的所有权移动与作用域回收。

## Background

Rust 通过编译期所有权规则实现无垃圾回收器的内存安全。

## Problem

手工管理共享内存容易出现 double free、悬垂引用和数据竞争。

## Example

`consume` 接收 `String` 的所有权，调用后原变量不能再次使用。

## Usage Scenario

适合文件缓冲区、请求体和大对象的明确所有权转移。

## Limitations

需要共享时应使用借用、`Rc` 或 `Arc`，盲目 `clone` 会产生复制成本。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：Ownership](https://doc.rust-lang.org/book/ch04-00-understanding-ownership.html) ★★★★★ 核心章节。
- [Rust Reference：Ownership](https://doc.rust-lang.org/reference/ownership.html) ★★★★☆ 规则定义。
- [Comprehensive Rust：Ownership](https://google.github.io/comprehensive-rust/ownership.html) ★★★★☆ 练习导向。

## Code Walkthrough

`consume` 接收 `String` 而非 `&str`，故调用点发生 move；注释说明了安全边界。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：缓冲区生命周期不清 → 所有权 move → 释放时机可推导 → 共享场景改用借用或 `Arc`。

## Verification

安装 Rust 后在目录执行 `cargo test`；本机缺少 Cargo，未执行。

## Run

```bash
cargo test
cargo run
```
