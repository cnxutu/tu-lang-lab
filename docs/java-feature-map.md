# Java 特性地图

案例创建并完成独立运行后，才将其路径填入 Demo 列；`TBD` 表示尚未实现。

| 语言 | 版本或专题 | 特性 | Demo |
| --- | --- | --- | --- |
| Java | 8 | Lambda 与方法引用 | `java/java8/lambda-method-reference-demo` |
| Java | 8 | Functional Interface 与默认方法 | `java/java8/functional-interface-default-method-demo`（TBD） |
| Java | 8 | Stream API 与 Collector | `java/java8/stream-collector-demo`（TBD） |
| Java | 8 | Optional | `java/java8/optional-api-boundary-demo`（TBD） |
| Java | 8 | CompletableFuture | `java/java8/completable-future-composition-demo`（TBD） |
| Java | 8 | Date-Time API | `java/java8/java-time-api-demo`（TBD） |
| Java | 17 学习基线 | Record | `java/java17/record-value-object-demo` |
| Java | 17 学习基线 | Sealed Class、`instanceof` Pattern Matching | `java/java17/`（TBD） |
| Java | 17 学习基线 | Text Block、Switch Expression、`HexFormat`、`RandomGenerator` | `java/java17/`（TBD） |
| Java | 17（预览） | Pattern Matching for `switch` | `java/java17/pattern-switch-preview-demo`（TBD） |
| Java | 21 | Virtual Thread 与 Pinning 诊断 | `java/java21/virtual-thread-demo` |
| Java | 21 | Record Pattern、Pattern Matching for `switch`、Sequenced Collection | `java/java21/`（TBD） |
| Java | 21（预览） | Structured Concurrency、Scoped Values、FFM API、Unnamed Patterns | `java/java21/`（TBD） |
| Java | 25 | Scoped Values、Module Import Declarations、Compact Source Files、Flexible Constructor Bodies | `java/java25/`（TBD） |
| Java | 25 | KDF API、Compact Object Headers、Generational Shenandoah、JFR/AOT 诊断 | `java/java25/`（TBD） |
| Java | 25（预览） | Structured Concurrency、Primitive Patterns、PEM Encodings、Stable Values | `java/java25/`（TBD） |
| Java | 25（孵化） | Vector API | `java/java25/vector-api-incubator-demo`（TBD） |
| JVM | Bytecode | `javap`、条件分支与方法调用 | `java/jvm/bytecode-inspection-demo` |
| JVM | 运行机制 | Memory、ClassLoader、JIT、GC、JFR、Thread Dump | `java/jvm/`（TBD） |

## 版本标注约定

- “学习基线”表示案例使用该 JDK 运行，不必等于特性的首次发布版本。
- 预览特性必须在案例 README 和 Maven 配置中明确标注 `--enable-preview`、所需 JDK 及兼容性限制。
- 版本、状态与行为结论以案例中的可复现命令、JDK 文档和运行结果为准。
