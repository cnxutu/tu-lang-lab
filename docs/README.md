# 文档导航

本目录保存跨案例、可长期复用的学习导航；具体 API 行为和运行结论仍以各个 Demo 的 README、源码与可复现命令为准。

| 文档 | 功能 | 使用时机 |
| --- | --- | --- |
| [learning-roadmap.md](learning-roadmap.md) | 定义学习阶段、先后顺序与不包含的框架范围 | 选择下一项学习主题时 |
| [java-feature-map.md](java-feature-map.md) | 把 Java 版本、能力状态与建议 Demo 名称建立索引 | 新增或查找 Java 案例时 |
| [environment-setup.md](environment-setup.md) | 说明多 JDK、Python、Rust 与 pnpm 的本机环境边界 | 首次配置 macOS 或 WSL2 环境时 |
| [environment-setup-guide.md](environment-setup-guide.md) | 按 Windows 宿主 + WSL2 Ubuntu、macOS 给出安装步骤、工具选择、脚本和调试入口 | 第一次配置 K5 或换机器时 |
| [ide-and-editor-guide.md](ide-and-editor-guide.md) | 说明 VS Code 统一编辑、终端、运行和调试流程，并解释 IDEA 的可选边界 | 决定使用哪个 IDE 或首次打开 K5 时 |
| [`check-environment.sh`](../scripts/check-environment.sh) | 在 WSL2 Ubuntu/macOS 检查当前工具链是否具备 K5 所需命令 | 安装工具后或排查 PATH 时 |
| [`bootstrap-wsl-ubuntu.sh`](../scripts/bootstrap-wsl-ubuntu.sh)、[`bootstrap-macos.sh`](../scripts/bootstrap-macos.sh) | 在 Linux/macOS 工具链环境中初始化语言工具，可选安装 Tomcat | 新机器初始化 K5 时 |
| [`set-java-home.sh`](../scripts/set-java-home.sh) | 在 WSL2 Ubuntu/macOS 当前终端切换 JDK 8/17/21/25 | 运行不同 Java 版本 Demo 时 |
| [java-learning-resources.md](java-learning-resources.md) | 汇总官方规范、参考实现资料与补充博客 | 学习某项 Java/JVM 能力前或遇到版本差异时 |
| [java-business-scenario-map.md](java-business-scenario-map.md) | 从业务问题反查 Java 特性、收益与误用边界 | 知道问题但不知道应学习何种语言能力时 |
| [java-version-evolution-guide.md](java-version-evolution-guide.md) | 比较 Java 8、17、21、25 的能力演进并给出 Demo 学习顺序 | 需要决定下一步学习哪个 JDK 或特性时 |
| [java-cross-generation-story.md](java-cross-generation-story.md) | 解释各代 Java 面对的旧问题、引入背景和对应案例 | 想理解“为什么出现这个新概念”时 |
| [python-feature-map.md](python-feature-map.md) | Python 语法、标准库、类型与异步案例索引 | 选择 Python 学习主题时 |
| [rust-feature-map.md](rust-feature-map.md) | Rust 类型、所有权、借用、生命周期与 Trait 案例索引 | 按编译器安全模型学习 Rust 时 |
| [frontend-feature-map.md](frontend-feature-map.md) | JavaScript、TypeScript 与 Web API 案例索引 | 学习前端语言本身时 |
| [cross-language-learning-roadmap.md](cross-language-learning-roadmap.md) | 解释 Python、JS/TS、Rust 与 Java 的递进关系 | 需要跨语言安排学习顺序时 |
| [language-learning-resources.md](language-learning-resources.md) | 汇总官方、GitHub、国内外社区资源并给出星级理由 | 选择外部学习资料时 |
| [language-version-evolution-guide.md](language-version-evolution-guide.md) | 梳理 Python、JavaScript、TypeScript 与 Rust 的版本演进背景 | 需要理解“为什么先学这个 Demo”时 |
| [learning-case-catalog.md](learning-case-catalog.md) | 给出每个案例的前置、后续、验证命令和完整性检查清单 | 按顺序学习或检查案例是否缺项时 |
| [go-feature-map.md](go-feature-map.md) | Go 类型、接口、泛型、并发与标准库案例索引 | 学习 Go 语言能力时 |
| [c-feature-map.md](c-feature-map.md) | C 指针、内存、结构体、标准库与构建案例索引 | 学习 C 底层能力时 |
| [go-c-learning-roadmap.md](go-c-learning-roadmap.md) | 解释 C 与 Go 的递进关系和对照学习方法 | 同时学习 C 与 Go 时 |

## 文档维护规则

- 特性地图中的案例路径只有在案例真实存在且已独立运行后才从 `TBD` 改为链接。
- 版本、预览、孵化和实验状态以 OpenJDK 的发行页与 JEP 为准；博客只用于解释、经验和延伸阅读。
- 性能、GC、JIT 与并发结论记录在具体案例中，并附上 JDK、JVM 参数、操作系统与复现命令。
