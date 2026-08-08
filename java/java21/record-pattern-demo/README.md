# Record Pattern Demo
## Feature
Record Pattern。
## Version & Status
JDK 21，`stable`。
## Background
对嵌套 Record 的类型判断通常紧跟多个 accessor 调用。
## Problem
如何在匹配 Point 时直接获得横纵坐标。
## Example
`value instanceof Point(int x, int y)` 同时匹配类型并解构组件。
## Usage Scenario
消息载荷、坐标、配置结构和嵌套 DTO 的类型分派。
## Limitations
模式匹配不能替代领域校验；复杂分支要避免过度嵌套。
## Learning Resources
- [JEP 440](https://openjdk.org/jeps/440)
## Code Walkthrough
查看 Point 声明和解构模式变量。
## Business Mapping
问题：类型判断后多次取组件。收益：匹配和解构靠近。风险：业务规则仍需显式表达。
## Verification
测试验证对角点和未知输入。
## Run
JDK 21 下执行 `mvn clean test`。
