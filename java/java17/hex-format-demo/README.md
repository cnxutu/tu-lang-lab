# HexFormat Demo
## Feature
`HexFormat`。
## Version & Status
JDK 17，`stable`。
## Background
二进制 ID、摘要和协议字段需要稳定的人类可读表示。
## Problem
如何避免手写字节到十六进制字符串的循环。
## Example
`HexFormat.of().formatHex` 编码字节数组。
## Usage Scenario
Trace ID、摘要展示、协议调试。
## Limitations
十六进制是编码，不提供加密或脱敏；敏感字节不得写入日志。
## Learning Resources
- [HexFormat API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HexFormat.html)
## Code Walkthrough
查看 `formatHex` 的单一编码职责。
## Business Mapping
问题：手写编码易错。收益：标准库一致性。风险：不要误把编码当安全保护。
## Verification
测试验证固定字节输出。
## Run
JDK 17 下执行 `mvn clean test`。
