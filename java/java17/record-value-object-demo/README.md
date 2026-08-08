# Record Value Object Demo

## Feature

Java Record、紧凑构造器和由组件派生的值语义。

## Version & Status

Record 自 JDK 16 稳定；本案例以 JDK 17 作为 `stable` 学习基线。

## Background

用于表达不可变数据载体的普通类通常重复编写字段、构造器、访问器、`equals`、`hashCode` 和 `toString`。Record 将这些与状态直接关联的结构显式化。

## Problem

如何用一个具有构造校验和规范化规则的不可变金额对象表达货币和数值。

## Example

`Money` Record 在紧凑构造器中校验非空、非负金额，并把货币代码统一为大写、金额统一为两位小数。

## Usage Scenario

适合 DTO、查询结果和具有清晰值语义的小型领域值对象。

## Limitations

Record 不是所有领域模型的替代品：它隐含以组件构成状态和相等性的设计。金额计算、舍入策略和货币转换不属于本案例。

## Learning Resources

- 官方规范：[JEP 395: Records](https://openjdk.org/jeps/395)。
- 官方教程：[Dev.java Records](https://dev.java/learn/records/)。
- 延伸阅读：[Baeldung Java Records](https://www.baeldung.com/java-record-keyword)。

## Code Walkthrough

先看 `Money` 的组件声明，再看紧凑构造器中的校验和规范化，最后看 `format` 与主程序的 `equals` 输出。

## Business Mapping

问题：查询结果、配置和金额等数据需要可靠的值相等性。特性：Record 以组件定义状态。收益：减少样板代码并明确不可变数据边界。风险：有身份、生命周期或可变关联的实体不适合直接建模为 Record。

## Verification

`MoneyTest` 验证规范化、值相等性和负金额拒绝；主程序验证格式化与相等性输出。

## Run

在 macOS 或 WSL2 中切换到 JDK 17 后运行：

```bash
export JAVA_HOME=/path/to/jdk17
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
java -cp target/classes com.tu.languagelab.java17.recorddemo.RecordValueObjectDemo
```

预期输出：

```text
USD 12.30
same value=true
```
