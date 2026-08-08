# Stream Collector Demo
## Feature
Stream API 与 `Collectors.groupingBy`/`counting`。
## Version & Status
JDK 8，`stable`。
## Background
集合分组统计常见但手写循环容易混入可变状态。
## Problem
按商品分类统计数量。
## Example
`countByCategory` 用 Collector 声明分组和计数规则。
## Usage Scenario
订单分类汇总、日志标签统计、报表预聚合。
## Limitations
不要在 Stream 管道中隐藏副作用；大数据量需单独评估内存与并行策略。
## Learning Resources
- [Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Dev.java Streams](https://dev.java/learn/api/streams/)
## Code Walkthrough
从 `categories.stream()` 到 `groupingBy`，观察中间流和终止收集器。
## Business Mapping
问题：集合分类汇总。收益：声明式表达。风险：并行流不等于默认性能优化。
## Verification
测试验证分类 `book` 的计数。
## Run
JDK 8 下执行 `mvn clean test`，再运行 `StreamCollectorDemo`。
