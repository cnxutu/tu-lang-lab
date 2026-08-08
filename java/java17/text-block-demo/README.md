# Text Block Demo
## Feature
Text Block 与 `formatted`。
## Version & Status
JDK 17 学习基线，`stable`。
## Background
邮件、SQL、JSON 或通知模板用字符串拼接会淹没实际文本结构。
## Problem
如何定义可读的多行通知模板。
## Example
Text Block 保留逻辑换行，`formatted` 注入用户名。
## Usage Scenario
通知、文档片段、测试样本和嵌入式查询模板。
## Limitations
不要把未转义的外部输入直接拼入 SQL 或 JSON；缩进和行尾规则需配合测试确认。
## Learning Resources
- [JEP 378](https://openjdk.org/jeps/378)
- [Dev.java Learn](https://dev.java/learn/)
## Code Walkthrough
查看三引号内容、公共缩进剥离和 `formatted` 调用。
## Business Mapping
问题：多行模板难读易错。收益：文本结构接近最终输出。风险：模板不是安全编码工具。
## Verification
测试验证换行和格式化结果。
## Run
JDK 17 下执行 `mvn clean test`。
