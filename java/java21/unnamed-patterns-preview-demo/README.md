# Unnamed Patterns (Java 21 Preview) Demo

## Feature

Java 21 预览未命名模式（[JEP 443](https://openjdk.org/jeps/443)）允许用 `_` 表达“匹配但不使用”的模式变量或 Record 组件。

## Version & Status

- JDK: 21
- Status: preview；编译、测试、运行均启用 `--enable-preview`。

## Background

模式匹配常常只关心对象的类型，不关心其部分组件。给无用组件命名会制造未使用变量和误导性语义。

## Problem

分类消息、校验输入时只需要判断“是不是某种 Record”，不需要读取其中的具体字段。

## Example

`case Box(_)` 匹配任意 `Box`，但明确忽略其 `value` 组件。

## Code Walkthrough

- `_` 不会引入可读取的变量，因此不会被误用。
- 仍然保留 `null` 和 `default` 分支，展示开放输入的完整处理。

## Business Mapping

问题 → 类型判断代码充满无意义变量；特性 → unnamed pattern；收益 → 意图更明确、减少误用；风险/替代 → 预览语法可能变化，稳定基线可使用普通类型模式并接受未使用变量。

## Usage Scenario

适合事件分类、协议版本识别、只关心类型的校验分支。

## Limitations

- 仅为预览特性，必须与编译器和运行时使用同一 JDK。
- `_` 不是普通变量名，不能在表达式中读取。

## Learning Resources

- [JEP 443](https://openjdk.org/jeps/443)（★★★★★，预览设计）
- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/index.html)（★★★★★，模式语义）
- [Inside Java — Pattern Matching](https://inside.java/tag/pattern-matching/)（★★★★☆，演进背景）

## Run

```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn package
java --enable-preview -cp target/classes com.tu.languagelab.java21.unnamedpatterns.UnnamedPatternsDemo
```

## Verification

主类输出 `box`；Maven 已将 `--enable-preview` 同时传给编译与测试。
