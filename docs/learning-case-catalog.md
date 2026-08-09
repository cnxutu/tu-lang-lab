# K5 学习案例目录与前后置关系

## 如何使用

按“前置案例 → 当前案例 → 后续案例”顺序学习。每个案例都应完成四个动作：阅读 README 的 Background/Problem，运行 `Run` 命令，阅读中文注释与测试，最后回答 Business Mapping 和 Limitations 中的问题。

## Python

| 顺序 | 前置 | 当前案例 | 后续 | 验证 |
| --- | --- | --- | --- | --- |
| 1 | 无 | [`syntax-basics-demo`](../python/python3-feature/syntax-basics-demo/) | decorator | `python -m unittest discover -s tests` |
| 2 | syntax | [`decorator-demo`](../python/python3-feature/decorator-demo/) | generator | 同上 |
| 3 | decorator | [`generator-iterator-demo`](../python/python3-feature/generator-iterator-demo/) | type-hint | 同上 |
| 4 | generator | [`type-hint-demo`](../python/python3-feature/type-hint-demo/) | dataclass | 同上 |
| 5 | type-hint | [`dataclass-demo`](../python/python3-feature/dataclass-demo/) | collections | 同上 |
| 6 | dataclass | [`collections-itertools-demo`](../python/standard-library/collections-itertools-demo/) | context-manager | 同上 |
| 7 | collections | [`context-manager-demo`](../python/python3-feature/context-manager-demo/) | pathlib/json | 同上 |
| 8 | context-manager | [`pathlib-json-demo`](../python/python3-feature/pathlib-json-demo/) | async | 同上 |
| 9 | pathlib/json | [`async-await-demo`](../python/python3-feature/async-await-demo/) | pattern-matching | 同上 |
| 10 | async | [`pattern-matching-demo`](../python/python3-feature/pattern-matching-demo/) | GIL/memory | 同上 |
| 11 | pattern-matching | [`gil-memory-demo`](../python/performance/gil-memory-demo/) | 性能观察专题 | 同上 |

## Rust

| 顺序 | 前置 | 当前案例 | 后续 | 验证 |
| --- | --- | --- | --- | --- |
| 1 | 无 | [`hello-types-demo`](../rust/basic/hello-types-demo/) | ownership | `cargo test` |
| 2 | types | [`ownership-move-demo`](../rust/ownership/ownership-move-demo/) | borrowing | `cargo test` |
| 3 | ownership | [`borrowing-slice-demo`](../rust/borrowing/borrowing-slice-demo/) | lifetime | `cargo test` |
| 4 | borrowing | [`lifetime-annotation-demo`](../rust/lifetime/lifetime-annotation-demo/) | Result/Option | `cargo test` |
| 5 | lifetime | [`result-option-demo`](../rust/memory/result-option-demo/) | Trait | `cargo test` |
| 6 | Result/Option | [`trait-generic-demo`](../rust/trait/trait-generic-demo/) | generic collection | `cargo test` |
| 7 | trait | [`generic-collection-demo`](../rust/generic/generic-collection-demo/) | async | `cargo test` |
| 8 | generic | [`async-syntax-demo`](../rust/async/async-syntax-demo/) | Tokio/运行时专题 | `cargo test` |

Rust 当前统一标记 `toolchain_pending_verification`，因为本机尚未安装 Cargo；安装后按表逐项验证，不把静态复核当成编译通过。

## JavaScript、Web API 与 TypeScript

| 顺序 | 前置 | 当前案例 | 后续 | 验证 |
| --- | --- | --- | --- | --- |
| 1 | 无 | [`es-module-demo`](../frontend/javascript/es-module-demo/) | closure | `pnpm test` |
| 2 | module | [`closure-prototype-demo`](../frontend/javascript/closure-prototype-demo/) | prototype | `pnpm test` |
| 3 | closure | [`prototype-chain-demo`](../frontend/javascript/prototype-chain-demo/) | Promise | `pnpm test` |
| 4 | prototype | [`promise-async-demo`](../frontend/javascript/promise-async-demo/) | event loop | `pnpm test` |
| 5 | Promise | [`event-loop-demo`](../frontend/web-api/event-loop-demo/) | Fetch cancel | `pnpm test` |
| 6 | event loop | [`fetch-abort-demo`](../frontend/web-api/fetch-abort-demo/) | DOM event | `pnpm test` |
| 7 | Fetch | [`dom-event-demo`](../frontend/web-api/dom-event-demo/) | TypeScript | `pnpm test` + 浏览器打开 HTML |
| 8 | DOM | [`type-system-generics-demo`](../frontend/typescript/type-system-generics-demo/) | Utility Types | `pnpm typecheck` |
| 9 | generics | [`utility-type-demo`](../frontend/typescript/utility-type-demo/) | decorator | `pnpm typecheck` |
| 10 | utility types | [`decorator-demo`](../frontend/typescript/decorator-demo/) | advanced types | `pnpm typecheck` |
| 11 | decorator | [`advanced-type-demo`](../frontend/typescript/advanced-type-demo/) | 运行时 schema | `pnpm typecheck` |

## Java 主线

Java 的案例数量较多，使用 [Java 版本演进指南](java-version-evolution-guide.md) 选择阶段，再从 [Java 特性地图](java-feature-map.md) 进入具体 Demo；JDK 25 案例仍保持 `pending_jdk25_verification`。

## 完整性检查清单

- 每个案例有独立工程文件：`pom.xml`、`pyproject.toml`、`Cargo.toml` 或 `package.json`。
- 每个案例有源代码、测试入口和独立 README。
- README 固定包含 Feature、Background、Problem、Example、Usage Scenario、Limitations、Version & Status、Learning Resources、Code Walkthrough、Business Mapping、Verification、Run。
- 进入下一个案例前，先能解释当前案例的收益和限制，而不是只记住 API 名称。
