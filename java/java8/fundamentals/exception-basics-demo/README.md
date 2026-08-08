# Exception Basics Demo

## Feature
展示 `try/catch`、自定义 checked exception 与领域错误转换。

## Version & Status
JDK 8；`stable`。

## Background
输入、文件和网络边界都可能失败，调用者需要知道如何处理而不是静默吞掉错误。

## Problem
底层 `NumberFormatException` 不应泄漏为业务接口的唯一错误语义。

## Example
`AgeParser` 将解析失败和范围错误统一表达为 `InvalidAgeException`。

## Usage Scenario
表单校验、配置读取、协议解析和批处理错误报告。

## Limitations
异常不是流程控制工具；示例不包含重试、日志和错误码体系。

## Code Walkthrough
`try` 捕获底层异常，范围校验直接抛出领域异常，方法签名强制调用者处理。

## Business Mapping
问题 → 错误语义散落；特性 → checked exception 与异常转换；收益 → 边界契约明确；风险/替代 → 高并发服务可采用统一错误结果对象。

## Learning Resources
- [Exceptions Tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/)（★★★★★，官方教程）
- [Throwable API](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)（★★★★★，契约）
- [JavaGuide 异常](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文实践）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `ExceptionBasicsDemo`。

## Verification
测试覆盖合法年龄、非数字和超范围三条路径。

