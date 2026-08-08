# Java 25 能力区

JDK 25 是已发布的 LTS 版本。本目录按稳定、预览、孵化与实验状态组织案例，避免把正在演进的 API 当成通用生产基线。

## 稳定能力

| 能力 | 关注问题 | 建议 Demo |
| --- | --- | --- |
| Scoped Values | 受限动态作用域中的不可变上下文传递 | `scoped-values-demo` |
| Module Import Declarations | 模块内导入简化与可读性边界 | `module-import-declarations-demo` |
| Compact Source Files and Instance Main Methods | 教学和小型程序的简化入口 | `compact-source-file-demo` |
| Flexible Constructor Bodies | 构造器中的初始化与校验顺序 | `flexible-constructor-body-demo` |
| Key Derivation Function API | 密钥派生 API 的正确边界与不可记录敏感输入 | `kdf-api-demo` |
| Compact Object Headers | 对象头压缩的内存观察边界 | `compact-object-headers-demo` |
| Generational Shenandoah | 分代 Shenandoah 的 GC 行为观察 | `generational-shenandoah-demo` |
| JFR 诊断增强 | CPU 时间、协作采样、方法计时与追踪 | `jfr-observability-demo` |
| AOT 启动优化 | 命令行人体工学与方法画像对启动的影响 | `aot-startup-observation-demo` |

## 演进中能力

| 能力 | 状态 | 建议 Demo |
| --- | --- | --- |
| Structured Concurrency | fifth preview | `structured-concurrency-preview-demo` |
| Primitive Types in Patterns, `instanceof`, and `switch` | third preview | `primitive-patterns-preview-demo` |
| PEM Encodings of Cryptographic Objects | preview | `pem-encoding-preview-demo` |
| Stable Values | preview | `stable-values-preview-demo` |
| Vector API | tenth incubator | `vector-api-incubator-demo` |

## 学习边界

- 预览、孵化和实验能力都必须在案例名、README、编译参数和运行参数中显式标识。
- GC、JFR、AOT 与对象头案例的结果依赖具体 JDK 构建、操作系统、硬件与 JVM 选项；只记录可复现的观察条件，不做通用性能承诺。
- 密码学案例不保存、提交或输出真实密钥、口令和生产材料。
