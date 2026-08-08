# Object-Oriented Basics Demo

## Feature
用类、对象、封装和不变量实现一个最小账户模型。

## Version & Status
JDK 8；`stable`。

## Background
Java 初学阶段要先理解对象如何持有状态，以及方法如何保护状态变化。

## Problem
如果调用者可以直接修改余额，非法状态会扩散到所有业务代码。

## Example
`BankAccount` 隐藏余额，只通过 `deposit` 和 `withdraw` 修改。

## Usage Scenario
账户、库存、订单等需要保护状态不变量的对象。

## Limitations
示例没有持久化、并发控制或货币精度模型，只用于理解封装。

## Code Walkthrough
构造器校验初始状态；交易方法校验增量；`balanceCents` 只读暴露状态。

## Business Mapping
问题 → 状态被任意修改；特性 → 封装与对象方法；收益 → 不变量集中保护；风险/替代 → 复杂聚合仍需领域建模与事务边界。

## Learning Resources
- [Java Tutorials Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)（★★★★★，官方入门）
- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)（★★★★★，语义依据）
- [JavaGuide 基础](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文复习索引）

## Run
设置 JDK 8 后执行 `mvn clean test`，再运行 `com.tu.languagelab.java8.fundamentals.oop.ObjectOrientedBasicsDemo`。

## Verification
测试验证正常存取与余额不足异常；主类输出 `Ada:1300`。

