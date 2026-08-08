# Sealed Hierarchy Demo
## Feature
Sealed Interface 与受限子类型。
## Version & Status
JDK 17，`stable`。
## Background
审批、事件和状态机常只有有限合法结果，但普通接口允许任意实现。
## Problem
如何将审批结果限制为通过和拒绝两种类型。
## Example
`ApprovalResult permits Approved, Rejected` 明确声明唯一合法子类型。
## Usage Scenario
审批结果、支付状态、领域事件和有限协议消息。
## Limitations
对外插件扩展点不应使用封闭层级；新增类型需要显式修改 permits 清单。
## Learning Resources
- [JEP 409: Sealed Classes](https://openjdk.org/jeps/409)
- [Dev.java Sealed Classes](https://dev.java/learn/)
## Code Walkthrough
先看 `permits`，再看两个 Record 实现以及 `instanceof` 分支。
## Business Mapping
问题：未知状态进入处理链。收益：类型层约束合法结果。风险：扩展边界需要提前设计。
## Verification
测试验证两种允许类型均可处理。
## Run
JDK 17 下执行 `mvn clean test`。
