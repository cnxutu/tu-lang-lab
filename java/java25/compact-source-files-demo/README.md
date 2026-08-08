# Compact Source Files (Java 25) Demo

## Feature
Java 25 简化小型程序的源文件和隐式启动入口。
## Version & Status
JDK 25；`pending_jdk25_verification`；对应 JEP 512。
## Background
语言学习和一次性工具不应被样板类、构造器和 main 签名淹没。
## Problem
最小程序的教学重点被启动样板代码分散。
## Example
当前工程保留显式类作为 Maven/JUnit 兼容基线，README 记录待 JDK 25 验证的 compact source 语法入口。
## Usage Scenario
教学片段、命令行小工具和快速 demo。
## Limitations
构建工具、测试框架和文件命名规则仍需验证；本机没有 JDK 25。
## Code Walkthrough
示例行为保持确定性，特性语法将在 JDK 25 验证批次中补上最小入口。
## Business Mapping
问题 → 小工具样板过重；特性 → compact source；收益 → 更快试验；风险/替代 → 复杂程序仍使用显式类结构。
## Learning Resources
- [JEP 512](https://openjdk.org/jeps/512)（★★★★★，正式设计）
- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se25/html/index.html)（★★★★★，语法依据）
- [Dev.java](https://dev.java/learn/)（★★★★☆，入门实践）
## Run
安装 JDK 25 后执行 `mvn clean test`，再按 JEP 示例验证 compact source 文件。
## Verification
`pending_jdk25_verification`；当前仅完成源码结构和文档静态复核。
