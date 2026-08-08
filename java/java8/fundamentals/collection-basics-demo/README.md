# Collection Basics Demo

## Feature
比较 JDK 8 中 `List`、`Set` 和 `Map` 的基本职责。

## Version & Status
JDK 8；`stable`。

## Background
集合是 Java 业务代码中最常见的数据组织方式，先理解语义再学习 Stream。

## Problem
重复、顺序和键值查找是不同问题，错误选择集合会造成逻辑和性能负担。

## Example
同一批语言名称分别放入列表、集合并统计到映射中。

## Usage Scenario
订单列表、去重标签、按 ID 索引和计数汇总。

## Limitations
示例使用 HashSet/HashMap，不讨论排序、并发和容量调优。

## Code Walkthrough
`ordered` 保留输入顺序，`unique` 去重，`counts` 维护键值计数。

## Business Mapping
问题 → 数据结构语义混用；特性 → Java Collections；收益 → 代码意图清晰；风险/替代 → 有序/并发场景应选择对应实现。

## Learning Resources
- [Collections Tutorial](https://docs.oracle.com/javase/tutorial/collections/)（★★★★★，官方教程）
- [Java Collections API](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)（★★★★★，契约）
- [JavaGuide 集合](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文源码索引）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `CollectionBasicsDemo`。

## Verification
测试确认列表数量 3、去重数量 2、Java 出现 2 次。

