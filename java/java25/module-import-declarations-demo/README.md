# Module Import Declarations (Java 25) Demo

## Feature
Java 25 允许按模块导入模块导出的类型，减少大量逐类 import。
## Version & Status
JDK 25；`pending_jdk25_verification`；对应 JEP 511。
## Background
使用模块 API 时，逐个导入类型会让示例和教学代码显得冗长。
## Problem
跨模块示例需要声明多个相关类型，导入列表掩盖了模块边界。
## Example
`import module java.sql;` 后直接使用 `Driver`。
## Usage Scenario
模块化教学、工具型示例和同一模块多个 API 的实验。
## Limitations
冲突类型仍需显式导入或限定名；本机没有 JDK 25，未编译验证。
## Code Walkthrough
语法表达的是模块依赖视角，不会绕过模块可读性和导出规则。
## Business Mapping
问题 → 模块示例导入噪音；特性 → module import；收益 → 更聚焦模块边界；风险/替代 → 公共库 API 仍建议显式 import。
## Learning Resources
- [JEP 511](https://openjdk.org/jeps/511)（★★★★★，语言设计）
- [Java Platform Module System](https://docs.oracle.com/javase/9/docs/api/java/lang/module/package-summary.html)（★★★★☆，模块 API）
- [JavaGuide](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文索引）
## Run
安装 JDK 25 后执行 `mvn clean test`。
## Verification
`pending_jdk25_verification`；待验证编译器对模块导入和冲突处理的具体诊断。
