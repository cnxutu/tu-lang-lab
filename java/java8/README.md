# Java 8 能力区

目标：掌握 Java 从面向对象主导走向函数式组合、异步编排和现代日期时间 API 的基础能力。案例使用 JDK 8 编译和运行。

| 能力 | 关注问题 | 建议 Demo |
| --- | --- | --- |
| Lambda 与方法引用 | 用行为参数化降低匿名内部类噪声 | `lambda-method-reference-demo` |
| Functional Interface 与默认方法 | 接口演进和函数式契约设计 | `functional-interface-default-method-demo` |
| Stream API 与 Collector | 声明式数据处理、惰性求值与收集策略 | `stream-collector-demo` |
| Optional | 显式表达可能缺失的返回值，不替代所有 nullable 字段 | `optional-api-boundary-demo` |
| CompletableFuture | 异步组合、异常传播、线程池边界 | `completable-future-composition-demo` |
| Date-Time API | 不可变时间对象、时区和格式化 | `java-time-api-demo` |
| `java.util.function` | 常用函数类型与组合方式 | `function-composition-demo` |
| Base64 与集合增强 | 常用标准库的小型能力验证 | `base64-and-collection-demo` |

## 学习边界

- Stream 不等价于性能优化工具；并行 Stream 必须单独验证线程池、顺序与性能。
- `Optional` 优先作为返回值语义，不作为实体字段、方法参数或序列化模型的默认替代。
- `CompletableFuture` 案例必须记录执行器来源与异常链，避免用默认公共线程池掩盖行为。
