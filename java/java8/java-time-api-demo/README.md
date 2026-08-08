# Date-Time API Demo
## Feature
`ZonedDateTime` 与 `Duration`。
## Version & Status
JDK 8，`stable`。
## Background
旧日期 API 的可变性和时区语义会导致跨区域业务错误。
## Problem
如何计算带时区的配送窗口时长。
## Example
`Duration.between` 计算两个 `ZonedDateTime` 的分钟差。
## Usage Scenario
预约、账期、审计时间和跨时区截止时间。
## Limitations
日期、时长和瞬时点是不同概念，必须选择正确时间类型。
## Learning Resources
- [java.time API](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)
- [Dev.java Learn](https://dev.java/learn/)
## Code Walkthrough
查看 `ZoneId`、`ZonedDateTime` 和 `Duration.between` 的职责边界。
## Business Mapping
问题：时区和夏令时导致计算错误。收益：不可变、类型化时间模型。风险：不能只存格式化字符串。
## Verification
测试验证 90 分钟窗口。
## Run
JDK 8 下执行 `mvn clean test`。
