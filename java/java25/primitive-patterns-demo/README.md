# Primitive Patterns (Java 25) Demo

## Feature
Java 25 预览 primitive types in patterns、`instanceof` 和 `switch`（JEP 507）。
## Version & Status
JDK 25；`pending_jdk25_verification`；需要 `--enable-preview`。
## Background
模式匹配长期主要处理引用类型，数值分类常需要显式装箱和拆箱。
## Problem
解析输入时要按 `int`、`long` 和其他值分支。
## Example
`case int number` 与 `case long number` 直接绑定 primitive 值。
## Usage Scenario
协议字段、数值路由和类型敏感的解析器。
## Limitations
预览语义和数值转换边界需以 JDK 25 JLS 为准；本机未验证。
## Code Walkthrough
`null` 与 `default` 仍显式处理，避免把 primitive 模式误解为全覆盖。
## Business Mapping
问题 → 数值分支装箱样板；特性 → primitive pattern；收益 → 类型意图直接；风险/替代 → 稳定基线使用显式类型判断。
## Learning Resources
- [JEP 507](https://openjdk.org/jeps/507)（★★★★★，预览规则）
- [JLS 25](https://docs.oracle.com/javase/specs/jls/se25/html/index.html)（★★★★★，语言语义）
- [Inside Java Pattern Matching](https://inside.java/tag/pattern-matching/)（★★★★☆，演进）
## Run
JDK 25 下 `mvn clean test`；主类用 `java --enable-preview` 运行。
## Verification
`pending_jdk25_verification`；需验证 primitive widening、null 和穷尽性诊断。
