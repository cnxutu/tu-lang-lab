# Java 8 → 17 → 21 → 25：跨代问题、背景与学习故事

这份文档解释“为什么会出现下一代能力”，不把版本号当成孤立的特性清单。每个阶段都从上一阶段暴露的工程问题出发，再进入对应 Demo 验证。

## 第一幕：Java 8，把冗长的行为代码变成可组合能力

### 当时的问题

Java 8 之前，集合筛选、排序和异步回调大量依赖匿名内部类；日期时间 API 可变且时区语义分散；并发任务组合通常手写 Future 状态机。

### 引入的概念

- Lambda 与 Functional Interface：把“要执行的行为”作为参数传递。
- Stream 与 Collector：把集合处理表达成 map/filter/reduce 管道。
- `Optional`：让“可能没有值”成为返回值契约，而不是隐式 `null`。
- `CompletableFuture`：用阶段组合异步结果和异常传播。
- `java.time`：用不可变类型表达日期、时间、时区和间隔。

### K5 阅读顺序

先读 [面向对象](../java/java8/fundamentals/object-oriented-basics-demo/README.md)、[集合](../java/java8/fundamentals/collection-basics-demo/README.md)、[泛型](../java/java8/fundamentals/generics-basics-demo/README.md)，再读 [Lambda](../java/java8/lambda-method-reference-demo/README.md) → [Stream](../java/java8/stream-collector-demo/README.md) → [Optional](../java/java8/optional-api-boundary-demo/README.md) → [CompletableFuture](../java/java8/completable-future-composition-demo/README.md)。

## 第二幕：Java 9–17，类型系统开始表达领域边界

### 当时的问题

大型 Java 工程需要模块边界；DTO 和值对象有大量样板；开放继承使状态分支无法穷尽检查；多行 SQL/JSON 字符串可读性差。

### 引入的概念

- Module System：让依赖和可见性从约定变成声明。
- Record：为不可变数据载体提供值语义、访问器和结构化表达。
- Sealed Class：限制继承集合，让编译器辅助检查有限状态。
- Pattern Matching for `instanceof`、Switch Expression：减少 cast 和临时变量。
- Text Block、`HexFormat` 等标准库能力：降低表示层样板。

### K5 阅读顺序

先读 [Record](../java/java17/record-value-object-demo/README.md) → [Sealed](../java/java17/sealed-hierarchy-demo/README.md) → [`instanceof` Pattern](../java/java17/instanceof-pattern-demo/README.md) → [Switch Expression](../java/java17/switch-expression-demo/README.md)，再读 Text Block、HexFormat、RandomGenerator。

## 第三幕：Java 21，把并发和解构变成直接的语言/库表达

### 当时的问题

服务端大量阻塞 I/O 需要扇出请求，但平台线程数量和线程池模型限制并发；`instanceof` 链仍然重复访问 Record 组件；异步任务取消和失败传播经常脱离请求生命周期。

### 引入的概念

- Virtual Thread：让大量阻塞 I/O 任务以轻量线程表达，但不替代限流和连接池。
- Record Pattern：在匹配时直接解构 Record 组件。
- Pattern Matching for `switch`：对 sealed 状态做集中、可穷尽分派。
- Sequenced Collection：统一有序集合的首尾访问语义。
- Structured Concurrency、Scoped Values、FFM、Unnamed Patterns：以预览形式探索任务作用域、只读上下文、native 互操作和忽略组件表达。

### K5 阅读顺序

先读 [Virtual Thread](../java/java21/virtual-thread-demo/README.md) → [Record Pattern](../java/java21/record-pattern-demo/README.md) → [Pattern switch](../java/java21/pattern-switch-demo/README.md)，再读 Structured Concurrency、Scoped Values 和 FFM 预览案例。

## 第四幕：Java 25，语言简化与运行时观测继续靠近开发者

### 当时的问题

现代 Java 仍有小工具样板、构造器前置校验、密钥派生/PEM 格式重复实现；启动、对象头、GC、JFR 和 AOT 调优需要大量 JVM 专家知识。

### 引入方向

- Scoped Values、Module Import、Compact Source、Flexible Constructor Bodies：减少上下文、导入、入口和构造器样板。
- KDF、PEM Encodings：把常见安全协议边界纳入标准 API。
- Compact Object Headers、Generational Shenandoah、JFR/AOT：改善内存、GC、启动和诊断观察。
- Structured Concurrency、Primitive Patterns、Stable Values、Vector API：继续推进并发、模式、稳定初始化和 SIMD 表达；其中部分仍是 preview/incubator。

K5 已为每项能力创建独立工程，但因本机没有 JDK 25，地图状态统一为 `pending_jdk25_verification`。源码中的 JDK 25 参数和 preview/incubator 标记必须在安装目标 JDK 后重新验证。

## 跨代问题导航

| 旧问题 | 新概念 | 首选案例 |
| --- | --- | --- |
| 匿名类和规则变化 | Lambda / Functional Interface | `java8/lambda-method-reference-demo` |
| 数据处理样板 | Stream / Collector | `java8/stream-collector-demo` |
| DTO 样板和可变值 | Record | `java17/record-value-object-demo` |
| 状态分支遗漏 | Sealed + Pattern switch | `java17/sealed-hierarchy-demo`、`java21/pattern-switch-demo` |
| 大量阻塞 I/O | Virtual Thread | `java21/virtual-thread-demo` |
| 并发取消分散 | Structured Concurrency | `java21/structured-concurrency-preview-demo` |
| 上下文参数层层传递 | Scoped Values | `java21/scoped-values-preview-demo`、`java25/scoped-values-demo` |
| JVM 行为难解释 | Bytecode/JFR/GC/JIT | `java/jvm/` 下对应观察案例 |

## 类与核心方法的阅读方法

每个案例先看类级 Javadoc，回答“它为什么存在、解决什么问题”；再看带中文注释的方法，回答“能力在哪里生效、限制是什么”；最后看测试，确认正常路径和关键失败路径。README 负责版本状态、业务映射和学习资源，源码负责最小机制，测试负责可复现证据。
