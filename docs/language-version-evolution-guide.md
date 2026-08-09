# Python、JavaScript、TypeScript 与 Rust 版本演进背景

这份表回答“为什么先读这些 Demo”，不追求列出所有版本特性；准确语义以各语言规范和官方发行说明为准。

| 语言阶段 | 相对上一阶段的关键变化 | 推荐 Demo | 背景与业务价值 |
| --- | --- | --- | --- |
| Python 3.5+ | `async`/`await`、类型标注逐步成熟 | `async-await-demo`、`type-hint-demo` | I/O 并发和大型代码库契约需要可读、可检查的表达 |
| Python 3.7+ | dataclass、asyncio API 更完整 | `dataclass-demo`、`async-await-demo` | DTO/配置样板减少，异步任务组合更稳定 |
| Python 3.10+ | `match` 结构化模式匹配 | `pattern-matching-demo` | 解析消息和有限状态分支更接近数据形状 |
| ECMAScript 2015 | `let/const`、箭头函数、模块、Promise、class | `es-module-demo`、`closure-prototype-demo` | 从全局脚本走向模块化和词法作用域 |
| ECMAScript 2017+ | `async/await`、对象与数组能力持续增强 | `promise-async-demo` | 异步业务流程可按顺序阅读，同时保留 Promise 组合能力 |
| Web 平台现代 API | Fetch、AbortController、标准化事件循环 | `fetch-abort-demo`、`event-loop-demo` | 请求取消、超时和 UI 调度成为平台能力 |
| TypeScript 2.x–5.x | 泛型、联合收窄、Utility Types、严格模式 | `type-system-generics-demo`、`utility-type-demo` | 在不改变 JS 运行时的前提下提前发现契约错误 |
| Rust 2018/2021 editions | 模块路径、迭代器与 async 生态逐步稳定 | `hello-types-demo`、`async-syntax-demo` | 现代工程默认更清晰，异步运行时保持生态可选择 |

## 建议阅读动作

先看这一表理解问题背景，再进入各语言地图；每完成一个 Demo，都记录“它替代了什么旧做法、在哪些场景不应使用”。版本名称只代表学习基线，不意味着所有旧版本都可直接运行最新语法。
