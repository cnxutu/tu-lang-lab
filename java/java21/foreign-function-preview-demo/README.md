# Foreign Function & Memory API (Java 21 Preview) Demo

## Feature
Java 21 的 FFM API（[JEP 442](https://openjdk.org/jeps/442)）预览版位于 `java.lang.foreign`，允许在受作用域管理的 native 内存上调用外部函数。

## Version & Status
- JDK 21；preview；使用 `--enable-preview`。早期 JDK 版本的 incubator 模块名不同，不应混用。

## Background
JNI 能力强但样板代码和内存边界成本高；FFM 尝试把 native 调用与生命周期表达得更直接。

## Problem
需要调用系统 `strlen` 时，示例必须明确 native 符号查找、函数描述和内存释放。

## Example
`NativeStringLength` 查找 `strlen`，把 Java 字符串转成 session 管理的 C 字符串后调用。

## Code Walkthrough
`Arena` 是 native 内存生命周期；`MethodHandle` 与 `FunctionDescriptor` 描述调用签名。

## Business Mapping
问题 → 与系统库或高性能 native 能力交互；特性 → FFM；收益 → 少量 glue code、作用域释放；风险/替代 → 预览 API、平台符号和 ABI 差异，生产应先评估 JNI、Panama 版本和安全审计。

## Usage Scenario
系统调用、压缩/加密库桥接和渐进式 native 集成实验。

## Limitations
依赖操作系统的 `strlen` 符号和 C ABI；不要把它当作跨平台业务接口。

## Learning Resources
- [JEP 442](https://openjdk.org/jeps/442)（★★★★★，第三次预览语义）
- [JDK 21 FFM API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/foreign/package-summary.html)（★★★★★，API 参考）
- [Inside Java — Panama](https://inside.java/tag/panama/)（★★★★☆，项目演进）

## Run
```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
mvn package
java --enable-preview -cp target/classes com.tu.languagelab.java21.foreignfunction.ForeignFunctionDemo
```

## Verification
验证必须记录 JDK 21、OS、ABI、模块和预览参数；主类预期输出 `2`。
