# 文档导航

本目录保存跨案例、可长期复用的学习导航；具体 API 行为和运行结论仍以各个 Demo 的 README、源码与可复现命令为准。

| 文档 | 功能 | 使用时机 |
| --- | --- | --- |
| [learning-roadmap.md](learning-roadmap.md) | 定义学习阶段、先后顺序与不包含的框架范围 | 选择下一项学习主题时 |
| [java-feature-map.md](java-feature-map.md) | 把 Java 版本、能力状态与建议 Demo 名称建立索引 | 新增或查找 Java 案例时 |
| [environment-setup.md](environment-setup.md) | 说明多 JDK、Python、Rust 与 pnpm 的本机环境边界 | 首次配置 macOS 或 WSL2 环境时 |
| [java-learning-resources.md](java-learning-resources.md) | 汇总官方规范、参考实现资料与补充博客 | 学习某项 Java/JVM 能力前或遇到版本差异时 |

## 文档维护规则

- 特性地图中的案例路径只有在案例真实存在且已独立运行后才从 `TBD` 改为链接。
- 版本、预览、孵化和实验状态以 OpenJDK 的发行页与 JEP 为准；博客只用于解释、经验和延伸阅读。
- 性能、GC、JIT 与并发结论记录在具体案例中，并附上 JDK、JVM 参数、操作系统与复现命令。
