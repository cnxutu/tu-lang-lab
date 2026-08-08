# Functional Interface and Default Method Demo

## Feature
`@FunctionalInterface`、Lambda 与接口默认方法。
## Version & Status
JDK 8，`stable`。
## Background
接口演进需要新增通用行为，又不能破坏已有实现。
## Problem
如何将可替换折扣规则与统一下限规则分离。
## Example
`DiscountRule` 用单个抽象方法承接 Lambda，用默认方法提供复用逻辑。
## Usage Scenario
适合策略、校验器或转换规则等单一行为扩展点。
## Limitations
复杂策略应使用具名类型；默认方法冲突需要明确解决。
## Learning Resources
- [Java 8 Functional Interfaces](https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html)
- [Dev.java Lambdas](https://dev.java/learn/lambdas/)
## Code Walkthrough
先看单一抽象方法，再看默认方法如何调用它。
## Business Mapping
问题：价格或校验规则会变化。收益：调用流程稳定、规则可替换。风险：不要在 Lambda 中混入复杂副作用。
## Verification
`DiscountRuleTest` 验证规则与下限组合。
## Run
切换到 JDK 8 后执行 `mvn clean test`，再运行主类。
