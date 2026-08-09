# Rust 学习区

本目录围绕 Rust 的语言设计展开，包括类型、所有权、借用、生命周期、Trait、泛型、异步语法和内存安全，不引入业务框架。

## 推荐顺序

`hello-types-demo` → `ownership-move-demo` → `borrowing-slice-demo` → `lifetime-annotation-demo` → `result-option-demo` → `trait-generic-demo` → `generic-collection-demo` → `async-syntax-demo`。

每个子目录都是独立 Cargo crate。当前 Windows 环境未安装 `rustc`/`cargo`，案例标记为 `toolchain_pending_verification`，安装 Rust 后逐目录执行 `cargo test`。

完整前置/后续关系见 [`docs/learning-case-catalog.md`](../docs/learning-case-catalog.md)。
