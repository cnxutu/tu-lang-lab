# Java 21 能力区

JDK 21 重点研究高并发编程模型、模式匹配完善与集合 API 演进。稳定能力和预览能力必须分开建案例。

| 能力 | 状态 | 关注问题 | 建议 Demo |
| --- | --- | --- | --- |
| Virtual Thread | stable | 阻塞式并发的扩展性、调度与可观测性 | `virtual-thread-demo` |
| Virtual Thread Pinning | stable | 阻塞时载体线程被固定的原因与诊断 | `virtual-thread-pinning-demo` |
| Record Pattern | stable | 对 Record 的解构与嵌套模式 | `record-pattern-demo` |
| Pattern Matching for `switch` | stable | 类型分派、`null` 和密封层级的穷尽性 | `pattern-switch-demo` |
| Sequenced Collection | stable | 首尾访问、反向视图和统一顺序 API | `sequenced-collection-demo` |
| Structured Concurrency | preview | 子任务生命周期、失败传播和取消；需 `--enable-preview` | `structured-concurrency-preview-demo` |
| Scoped Values | preview | 面向子调用/子线程的不可变上下文传递；需 `--enable-preview` | `scoped-values-preview-demo` |
| Foreign Function & Memory API | preview | Java 与原生内存/函数调用的安全边界；需 `--enable-preview` | `ffm-api-preview-demo` |
| Unnamed Patterns and Variables | preview | 显式忽略不需要的绑定；需 `--enable-preview` | `unnamed-pattern-preview-demo` |

## 学习边界

- Virtual Thread 适合大量阻塞型 I/O 任务，不会提升 CPU 密集型工作的可用核心数；不要池化虚拟线程。
- Pinning 案例使用 JFR 或 `jdk.tracePinnedThreads` 观察，不以单次耗时推导通用性能结论。
- 预览 API 只用于语言学习；案例 README 必须记录升级风险与启用命令。
