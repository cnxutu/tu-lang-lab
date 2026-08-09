# Rust 学习地图

| 状态 | 能力 | Demo | 适合解决的问题 |
| --- | --- | --- | --- |
| stable | 枚举与模式匹配 | [`hello-types-demo`](../rust/basic/hello-types-demo/) | 显式建模有限状态 |
| stable | Ownership/Move | [`ownership-move-demo`](../rust/ownership/ownership-move-demo/) | 编译期管理资源寿命 |
| stable | Borrowing/Slice | [`borrowing-slice-demo`](../rust/borrowing/borrowing-slice-demo/) | 零拷贝读取与修改 |
| stable | Lifetime | [`lifetime-annotation-demo`](../rust/lifetime/lifetime-annotation-demo/) | 返回安全引用视图 |
| stable | Trait/Generic | [`trait-generic-demo`](../rust/trait/trait-generic-demo/) | 静态抽象与代码复用 |
| stable | Generic Collection | [`generic-collection-demo`](../rust/generic/generic-collection-demo/) | 多类型共享集合算法 |
| stable | Result/Option/Memory Safety | [`result-option-demo`](../rust/memory/result-option-demo/) | 显式表达错误和缺失值 |
| stable | Async/Future | [`async-syntax-demo`](../rust/async/async-syntax-demo/) | I/O 等待期间让出执行权 |

当前状态统一为 `toolchain_pending_verification`：源码和 Cargo manifest 已准备好，待安装 Rust 后逐项执行 `cargo test`。
