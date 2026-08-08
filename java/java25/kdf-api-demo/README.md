# KDF API (Java 25) Demo

## Feature
Java 25 提供标准 Key Derivation Function API（[JEP 510](https://openjdk.org/jeps/510)）。
## Version & Status
JDK 25；`pending_jdk25_verification`；stable API 计划。
## Background
协议常需要从主密钥派生会话密钥、上下文密钥或子密钥。
## Problem
项目自行拼接 HKDF 容易出现参数和实现不一致。
## Example
案例获取 `HKDF-SHA256` 实例，后续验证批次补充完整参数派生。
## Usage Scenario
会话密钥、密钥分层和协议上下文隔离。
## Limitations
算法可用不等于密钥管理正确；本机未安装 JDK 25，未验证 provider 行为。
## Code Walkthrough
API 获取与真正派生分离，避免把演示误当成生产密钥方案。
## Business Mapping
问题 → 密钥派生实现分散；特性 → KDF API；收益 → 标准化入口；风险/替代 → 仍需 HSM、轮换和审计设计。
## Learning Resources
- [JEP 510](https://openjdk.org/jeps/510)（★★★★★，API 设计）
- [Java Cryptography Architecture](https://docs.oracle.com/en/java/javase/25/security/java-cryptography-architecture-jca-reference-guide.html)（★★★★★，安全边界）
- [JavaGuide](https://github.com/Snailclimb/JavaGuide)（★★★☆☆，中文索引）
## Run
安装 JDK 25 后执行 `mvn clean test`。
## Verification
`pending_jdk25_verification`；需验证 HKDF 参数规范和 provider 支持矩阵。
