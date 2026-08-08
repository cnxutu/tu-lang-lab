# 学习路线

本路线用于安排学习顺序；案例状态以 [Java 特性地图](java-feature-map.md) 为准。当前 Java 已创建 43 个独立 Maven Demo，其中 Java 8、17、21 与 JVM 案例已按目标 JDK 验证，Java 25 统一等待 JDK 25 本机验证。

## Phase 0：环境与约定

- 默认使用 JDK 17，并准备 JDK 8、21、25 的按需切换能力。
- 准备 Python、Rust、Node.js 与 pnpm 的本机开发环境。
- 阅读 [环境约定](environment-setup.md)，确认每类案例的独立运行方式。

## Phase 1：Java 核心语言演进

当前实施项：Java 8、17、21 的稳定/预览语言能力与 JVM 观察案例已形成完整首轮地图；Java 25 已完成源码、测试、POM 和文档骨架，状态固定为 `pending_jdk25_verification`。

1. Java 8：Lambda → 函数式接口 → Stream/Collector → Optional → CompletableFuture → Date-Time API。
2. Java 17：Record → Sealed Class → `instanceof`/switch 模式 → Text Block → HexFormat/RandomGenerator；预览案例用于理解演进边界。
3. Java 21：Virtual Thread → Record Pattern → Sequenced Collection → 稳定 Pattern switch → Structured Concurrency/Scoped Values/FFM 预览。
4. Java 25：先阅读版本演进表，再按稳定 → 预览 → 孵化顺序运行；未安装 JDK 25 前只做静态阅读。
5. 每个案例按 README 的 Learning Resources → Code Walkthrough → Business Mapping → Verification 顺序阅读。

## Phase 2：JVM 运行机制

- JVM Memory → ClassLoader → Bytecode → JIT → GC → JFR → Thread Dump，先观察再形成性能结论。

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
