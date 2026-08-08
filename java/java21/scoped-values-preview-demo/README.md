# Scoped Values (Java 21 Preview) Demo

## Feature

Java 21 预览 `ScopedValue`（[JEP 446](https://openjdk.org/jeps/446)）为调用链提供不可变、受作用域约束的上下文值。

## Version & Status

- JDK: 21
- Status: preview；编译、测试、运行均启用 `--enable-preview`。

## Background

请求 ID、租户或审计身份需要沿调用链读取。可变 `ThreadLocal` 容易产生泄漏、意外修改和异步继承边界问题。

## Problem

日志和下游调用需要读取请求上下文，但不希望每个方法都增加一个显式参数，也不希望调用者能修改上下文。

## Example

`ScopedValue.where(...).call(...)` 只在回调期间绑定请求 ID；作用域结束后该值不可见。

## Code Walkthrough

- `REQUEST_ID` 是共享的键，不存储可变状态。
- `where` 建立动态作用域，`currentRequestId` 只能在作用域内读取。

## Business Mapping

问题 → 请求上下文传递分散且可变；特性 → Scoped Values；收益 → 只读、生命周期清晰、适合结构化并发继承；风险/替代 → 预览语义可能变化，简单场景优先显式参数，遗留代码可谨慎使用 `ThreadLocal`。

## Usage Scenario

适合 trace ID、租户 ID、权限快照等请求级只读数据；敏感信息仍需遵守访问控制，不能因上下文 API 而自动获得安全性。

## Limitations

- Java 21 为预览 API，不能作为稳定兼容承诺。
- 作用域值不应承载大型可变对象，也不应替代业务参数建模。

## Learning Resources

- [JEP 446](https://openjdk.org/jeps/446)（★★★★★，预览设计与边界）
- [Dev.java — Scoped Values](https://dev.java/learn/scoped-values/)（★★★★★，官方示例）
- [Inside Java — Scoped Values](https://inside.java/tag/scoped-values/)（★★★★☆，版本演进）

## Run

```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn package
java --enable-preview -cp target/classes com.tu.languagelab.java21.scopedvalues.ScopedValuesDemo
```

## Verification

主类输出 `request=r-21`；Maven 编译与 Surefire 已显式配置预览参数。
