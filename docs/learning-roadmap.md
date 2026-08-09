# 学习路线

本路线用于安排学习顺序；Java、Python、Rust 与 Frontend 分别由各自地图维护。当前 Java 已创建 50 个独立 Maven Demo；Python 9 个案例、Rust 6 个案例、Frontend 7 个案例已加入首批学习路径。

## Phase 0：环境与约定

- 默认使用 JDK 17，并准备 JDK 8、21、25 的按需切换能力。
- 准备 Python、Rust、Node.js 与 pnpm 的本机开发环境。
- 阅读 [环境约定](environment-setup.md)，确认每类案例的独立运行方式。

## Phase 1：Java 核心语言演进

当前实施项：Java 8 已增加从面向对象到网络和线程同步的基础入门层；Java 8、17、21 的稳定/预览语言能力与 JVM 观察案例已形成完整首轮地图；Java 25 已完成源码、测试、POM 和文档骨架，状态固定为 `pending_jdk25_verification`。

1. Java 8：Lambda → 函数式接口 → Stream/Collector → Optional → CompletableFuture → Date-Time API。
2. Java 17：Record → Sealed Class → `instanceof`/switch 模式 → Text Block → HexFormat/RandomGenerator；预览案例用于理解演进边界。
3. Java 21：Virtual Thread → Record Pattern → Sequenced Collection → 稳定 Pattern switch → Structured Concurrency/Scoped Values/FFM 预览。
4. Java 25：先阅读版本演进表，再按稳定 → 预览 → 孵化顺序运行；未安装 JDK 25 前只做静态阅读。
5. 每个案例按 README 的 Learning Resources → Code Walkthrough → Business Mapping → Verification 顺序阅读。

## Phase 2：JVM 运行机制

- JVM Memory → ClassLoader → Bytecode → JIT → GC → JFR → Thread Dump，先观察再形成性能结论。

## Phase 3：Python 语言能力

- 按 [Python 学习地图](python-feature-map.md) 依次完成语法、装饰器、生成器、类型、dataclass、资源管理、异步和模式匹配。
- 本机 Python 3.13 已通过 9 个案例的 `unittest`；后续再补 GIL、内存模型和性能观察。
- GIL 与内存模型只在可复现实验基础上记录结论。

## Phase 4：Rust 语言设计

- 按 [Rust 学习地图](rust-feature-map.md) 完成枚举、所有权、借用、生命周期、Trait/泛型和 async。
- 当前缺少 `rustc`/`cargo`，状态为 `toolchain_pending_verification`，安装工具链后再执行 Cargo 验证。

## Phase 5：前端语言与浏览器运行时

- 按 [Frontend 学习地图](frontend-feature-map.md) 完成 JavaScript 模块、闭包、Promise，再学习 Web API 事件循环和 Fetch 取消，最后进入 TypeScript 泛型与 Utility Types。
- Node 22 案例已通过内置测试，TypeScript 案例已通过 `tsc --noEmit`。

## Phase 6：C 与 Go 对照学习

- 按 [C 地图](c-feature-map.md) 学习类型、指针、结构体、字符串、文件 I/O 和预处理器。
- 再按 [Go 地图](go-feature-map.md) 学习 slice/map、interface/error、泛型、goroutine/channel 和 context/HTTP。
- 使用 [Go 与 C 学习路线](go-c-learning-roadmap.md) 对照内存管理、并发和构建阶段；当前两套工具链均待安装后验证。

框架生态不属于本路线，应在独立的 `framework-lab` 中维护。
