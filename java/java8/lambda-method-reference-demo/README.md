# Lambda and Method Reference Demo

## Feature

Java 8 的 Lambda、`Predicate`/`Function` 函数式接口、`Comparator.comparing` 和方法引用。

## Version & Status

JDK 8，`stable`。

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

## Learning Resources

- 官方 API：[`java.util.function`](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)。
- 官方教程：[Dev.java Lambda Expressions](https://dev.java/learn/lambdas/)。
- 延伸阅读：[Baeldung Java Lambda](https://www.baeldung.com/java-8-lambda-expressions-tips)。

## Code Walkthrough

从 `LambdaMethodReferenceDemo.main` 开始，依次查看 `filter` 接收的 Lambda、`sortByName` 中的 `Task::getName`，最后查看 `format` 使用 `TaskOperations::formatTask` 的过程。

## Business Mapping

问题：筛选条件、排序字段和展示格式经常变化。特性：把它们表示为 `Predicate`、`Comparator`、`Function`。收益：遍历逻辑保持稳定。风险：复杂流程应提取为具名方法或策略对象，而非嵌入长 Lambda。

## Verification

`TaskOperationsTest` 验证筛选、排序和格式化的组合结果；主程序验证文档中的确定性输出。

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
