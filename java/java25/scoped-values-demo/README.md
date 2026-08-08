# Scoped Values (Java 25) Demo

## Feature
Java 25 稳定化 Scoped Values，提供受作用域约束的只读上下文。
## Version & Status
JDK 25；`pending_jdk25_verification`；对应 JEP 506。
## Background
请求 ID 和租户上下文需要沿调用链传递而不被任意修改。
## Problem
可变 ThreadLocal 容易泄漏和跨请求污染。
## Example
`ScopedValue.where(...).call(...)` 绑定并读取请求 ID。
## Usage Scenario
trace ID、租户和审计身份等只读请求上下文。
## Limitations
本机没有 JDK 25，尚未执行编译；值不应承载大型可变对象。
## Code Walkthrough
关键点是动态作用域和只读访问器，不是线程池或业务框架。
## Business Mapping
问题 → 上下文传递可变；特性 → ScopedValue；收益 → 生命周期清晰；风险/替代 → 简单调用优先显式参数。
## Learning Resources
- [JEP 506](https://openjdk.org/jeps/506)（★★★★★，稳定语义）
- [Java 25 API](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/ScopedValue.html)（★★★★★，契约）
- [Inside Java](https://inside.java/tag/scoped-values/)（★★★★☆，演进背景）
## Run
安装 JDK 25 后执行 `mvn clean test`，再运行主类。
## Verification
状态固定为 `pending_jdk25_verification`，待 JDK 25 安装后验证。
