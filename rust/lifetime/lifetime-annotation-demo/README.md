# Rust 生命周期标注 Demo

## Feature

用生命周期参数描述多个引用之间的有效期关系。

## Background

生命周期是借用检查器证明引用安全的静态信息，不是运行时对象。

## Problem

返回引用时，编译器必须知道它不会指向已经释放的数据。

## Example

`longest<'a>` 返回两个输入切片中更长者，并保证返回期不超出输入交集。

## Usage Scenario

解析器、缓存视图和零拷贝字符串处理常需返回输入的子切片。

## Limitations

标注不能延长真实数据寿命；复杂结构可能需要重新设计所有权。

## Version & Status

Rust stable / `toolchain_pending_verification`。

## Learning Resources

- [Rust Book：Validating References with Lifetimes](https://doc.rust-lang.org/book/ch10-03-lifetime-syntax.html) ★★★★★。
- [Rust Reference：Lifetime parameters](https://doc.rust-lang.org/reference/lifetime-elision.html) ★★★★☆。
- [The Rustonomicon](https://doc.rust-lang.org/nomicon/) ★★★★☆ 深入不安全边界。

## Code Walkthrough

函数签名中的 `'a` 把输入和输出引用关联起来；中文注释强调它表达约束而非延寿。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：解析结果不想复制 → 生命周期 → 零拷贝视图 → 所有权复杂时返回拥有数据的 `String`。

## Verification

安装 Rust 后执行 `cargo test`；本机未安装 Cargo。

## Run

```bash
cargo test
cargo run
```
