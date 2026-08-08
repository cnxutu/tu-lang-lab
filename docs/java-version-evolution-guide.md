# Java 版本演进与学习顺序

本指南只梳理 K5 当前关注的 Java 8、17、21、25。它用于理解“为什么学习下一版”，不是完整发布说明；精确 API 和预览状态以 [OpenJDK JEP Index](https://openjdk.org/jeps/0) 为准。更完整的跨代背景见 [Java 跨代故事线](java-cross-generation-story.md)。

## 先理解版本基线

| 基线 | 相对前一学习基线的主变化 | 学习价值 |
| --- | --- | --- |
| Java 8 | 函数式表达、Stream、Optional、CompletableFuture、`java.time` | 从命令式集合处理转向可组合的行为与数据流。 |
| Java 17 | Record、Sealed Class、文本块、switch expression、模式匹配相关能力 | 用类型系统表达数据模型、有限状态和更清晰的分支。部分能力首次发布早于 17，但以 17 作为稳定 LTS 学习基线。 |
| Java 21 | Virtual Thread、Record Pattern、switch 模式匹配、Sequenced Collection | 把高并发阻塞 I/O 和数据解构带回直接、同步的代码形态。 |
| Java 25 | Scoped Values、模块导入、紧凑源文件、构造器增强，以及 JVM/JFR/GC 演进 | 学习语言简化、上下文传递与运行时可观测性；本机尚未安装 JDK 25，案例均待验证。 |

## 推荐学习路径

### 第一段：先建立 Java 8 的组合能力

1. [面向对象](../java/java8/fundamentals/object-oriented-basics-demo/README.md) → [集合](../java/java8/fundamentals/collection-basics-demo/README.md) → [泛型](../java/java8/fundamentals/generics-basics-demo/README.md)：先建立对象、数据结构和编译期类型安全。
2. [异常](../java/java8/fundamentals/exception-basics-demo/README.md) → [文件 IO](../java/java8/fundamentals/file-io-basics-demo/README.md) → [HTTP 网络](../java/java8/fundamentals/http-network-basics-demo/README.md)：理解程序如何面对外部不确定性。
3. [线程同步](../java/java8/fundamentals/thread-synchronization-basics-demo/README.md)：先掌握共享状态和等待边界，再进入高层并发 API。
4. [Lambda 与方法引用](../java/java8/lambda-method-reference-demo/README.md) → [函数式接口与默认方法](../java/java8/functional-interface-default-method-demo/README.md)：理解行为参数化和接口演进。
5. [Stream 与 Collector](../java/java8/stream-collector-demo/README.md) → [Optional](../java/java8/optional-api-boundary-demo/README.md) → [CompletableFuture](../java/java8/completable-future-composition-demo/README.md) → [Date-Time API](../java/java8/java-time-api-demo/README.md)：依次处理数据流、缺失值、异步组合和时间语义。

### 第二段：用 Java 17 改善领域建模

1. [Record](../java/java17/record-value-object-demo/README.md)：先掌握值对象、DTO 和配置快照的不可变语义。
2. [Sealed Class](../java/java17/sealed-hierarchy-demo/README.md)：再学习有限状态或事件类型，避免任意子类破坏穷尽性。
3. [Switch Expression](../java/java17/switch-expression-demo/README.md) 与 [Pattern Matching](../java/java17/pattern-switch-preview-demo/README.md)：最后把类型分派变成可检查的表达式。
4. [Text Block](../java/java17/text-block-demo/README.md)、[`HexFormat`](../java/java17/hex-format-demo/README.md)、[`RandomGenerator`](../java/java17/random-generator-demo/README.md)：作为标准库与语法便利性专题单独学习。

### 第三段：用 Java 21 理解并发与解构

1. [Virtual Thread](../java/java21/virtual-thread-demo/README.md)：先掌握大量阻塞 I/O 的线程模型和资源边界。
2. [Record Pattern](../java/java21/record-pattern-demo/README.md)、[switch 模式匹配](../java/java21/pattern-switch-demo/README.md)、[Sequenced Collection](../java/java21/sequenced-collection-demo/README.md)：理解类型和集合 API 的一致性演进。
3. [Structured Concurrency](../java/java21/structured-concurrency-preview-demo/README.md)、[Scoped Values](../java/java21/scoped-values-preview-demo/README.md)、[FFM API](../java/java21/foreign-function-preview-demo/README.md)：这些是预览专题，必须在稳定能力之后学习。
4. [Unnamed Patterns](../java/java21/unnamed-patterns-preview-demo/README.md)：最后学习如何表达“匹配但不读取组件”。

### 第四段：进入 JVM 与 Java 25

1. [Bytecode](../java/jvm/bytecode-inspection-demo/README.md)：从源码到 class 文件建立观察证据。
2. ClassLoader、JIT、GC、JFR、Thread Dump：逐步扩大到运行时诊断。
3. Java 25：安装目标 JDK 后，先学习稳定 API，再进入 preview、incubator、experimental 专题。

## 如何把特性和业务背景对应起来

| 你遇到的问题 | 优先学习 | 不要误解为 |
| --- | --- | --- |
| 规则经常替换 | Lambda/函数式接口 | Lambda 能替代所有业务对象。 |
| 数据需要稳定比较和传递 | Record | Record 能替代具有生命周期的实体。 |
| 大量请求等待 I/O | Virtual Thread | 虚拟线程会加速 CPU 密集计算。 |
| 多任务需要统一失败与取消 | CompletableFuture/Structured Concurrency | 并发 API 自动解决资源限流。 |
| 线上行为难以解释 | Bytecode/JFR/GC | 单次观察等于性能结论。 |

详细的“业务问题 → 特性 → 风险 → Demo”见 [Java 业务场景地图](java-business-scenario-map.md)，完整目录见 [Java 特性地图](java-feature-map.md)。
