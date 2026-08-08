# instanceof Pattern Matching Demo
## Feature
`instanceof` Pattern Matching。
## Version & Status
JDK 17 学习基线，`stable`。
## Background
传统类型判断后必须显式强转，容易重复和扩大变量作用域。
## Problem
如何从动态输入中安全提取整数金额。
## Example
`value instanceof Integer amount` 在匹配成功时直接绑定 `amount`。
## Usage Scenario
多态消息、插件返回值和兼容层输入的类型分派。
## Limitations
不能替代良好类型建模；复杂分派优先使用 sealed 层级和后续 switch 模式匹配。
## Learning Resources
- [JEP 394](https://openjdk.org/jeps/394)
- [Dev.java Learn](https://dev.java/learn/)
## Code Walkthrough
观察模式变量仅在 `if` 成功分支内可用。
## Business Mapping
问题：类型判断和强转散落。收益：安全绑定并缩小作用域。风险：动态 Object 输入本身仍应被限制。
## Verification
测试验证匹配和不匹配路径。
## Run
JDK 17 下执行 `mvn clean test`。
