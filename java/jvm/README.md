# JVM 能力区

本目录研究语言代码运行后的 JVM 行为。每个案例应同时说明 Java 源码、运行参数、观察工具和环境条件。

| 专题 | 学习能力 | 建议 Demo |
| --- | --- | --- |
| Memory | 堆、栈、Metaspace、直接内存与对象生命周期 | `jvm-memory-layout-demo` |
| ClassLoader | 双亲委派、类隔离、链接与初始化时机 | `class-loader-lifecycle-demo` |
| Bytecode | 从源码到字节码、调用指令与反编译观察 | `bytecode-inspection-demo` |
| JIT | 解释执行、热点编译、逃逸分析与内联观察 | `jit-compilation-observation-demo` |
| GC | 收集器选择、暂停、吞吐和日志解读 | `gc-log-observation-demo` |
| JFR | 录制、事件筛选与性能诊断证据 | `jfr-diagnostics-demo` |
| Thread Dump | 平台线程、虚拟线程与死锁诊断 | `thread-dump-analysis-demo` |

## 观察规范

- 所有 JVM 结论必须带上 JDK 版本、JVM 参数、操作系统和复现命令。
- `javap`、JFR、GC 日志、`jcmd` 等输出视为实验产物；可保存脱敏且小型的示例，不提交机器路径、进程号或大体积日志。
- 性能结论必须给出对照条件和测量限制，不以单机结果推广为普遍规律。
