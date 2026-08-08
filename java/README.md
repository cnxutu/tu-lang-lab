# Java 学习区

Java 是本仓库的主要学习方向。每个目录以案例的**目标运行 JDK**划分，不以特性的首次发布版本划分；因此，Java 17 目录也可以学习在更早版本已稳定、但仍是 JDK 17 开发基线的能力。

| 目录 | 定位 | 能力清单 |
| --- | --- | --- |
| [`java8/`](java8/README.md) | 函数式风格与现代基础库起点 | Lambda、Stream、Optional、CompletableFuture、`java.time` |
| [`java17/`](java17/README.md) | LTS 基线与建模能力 | Record、Sealed Class、文本块、switch expression、模式匹配 |
| [`java21/`](java21/README.md) | 并发与模式匹配演进 | Virtual Thread、Record Pattern、Sequenced Collection、预览并发 API |
| [`java25/`](java25/README.md) | 当前 LTS 的语言、库与运行时演进 | Scoped Values、模块导入、构造器、JFR、GC、预览与孵化 API |
| [`jvm/`](jvm/README.md) | JVM 运行机制与诊断 | 内存、类加载、字节码、JIT、GC、JFR |

## 案例约定

每个 `*-demo` 是独立 Maven 工程，包含自己的 `pom.xml`、`README.md` 与 `src/`，不依赖父 POM 或根聚合工程。案例 README 必须说明能力状态：

- **stable**：默认可编译和运行。
- **preview**：在编译和运行时均显式启用 `--enable-preview`，并锁定所需 JDK。
- **incubator**：显式加入所需模块和运行参数。
- **experimental**：说明 JVM 选项、适用实现与结果不可泛化的边界。

具体条目与建议案例名称维护在 [`docs/java-feature-map.md`](../docs/java-feature-map.md)。
