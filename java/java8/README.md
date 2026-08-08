# Java 8 能力区

目标：先建立面向对象、集合、泛型、异常、文件、网络和线程的基础，再进入 Java 8 的函数式组合、异步编排和现代日期时间 API。所有案例使用 JDK 8 编译和运行。

| 能力 | 关注问题 | 建议 Demo |
| --- | --- | --- |
| 面向对象基础 | 类、对象、封装与状态不变量 | [`fundamentals/object-oriented-basics-demo`](fundamentals/object-oriented-basics-demo/README.md) |
| 集合基础 | List、Set、Map 的数据结构语义 | [`fundamentals/collection-basics-demo`](fundamentals/collection-basics-demo/README.md) |
| 泛型基础 | 编译期类型安全与可复用算法 | [`fundamentals/generics-basics-demo`](fundamentals/generics-basics-demo/README.md) |
| 异常基础 | 输入失败、领域异常与调用者契约 | [`fundamentals/exception-basics-demo`](fundamentals/exception-basics-demo/README.md) |
| 文件 IO | Path、Files、编码与资源边界 | [`fundamentals/file-io-basics-demo`](fundamentals/file-io-basics-demo/README.md) |
| HTTP 网络 | URL、超时、响应流与连接释放 | [`fundamentals/http-network-basics-demo`](fundamentals/http-network-basics-demo/README.md) |
| 线程同步 | Thread、synchronized、join 与共享状态 | [`fundamentals/thread-synchronization-basics-demo`](fundamentals/thread-synchronization-basics-demo/README.md) |
| Lambda 与方法引用 | 用行为参数化降低匿名内部类噪声 | `lambda-method-reference-demo` |
| Functional Interface 与默认方法 | 接口演进和函数式契约设计 | `functional-interface-default-method-demo` |
| Stream API 与 Collector | 声明式数据处理、惰性求值与收集策略 | `stream-collector-demo` |
| Optional | 显式表达可能缺失的返回值，不替代所有 nullable 字段 | `optional-api-boundary-demo` |
| CompletableFuture | 异步组合、异常传播、线程池边界 | `completable-future-composition-demo` |
| Date-Time API | 不可变时间对象、时区和格式化 | `java-time-api-demo` |

## 推荐学习顺序

1. 面向对象 → 集合 → 泛型：先理解对象、数据结构和类型约束。
2. 异常 → 文件 IO → HTTP 网络：再学习程序如何面对外部不确定性。
3. 线程同步：理解共享状态、可见性和等待边界。
4. Lambda/函数式接口 → Stream/Collector → Optional：进入 Java 8 的组合式编程。
5. CompletableFuture → Date-Time API：学习异步边界和时间语义。

这条路径对应“语言基础 → 标准库边界 → 并发模型 → Java 8 新能力”，不建议一开始跳过集合、异常和 IO 直接学习 Stream。

## 学习边界

- Stream 不等价于性能优化工具；并行 Stream 必须单独验证线程池、顺序与性能。
- `Optional` 优先作为返回值语义，不作为实体字段、方法参数或序列化模型的默认替代。
- `CompletableFuture` 案例必须记录执行器来源与异常链，避免用默认公共线程池掩盖行为。
