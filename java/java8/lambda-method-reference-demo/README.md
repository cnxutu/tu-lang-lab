# Lambda and Method Reference Demo

## Feature

Java 8 的 Lambda、`Predicate`/`Function` 函数式接口、`Comparator.comparing` 和方法引用。

## Background

匿名内部类把简单的行为参数化写得冗长。Lambda 让行为可以作为参数传递，方法引用则在已有方法满足目标函数签名时减少样板代码。

## Problem

对任务按条件筛选、按名称排序并格式化输出时，如何把“规则”和“格式”从遍历逻辑中分离出来。

## Example

`TaskOperations.filter(tasks, task -> task.getPriority() >= 2)` 使用 Lambda 表达筛选规则；`Comparator.comparing(Task::getName)` 和 `TaskOperations::formatTask` 使用方法引用。

## Usage Scenario

适用于集合处理中的可替换规则，例如筛选条件、排序键和输出格式。

## Limitations

本案例刻意不用 Stream，避免与 Stream API 学习主题混合。Lambda 不应承载过长或有复杂副作用的业务逻辑。

## Run

在 macOS 或 WSL2 中切换到 JDK 8 后运行：

```bash
export JAVA_HOME=/path/to/jdk8
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
java -cp target/classes com.tu.languagelab.java8.lambda.LambdaMethodReferenceDemo
```

预期输出：

```text
alpha (priority=2)
gamma (priority=3)
```
