# Generics Basics Demo

## Feature
通过泛型类、泛型方法和边界通配符实现类型安全复用。

## Version & Status
JDK 8；`stable`。

## Background
没有泛型时集合读取需要强制转换，错误会延迟到运行期。

## Problem
同一算法应支持多种可比较类型，同时尽量让编译器检查类型。

## Example
`Box<T>` 保存类型信息，`GenericAlgorithms.max` 使用 `Comparable` 上界。

## Usage Scenario
容器、工具方法、Repository 返回值和可复用算法。

## Limitations
泛型主要在编译期生效，受类型擦除影响，不能直接创建 `new T()`。

## Code Walkthrough
`T extends Comparable` 保证可比较；`List<? extends T>` 允许传入子类型列表。

## Business Mapping
问题 → 复用代码依赖强制转换；特性 → 泛型约束；收益 → 编译期类型安全；风险/替代 → 复杂类型边界要保持可读。

## Learning Resources
- [Java Generics Tutorial](https://docs.oracle.com/javase/tutorial/java/generics/)（★★★★★，官方教程）
- [JLS Generics](https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html)（★★★★★，语言语义）
- [JavaGuide 泛型](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文示例）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `GenericsBasicsDemo`。

## Verification
测试验证 `Box<String>` 与整数列表最大值，并覆盖类型边界的正常路径。

