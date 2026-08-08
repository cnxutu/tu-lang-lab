# Flexible Constructor Bodies (Java 25) Demo

## Feature
Java 25 允许构造器在显式 `super(...)` 前进行受限的参数校验和准备。
## Version & Status
JDK 25；`pending_jdk25_verification`；对应 JEP 513。
## Background
子类构造器过去必须先调用父类构造器，导致简单参数校验需要额外静态方法或重复逻辑。
## Problem
范围对象要在父类初始化前拒绝非法边界。
## Example
`ValidatedRange` 在 `super` 前检查 `start <= end`。
## Usage Scenario
值对象、范围、协议参数和构造前不变量校验。
## Limitations
在父类初始化前不能访问未初始化的 `this`；本机未安装 JDK 25。
## Code Walkthrough
校验是无副作用的，父类仍负责保存状态。
## Business Mapping
问题 → 构造校验分散；特性 → flexible constructor bodies；收益 → 不变量更靠近入口；风险/替代 → 复杂初始化仍应使用工厂方法。
## Learning Resources
- [JEP 513](https://openjdk.org/jeps/513)（★★★★★，构造器规则）
- [JLS Constructors](https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html)（★★★★★，语义）
- [Inside Java](https://inside.java/)（★★★★☆，版本解读）
## Run
安装 JDK 25 后执行 `mvn clean test`。
## Verification
`pending_jdk25_verification`；需确认编译器对前置语句和 `this` 访问限制的诊断。
