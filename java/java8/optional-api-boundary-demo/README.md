# Optional API Boundary Demo
## Feature
`Optional` 作为返回值语义。
## Version & Status
JDK 8，`stable`。
## Background
调用方需要区分“值为空”和“根本不存在”。
## Problem
查询用户显示名时如何强制调用方处理未命中。
## Example
`findDisplayName` 返回 `Optional<String>`，主程序用 `orElse` 选择默认值。
## Usage Scenario
查询结果、缓存查找和可选配置读取。
## Limitations
不把 Optional 用作字段、参数或序列化载体；不要直接调用 `get()`。
## Learning Resources
- [Optional API](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- [Dev.java Streams and Optional](https://dev.java/learn/api/streams/)
## Code Walkthrough
查看返回边界的 `ofNullable` 与调用方的 `orElse`。
## Business Mapping
问题：未命中被误当作空字符串。收益：缺失策略显式化。风险：默认值不能掩盖应报错的业务缺失。
## Verification
测试验证未命中使用调用方默认值。
## Run
JDK 8 下执行 `mvn clean test`。
