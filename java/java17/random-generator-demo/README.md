# RandomGenerator Demo
## Feature
`RandomGenerator` 接口。
## Version & Status
JDK 17，`stable`。
## Background
不同随机算法有不同速度、质量和可拆分能力，代码不应硬绑定具体实现。
## Problem
如何让骰子规则依赖随机能力而非具体类。
## Example
`Dice.roll` 接收 `RandomGenerator` 并生成 1 到 6。
## Usage Scenario
模拟、抽样、测试数据和可重现实验。
## Limitations
不能用于密码、令牌或安全标识；这些必须使用 `SecureRandom`。
## Learning Resources
- [RandomGenerator API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/RandomGenerator.html)
## Code Walkthrough
查看接口注入与范围生成。
## Business Mapping
问题：规则和算法耦合。收益：算法可替换与测试可控。风险：非安全随机不能生成凭据。
## Verification
测试验证输出范围。
## Run
JDK 17 下执行 `mvn clean test`。
