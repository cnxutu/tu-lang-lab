# Stable Values (Java 25 Preview) Demo

## Feature
Java 25 预览 StableValue 提供至多设置一次的懒初始化容器（JEP 502）。
## Version & Status
JDK 25；`pending_jdk25_verification`；需要 `--enable-preview`。
## Background
固定配置和派生对象需要懒加载，但初始化完成后不应再变化。
## Problem
普通可变字段需要额外同步和不可变性约束。
## Example
`orElseSet` 只在首次访问时计算并设置标签。
## Usage Scenario
解析器、不可变配置和热点路径的稳定派生值。
## Limitations
已设置内容会强引用对象；预览 API 需验证并不等于通用缓存。
## Code Walkthrough
StableValue 本身是 holder，不应被当作普通 setter 字段暴露。
## Business Mapping
问题 → 懒初始化状态可被意外改写；特性 → StableValue；收益 → 至多一次设置和潜在优化；风险/替代 → 生命周期复杂时使用显式缓存。
## Learning Resources
- [JEP 502](https://openjdk.org/jeps/502)（★★★★★，预览设计）
- [StableValue API](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StableValue.html)（★★★★★，方法契约）
- [Inside Java](https://inside.java/)（★★★★☆，JVM 优化背景）
## Run
JDK 25 下执行 `mvn clean test`，运行时添加 `--enable-preview`。
## Verification
`pending_jdk25_verification`；需验证并发 `orElseSet`、递归初始化和内存保持行为。
