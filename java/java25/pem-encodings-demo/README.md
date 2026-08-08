# PEM Encodings (Java 25 Preview) Demo

## Feature
Java 25 预览 PEM 编解码 API（JEP 470）统一处理密钥、证书和自定义 PEM 内容。
## Version & Status
JDK 25；`pending_jdk25_verification`；需要 `--enable-preview`。
## Background
PEM 是安全对象常见的文本传输格式，但 Java 平台过去缺少统一入口。
## Problem
手工拼接 header/footer 和 Base64 容易产生格式错误。
## Example
`PEMRecord.toString()` 将类型和 Base64 内容格式化为 PEM 文本。
## Usage Scenario
密钥、证书和配置材料的导入导出。
## Limitations
示例不处理私钥保护；预览 API 和安全策略必须在 JDK 25 验证。
## Code Walkthrough
Record 只表示数据，`PEMEncoder/Decoder` 负责对象编码和解码。
## Business Mapping
问题 → PEM 格式实现重复；特性 → 标准 PEM API；收益 → 统一边界；风险/替代 → 密钥存储、密码和审计仍需专门设计。
## Learning Resources
- [JEP 470](https://openjdk.org/jeps/470)（★★★★★，预览设计）
- [PEMEncoder API](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/security/PEMEncoder.html)（★★★★★，官方契约）
- [Java Security Guide](https://docs.oracle.com/en/java/javase/25/security/)（★★★★☆，安全实践）
## Run
JDK 25 下执行 `mvn clean test`，运行时添加 `--enable-preview`。
## Verification
`pending_jdk25_verification`；需验证 RFC 7468 边界、解码失败和密钥保护行为。
