# Pattern Matching for switch Demo

## Feature

Java 21 将 Pattern Matching for `switch` 正式化：`switch` 可以按类型匹配，并在每个分支中绑定匹配后的变量。

## Version & Status

- JDK: 21
- Status: stable（[JEP 441](https://openjdk.org/jeps/441)）

## Background

传统的 `instanceof` 链加类型转换容易遗漏分支。对于有限的领域结果类型，编译器应能帮助确认处理是否完整。

## Problem

支付、审批或导入流程常有成功、可重试失败和不可恢复失败等结果；错误的默认分支可能会掩盖新增状态。

## Example

`PaymentResult` 是 sealed 层级。`PaymentMessage.describe` 用类型模式 `switch` 映射每一种结果，无需 `default`；后续增加许可子类型时，编译器会要求补齐分支。

## Code Walkthrough

- `PaymentResult` 定义封闭的结果集合；每个 `record` 承载自身数据。
- `PaymentMessage` 的 `case PaymentResult.Success success` 同时完成类型判断和变量绑定。

## Business Mapping

问题 → 有限状态的处理逻辑分散且容易漏改；特性 → sealed hierarchy + pattern `switch`；收益 → 编译期穷尽性检查和更直接的数据访问；风险/替代 → 对开放扩展的插件类型不适合封闭层级，可使用注册表或访问者模式。

## Usage Scenario

适合工作流结果、订单状态转换结果、消息消费结果等“状态类型集合明确”的场景。

## Limitations

- `null` 不会自动被这些类型分支处理；需要时显式写 `case null`。
- 穷尽性依赖于静态类型是 sealed 层级，开放接口通常仍需 `default`。

## Learning Resources

- 官方特性说明：[JEP 441](https://openjdk.org/jeps/441)（★★★★★，定义稳定语义）
- 官方教程：[Dev.java — Pattern Matching](https://dev.java/learn/pattern-matching/)（★★★★★，示例由浅入深）
- 社区延伸：[Inside Java — Pattern Matching](https://inside.java/tag/pattern-matching/)（★★★★☆，提供设计背景与版本演进）

## Run

macOS / WSL：

```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn -q exec:java -Dexec.mainClass=com.tu.languagelab.java21.patternswitch.PatternSwitchDemo
```

也可以先执行 `mvn package`，再从 `target/classes` 用 `java -cp` 运行主类。

## Verification

`mvn clean test` 应通过；主类输出依次为 `paid:R-100`、`retry:gateway-timeout`。
