# Java 17 能力区

JDK 17 是默认开发基线。这里聚焦数据建模、受限层级与更清晰的控制流；部分能力的首次发布版本早于 17，但案例统一以 JDK 17 验证。

| 能力 | 状态 | 关注问题 | 建议 Demo |
| --- | --- | --- | --- |
| Record | stable | 值对象、不可变数据载体与构造约束 | `record-value-object-demo` |
| Sealed Class | stable | 封闭类型层级与穷尽性建模 | `sealed-hierarchy-demo` |
| `instanceof` Pattern Matching | stable | 类型检查与绑定变量合并 | `instanceof-pattern-demo` |
| Text Block | stable | 多行文本、缩进和转义规则 | `text-block-formatting-demo` |
| Switch Expression | stable | 表达式式分支、`yield` 与穷尽性 | `switch-expression-demo` |
| Pattern Matching for `switch` | preview | 密封层级上的模式分派；需 `--enable-preview` | `pattern-switch-preview-demo` |
| `HexFormat` | stable | 十六进制编码和解码 | `hex-format-demo` |
| `RandomGenerator` | stable | 可选择、可拆分的随机数生成器 | `random-generator-demo` |

## 学习边界

- Record 不是所有领域模型的替代品；重点比较值语义、可变性和构造校验。
- Sealed Class 的价值在于控制可扩展边界，应与 switch 的穷尽性案例配套观察。
- JDK 17 的 pattern switch 是预览能力，不得按稳定 API 对外承诺兼容性。
