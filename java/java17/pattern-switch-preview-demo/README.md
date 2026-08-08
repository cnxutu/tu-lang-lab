# Pattern Matching for switch (Java 17 Preview) Demo

## Feature

Java 17 以预览特性形式引入 Pattern Matching for `switch`（[JEP 406](https://openjdk.org/jeps/406)）。它后来在 Java 21 通过 [JEP 441](https://openjdk.org/jeps/441) 正式化。

## Version & Status

- JDK: 17
- Status: preview；编译、测试和运行都必须启用 `--enable-preview`。

## Background

在 Java 17，类型模式 `switch` 仍处于语言设计验证阶段，因此不能把预览 API/语法当作长期兼容承诺。

## Problem

当输入可为多种类型（例如解析后的配置值），传统的 `if/else instanceof` 链既冗长又容易遗漏 `null` 分支。

## Example

`ValueFormatter` 根据 `Integer`、`String`、`null` 或其他类型选择格式化结果。这个例子刻意保留 `default`，因为 `Object` 是开放类型。

## Code Walkthrough

- `case Integer number` 在匹配成功后获得已转换的 `number`。
- `case null` 明确指定空值策略；避免误以为模式分支会自动处理它。

## Business Mapping

问题 → 多形态输入的分支与强制转换混在一起；特性 → 类型模式 `switch`；收益 → 分支更集中、少一次显式 cast；风险/替代 → 这是 Java 17 预览能力，生产基线应优先使用 Java 21 的稳定版本，或使用 Java 17 的 `instanceof` pattern。

## Usage Scenario

用于学习语言演进和隔离实验；不建议以 Java 17 预览语法作为需要长期二进制兼容的公共库接口。

## Limitations

- 仅适用于 JDK 17，且每次编译/运行都要 `--enable-preview`。
- Java 21 的最终语义是后续版本结论，不能反推为 Java 17 预览 API 的兼容保证。

## Learning Resources

- 官方预览说明：[JEP 406](https://openjdk.org/jeps/406)（★★★★★，Java 17 语义与边界）
- 官方正式版说明：[JEP 441](https://openjdk.org/jeps/441)（★★★★★，用于比较最终设计）
- 社区延伸：[Foojay — Pattern Matching](https://foojay.io/today/pattern-matching-for-switch-in-java-17/)（★★★★☆，适合快速建立使用直觉）

## Run

macOS / WSL：

```bash
export JAVA_HOME=/path/to/jdk-17
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn package
java --enable-preview -cp target/classes com.tu.languagelab.java17.patternswitchpreview.PatternSwitchPreviewDemo
```

## Verification

`mvn clean test` 已由 Maven 的编译器与 Surefire 配置传入 `--enable-preview`。主类应输出 `integer:7`、`text:lab`、`null`。
