# Switch Expression Demo
## Feature
Switch Expression 与箭头分支。
## Version & Status
JDK 17 学习基线，`stable`。
## Background
业务状态映射通常需要返回值，传统 switch 容易遗漏 `break`。
## Problem
将优先级映射为展示标签。
## Example
`switch` 作为表达式直接返回标签，未知值明确失败。
## Usage Scenario
状态标签、审批动作、配置枚举映射。
## Limitations
未知输入策略要符合业务语义；不要用 default 静默吞掉异常状态。
## Learning Resources
- [JEP 361](https://openjdk.org/jeps/361)
- [Dev.java Learn](https://dev.java/learn/)
## Code Walkthrough
观察箭头分支直接产生值，以及 default 的失败边界。
## Business Mapping
问题：状态映射贯穿或遗漏。收益：表达式化且分支更明确。风险：错误 default 会隐藏数据问题。
## Verification
测试覆盖合法和非法优先级。
## Run
JDK 17 下执行 `mvn clean test`。
