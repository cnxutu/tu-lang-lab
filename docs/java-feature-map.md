# Java 特性地图

本表是 K5 Java 学习主索引。`stable` 表示已用对应本机 JDK 构建测试；`preview` 表示需要 `--enable-preview`；`incubator` 表示需要额外模块；`pending_jdk25_verification` 表示源码、POM 和文档已创建，但本机尚未安装 JDK 25。

| 语言 | 版本/专题 | 特性 | 状态 | Demo | 学习引导 | 业务场景 |
| --- | --- | --- | --- | --- | --- | --- |
| Java | 8 | Lambda 与方法引用 | stable | `java/java8/lambda-method-reference-demo` | [README](../java/java8/lambda-method-reference-demo/README.md) | [规则、排序与格式化](java-business-scenario-map.md) |
| Java | 8 | Functional Interface 与默认方法 | stable | `java/java8/functional-interface-default-method-demo` | [README](../java/java8/functional-interface-default-method-demo/README.md) | [可替换策略](java-business-scenario-map.md) |
| Java | 8 | Stream API 与 Collector | stable | `java/java8/stream-collector-demo` | [README](../java/java8/stream-collector-demo/README.md) | [分组与汇总](java-business-scenario-map.md) |
| Java | 8 | Optional | stable | `java/java8/optional-api-boundary-demo` | [README](../java/java8/optional-api-boundary-demo/README.md) | [缺失值处理](java-business-scenario-map.md) |
| Java | 8 | CompletableFuture | stable | `java/java8/completable-future-composition-demo` | [README](../java/java8/completable-future-composition-demo/README.md) | [并发结果聚合](java-business-scenario-map.md) |
| Java | 8 | Date-Time API | stable | `java/java8/java-time-api-demo` | [README](../java/java8/java-time-api-demo/README.md) | 时间窗口与时区 |
| Java | 8 | 面向对象基础 | stable | `java/java8/fundamentals/object-oriented-basics-demo` | [README](../java/java8/fundamentals/object-oriented-basics-demo/README.md) | 状态不变量与对象建模 |
| Java | 8 | 集合基础 | stable | `java/java8/fundamentals/collection-basics-demo` | [README](../java/java8/fundamentals/collection-basics-demo/README.md) | 列表、去重与索引 |
| Java | 8 | 泛型基础 | stable | `java/java8/fundamentals/generics-basics-demo` | [README](../java/java8/fundamentals/generics-basics-demo/README.md) | 类型安全容器与算法 |
| Java | 8 | 异常基础 | stable | `java/java8/fundamentals/exception-basics-demo` | [README](../java/java8/fundamentals/exception-basics-demo/README.md) | 输入校验与错误契约 |
| Java | 8 | 文件 IO 基础 | stable | `java/java8/fundamentals/file-io-basics-demo` | [README](../java/java8/fundamentals/file-io-basics-demo/README.md) | 配置、导入与导出 |
| Java | 8 | HTTP 网络基础 | stable | `java/java8/fundamentals/http-network-basics-demo` | [README](../java/java8/fundamentals/http-network-basics-demo/README.md) | 外部接口与超时 |
| Java | 8 | 线程同步基础 | stable | `java/java8/fundamentals/thread-synchronization-basics-demo` | [README](../java/java8/fundamentals/thread-synchronization-basics-demo/README.md) | 共享状态与并发更新 |
| Java | 17 学习基线 | Record | stable | `java/java17/record-value-object-demo` | [README](../java/java17/record-value-object-demo/README.md) | DTO、快照和值对象 |
| Java | 17 学习基线 | Sealed Class | stable | `java/java17/sealed-hierarchy-demo` | [README](../java/java17/sealed-hierarchy-demo/README.md) | 有限状态与事件 |
| Java | 17 学习基线 | `instanceof` Pattern Matching | stable | `java/java17/instanceof-pattern-demo` | [README](../java/java17/instanceof-pattern-demo/README.md) | 类型分支与解析 |
| Java | 17 学习基线 | Text Block | stable | `java/java17/text-block-demo` | [README](../java/java17/text-block-demo/README.md) | SQL/JSON/模板文本 |
| Java | 17 学习基线 | Switch Expression | stable | `java/java17/switch-expression-demo` | [README](../java/java17/switch-expression-demo/README.md) | 状态映射 |
| Java | 17 学习基线 | `HexFormat` | stable | `java/java17/hex-format-demo` | [README](../java/java17/hex-format-demo/README.md) | 协议与二进制日志 |
| Java | 17 学习基线 | `RandomGenerator` | stable | `java/java17/random-generator-demo` | [README](../java/java17/random-generator-demo/README.md) | 可复现实验与模拟 |
| Java | 17 预览 | Pattern Matching for `switch` | preview | `java/java17/pattern-switch-preview-demo` | [README](../java/java17/pattern-switch-preview-demo/README.md) | 多形态输入分类 |
| Java | 21 | Virtual Thread 与 Pinning 诊断 | stable | `java/java21/virtual-thread-demo` | [README](../java/java21/virtual-thread-demo/README.md) | 阻塞 I/O 扇出 |
| Java | 21 | Sequenced Collection | stable | `java/java21/sequenced-collection-demo` | [README](../java/java21/sequenced-collection-demo/README.md) | 首尾有序访问 |
| Java | 21 | Record Pattern | stable | `java/java21/record-pattern-demo` | [README](../java/java21/record-pattern-demo/README.md) | 数据解构与校验 |
| Java | 21 | Pattern Matching for `switch` | stable | `java/java21/pattern-switch-demo` | [README](../java/java21/pattern-switch-demo/README.md) | 有限结果状态 |
| Java | 21 | Structured Concurrency | preview | `java/java21/structured-concurrency-preview-demo` | [README](../java/java21/structured-concurrency-preview-demo/README.md) | 扇出、聚合与失败传播 |
| Java | 21 | Scoped Values | preview | `java/java21/scoped-values-preview-demo` | [README](../java/java21/scoped-values-preview-demo/README.md) | 请求只读上下文 |
| Java | 21 | Unnamed Patterns | preview | `java/java21/unnamed-patterns-preview-demo` | [README](../java/java21/unnamed-patterns-preview-demo/README.md) | 只关心类型的分支 |
| Java | 21 | FFM API | preview | `java/java21/foreign-function-preview-demo` | [README](../java/java21/foreign-function-preview-demo/README.md) | native 库交互 |
| Java | 25 | Scoped Values | pending_jdk25_verification | `java/java25/scoped-values-demo` | [README](../java/java25/scoped-values-demo/README.md) | 请求只读上下文 |
| Java | 25 | Module Import Declarations | pending_jdk25_verification | `java/java25/module-import-declarations-demo` | [README](../java/java25/module-import-declarations-demo/README.md) | 模块化工具示例 |
| Java | 25 | Compact Source Files | pending_jdk25_verification | `java/java25/compact-source-files-demo` | [README](../java/java25/compact-source-files-demo/README.md) | 快速 CLI/demo |
| Java | 25 | Flexible Constructor Bodies | pending_jdk25_verification | `java/java25/flexible-constructor-bodies-demo` | [README](../java/java25/flexible-constructor-bodies-demo/README.md) | 构造前不变量 |
| Java | 25 | KDF API | pending_jdk25_verification | `java/java25/kdf-api-demo` | [README](../java/java25/kdf-api-demo/README.md) | 密钥派生 |
| Java | 25 | Compact Object Headers | pending_jdk25_verification | `java/java25/compact-object-headers-demo` | [README](../java/java25/compact-object-headers-demo/README.md) | 小对象内存密度 |
| Java | 25 | Generational Shenandoah | pending_jdk25_verification | `java/java25/generational-shenandoah-demo` | [README](../java/java25/generational-shenandoah-demo/README.md) | 分配峰值与低暂停 |
| Java | 25 | JFR 诊断 | pending_jdk25_verification | `java/java25/jfr-observation-demo` | [README](../java/java25/jfr-observation-demo/README.md) | CPU/方法时间线 |
| Java | 25 | AOT 命令与方法剖析 | pending_jdk25_verification | `java/java25/jfr-aot-observation-demo` | [README](../java/java25/jfr-aot-observation-demo/README.md) | 冷启动与扩缩容 |
| Java | 25 | Structured Concurrency | pending_jdk25_verification | `java/java25/structured-concurrency-demo` | [README](../java/java25/structured-concurrency-demo/README.md) | 并发请求聚合 |
| Java | 25 | Primitive Patterns | pending_jdk25_verification | `java/java25/primitive-patterns-demo` | [README](../java/java25/primitive-patterns-demo/README.md) | 数值类型路由 |
| Java | 25 | PEM Encodings | pending_jdk25_verification | `java/java25/pem-encodings-demo` | [README](../java/java25/pem-encodings-demo/README.md) | 密钥证书导入导出 |
| Java | 25 | Stable Values | pending_jdk25_verification | `java/java25/stable-values-demo` | [README](../java/java25/stable-values-demo/README.md) | 一次性懒初始化 |
| Java | 25 | Vector API | pending_jdk25_verification | `java/java25/vector-api-incubator-demo` | [README](../java/java25/vector-api-incubator-demo/README.md) | SIMD 数值批处理 |
| JVM | Bytecode | `javap`、条件分支与方法调用 | stable | `java/jvm/bytecode-inspection-demo` | [README](../java/jvm/bytecode-inspection-demo/README.md) | class 行为排查 |
| JVM | Memory | `Runtime` 堆快照 | stable | `java/jvm/memory-observation-demo` | [README](../java/jvm/memory-observation-demo/README.md) | 内存基线 |
| JVM | ClassLoader | 类加载器归属观察 | stable | `java/jvm/classloader-observation-demo` | [README](../java/jvm/classloader-observation-demo/README.md) | 插件与依赖冲突 |
| JVM | JIT | 热循环与编译日志 | stable | `java/jvm/jit-observation-demo` | [README](../java/jvm/jit-observation-demo/README.md) | 热点与延迟诊断 |
| JVM | GC | 分配负载与 GC 日志 | stable | `java/jvm/gc-observation-demo` | [README](../java/jvm/gc-observation-demo/README.md) | 暂停与吞吐分析 |
| JVM | JFR | Flight Recorder 文件 | stable | `java/jvm/jfr-observation-demo` | [README](../java/jvm/jfr-observation-demo/README.md) | 运行时事件时间线 |
| JVM | Thread Dump | 线程栈快照与 jcmd | stable | `java/jvm/thread-dump-observation-demo` | [README](../java/jvm/thread-dump-observation-demo/README.md) | 阻塞、死锁与线程耗尽 |

## 版本标注约定

- `stable`：已在目标 JDK 上执行 `mvn clean test`。
- `preview`：README、Maven 编译和测试显式启用 `--enable-preview`。
- `incubator`：需要额外 `--add-modules`；Java 25 统一以 `pending_jdk25_verification` 记录本机未验证状态。
- `pending_jdk25_verification`：JDK 25 源码、测试、POM 和文档已创建，待安装 JDK 25 后运行，不代表 API 已被本机验证。
