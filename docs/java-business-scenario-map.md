# Java 业务场景地图

本页从业务问题反向定位语言能力。案例只模拟问题结构，不引入 Spring、数据库或其他框架。

| 业务问题 | 推荐能力 | 适用条件与收益 | 不适用/风险 | Demo |
| --- | --- | --- | --- | --- |
| 规则随需求替换，例如筛选、排序、格式化 | Lambda、方法引用、函数式接口 | 将变化的行为作为参数传入，减少匿名内部类样板 | 不把复杂、带副作用的业务流程塞进 Lambda | [Lambda](../java/java8/lambda-method-reference-demo/README.md) |
| DTO、查询结果、配置快照需要稳定值语义 | Record | 默认生成访问器、相等性和字符串表示，减少值对象样板 | 不替代可变实体、聚合根或复杂生命周期对象 | [Record](../java/java17/record-value-object-demo/README.md) |
| 有限状态、事件类型或审批结果 | Sealed Class、switch、模式匹配 | 限制子类型并让分支穷尽性可检查 | 对外可扩展插件体系不应强行封闭 | `sealed-hierarchy-demo`（规划） |
| 大量请求主要等待远程 I/O | Virtual Thread | 保留同步写法并降低线程资源占用 | CPU 密集任务无额外收益；不能池化虚拟线程 | [Virtual Thread](../java/java21/virtual-thread-demo/README.md) |
| 集合转换、分组、汇总 | Stream、Collector | 明确 map/filter/reduce 数据流 | 避免在 Stream 中隐藏副作用或盲目使用并行流 | `stream-collector-demo`（规划） |
| 返回值可能缺失 | Optional | 在 API 返回边界表达缺失语义 | 不作为实体字段、序列化载体或方法参数的默认替代 | `optional-api-boundary-demo`（规划） |
| 多个异步结果需要组合与失败传播 | CompletableFuture、Structured Concurrency | 将并发子任务的成功、失败和取消策略显式化 | 线程池、限流和超时策略仍需按资源建模 | `completable-future-composition-demo`（规划） |
| 需要解释源码与运行行为差异 | Bytecode、ClassLoader、JIT、JFR | 用工具观察 class、加载、编译和事件证据 | 单机观察不能直接推广为性能结论 | [Bytecode](../java/jvm/bytecode-inspection-demo/README.md) |
