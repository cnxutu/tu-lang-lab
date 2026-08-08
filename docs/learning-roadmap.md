# 学习路线

本路线用于安排学习顺序，不代表已经实现或验证了对应案例。

## Phase 0：环境与约定

- 默认使用 JDK 17，并准备 JDK 8、21、25 的按需切换能力。
- 准备 Python、Rust、Node.js 与 pnpm 的本机开发环境。
- 阅读 [环境约定](environment-setup.md)，确认每类案例的独立运行方式。

## Phase 1：Java 核心语言演进

1. Java 8：Lambda、函数式接口、Stream、Optional、CompletableFuture、Date-Time API。
2. Java 17：Record、Sealed Class、文本块、switch expression 与模式匹配相关能力。
3. Java 21：Virtual Thread、Record Pattern、Sequenced Collection、模式匹配增强；预览特性单独标注。
4. Java 25：按实际需要补充稳定特性与版本差异案例。

## Phase 2：JVM 运行机制

- JVM 内存模型与对象生命周期。
- ClassLoader 与类加载过程。
- GC、JIT、字节码与诊断工具。

## Phase 3：Python 语言能力

- 语法、装饰器、生成器、迭代器、上下文管理器与类型标注。
- Async/Await、模式匹配、dataclass、标准库与性能观察。
- GIL 与内存模型只在可复现实验基础上记录结论。

## Phase 4：Rust 语言设计

- 所有权、借用、生命周期与类型系统。
- Trait、泛型、async 与内存安全模型。

## Phase 5：前端语言与浏览器运行时

- JavaScript 的 ES6+、Promise、异步、闭包、原型与模块。
- TypeScript 的类型系统、泛型、装饰器、Utility Type 与高级类型。
- Web API、DOM 与事件循环。

框架生态不属于本路线，应在独立的 `framework-lab` 中维护。
