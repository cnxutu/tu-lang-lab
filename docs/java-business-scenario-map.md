# Java 业务场景地图

本页从业务问题反向定位语言能力。案例只模拟问题结构，不引入 Spring、数据库或其他框架。

| 业务问题 | 推荐能力 | 适用条件与收益 | 不适用/风险 | Demo |
| --- | --- | --- | --- | --- |
| 需要保护对象状态和业务不变量 | 类、封装、构造器校验 | 让状态变化集中在对象方法中，初学者可先理解职责边界 | 不把所有流程塞进一个巨型对象 | [面向对象](../java/java8/fundamentals/object-oriented-basics-demo/README.md) |
| 需要按顺序保存、去重或按键索引 | List、Set、Map | 根据数据语义选择集合，减少后续逻辑分支 | 具体实现的顺序、并发和容量特性不可混用 | [集合基础](../java/java8/fundamentals/collection-basics-demo/README.md) |
| 工具代码需要复用且保持类型安全 | 泛型、边界通配符 | 编译期发现类型错误，减少强制转换 | 类型擦除限制运行时反射和泛型数组 | [泛型基础](../java/java8/fundamentals/generics-basics-demo/README.md) |
| 外部输入可能格式错误或越界 | 异常、领域异常 | 把失败变成显式调用契约，保留根因 | 不用异常代替正常分支或静默吞错 | [异常基础](../java/java8/fundamentals/exception-basics-demo/README.md) |
| 需要读写小型文本配置或导出文件 | Path、Files、UTF-8 | 统一编码与资源边界，示例简单可复现 | 大文件、并发写入和事务性更新需专门方案 | [文件 IO](../java/java8/fundamentals/file-io-basics-demo/README.md) |
| 调用 HTTP 服务需要超时与释放连接 | URL、HttpURLConnection | 形成连接、读取、关闭的完整生命周期 | 复杂生产客户端应考虑连接池、认证和重试 | [HTTP 网络](../java/java8/fundamentals/http-network-basics-demo/README.md) |
| 多线程共享计数或状态 | Thread、synchronized、join | 建立临界区、等待和可见性的基础直觉 | 不代表高性能并发方案，优先评估高层并发 API | [线程同步](../java/java8/fundamentals/thread-synchronization-basics-demo/README.md) |
| 规则随需求替换，例如筛选、排序、格式化 | Lambda、方法引用、函数式接口 | 将变化的行为作为参数传入，减少匿名内部类样板 | 不把复杂、带副作用的业务流程塞进 Lambda | [Lambda](../java/java8/lambda-method-reference-demo/README.md) |
| DTO、查询结果、配置快照需要稳定值语义 | Record | 默认生成访问器、相等性和字符串表示，减少值对象样板 | 不替代可变实体、聚合根或复杂生命周期对象 | [Record](../java/java17/record-value-object-demo/README.md) |
| 有限状态、事件类型或审批结果 | Sealed Class、switch、模式匹配 | 限制子类型并让分支穷尽性可检查 | 对外可扩展插件体系不应强行封闭 | [Sealed](../java/java17/sealed-hierarchy-demo/README.md) |
| 大量请求主要等待远程 I/O | Virtual Thread | 保留同步写法并降低线程资源占用 | CPU 密集任务无额外收益；不能池化虚拟线程 | [Virtual Thread](../java/java21/virtual-thread-demo/README.md) |
| 集合转换、分组、汇总 | Stream、Collector | 明确 map/filter/reduce 数据流 | 避免在 Stream 中隐藏副作用或盲目使用并行流 | [Stream](../java/java8/stream-collector-demo/README.md) |
| 返回值可能缺失 | Optional | 在 API 返回边界表达缺失语义 | 不作为实体字段、序列化载体或方法参数的默认替代 | [Optional](../java/java8/optional-api-boundary-demo/README.md) |
| 多个异步结果需要组合与失败传播 | CompletableFuture、Structured Concurrency | 将并发子任务的成功、失败和取消策略显式化 | 线程池、限流和超时策略仍需按资源建模 | [CompletableFuture](../java/java8/completable-future-composition-demo/README.md) |
| 需要解释源码与运行行为差异 | Bytecode、ClassLoader、JIT、JFR | 用工具观察 class、加载、编译和事件证据 | 单机观察不能直接推广为性能结论 | [Bytecode](../java/jvm/bytecode-inspection-demo/README.md) |
