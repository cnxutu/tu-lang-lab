# Record Value Object Demo

## Feature

Java Record、紧凑构造器和由组件派生的值语义。

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
