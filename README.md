# tu-lang-lab

个人 Programming Language Lab，用于长期沉淀编程语言的版本演进、语言特性、语法能力、运行机制、标准库与语言设计思想。

## 范围

本仓库关注语言本身，而非业务功能或框架生态：

- Language Feature
- Syntax Evolution
- Runtime Behavior
- Standard Library
- Programming Paradigm
- Language Design

Spring、Spring AI、LangChain、FastAPI、Vue、React 等框架学习不放入本仓库；它们属于后续独立的 `framework-lab`。

## 语言目录

- [`java/`](java/README.md)：按 JDK 版本与 JVM 专题学习 Java。
- [`python/`](python/README.md)：学习 Python 语言、标准库与运行时行为。
- [`rust/`](rust/README.md)：学习 Rust 的所有权、类型系统与内存模型。
- [`frontend/`](frontend/README.md)：学习 JavaScript、TypeScript 与 Web API。
- [`go/`](go/README.md)：学习 Go 类型、接口、泛型、并发与标准库。
- [`c/`](c/README.md)：学习 C 类型、指针、内存、标准库与构建机制。
- [`docs/`](docs/README.md)：维护学习路线、环境约定、语言特性地图和学习资源导航。

Java 首轮地图包含 50 个相互独立的 Maven Demo，其中新增的 JDK8 基础入门层覆盖面向对象、集合、泛型、异常、文件 IO、HTTP 网络和线程同步。建议从 [Java 跨代故事线](docs/java-cross-generation-story.md) 和 [版本演进与推荐顺序](docs/java-version-evolution-guide.md) 开始，再按 [Java 特性地图](docs/java-feature-map.md) 进入具体案例；学习地址、GitHub/博客推荐和星级理由见 [Java 学习资源](docs/java-learning-resources.md)，业务问题导航见 [Java 业务场景地图](docs/java-business-scenario-map.md)。

跨语言学习建议阅读 [跨语言学习路线](docs/cross-language-learning-roadmap.md)，再按 [Python 地图](docs/python-feature-map.md)、[Rust 地图](docs/rust-feature-map.md) 和 [Frontend 地图](docs/frontend-feature-map.md) 进入案例；各语言的官方、GitHub 与博客资源及星级理由集中在 [语言学习资源](docs/language-learning-resources.md)。

Go 与 C 的推荐顺序见 [Go 与 C 学习路线](docs/go-c-learning-roadmap.md)，能力索引见 [Go 地图](docs/go-feature-map.md) 和 [C 地图](docs/c-feature-map.md)。

具体的前置案例、后续案例、运行命令和完整性检查见 [K5 学习案例目录](docs/learning-case-catalog.md)。

## 添加学习案例

1. 选择对应语言与主题目录，一个案例只说明一个语言能力。
2. 为案例创建独立可运行工程：Java 使用 Maven、Python 使用 `pyproject.toml`、Rust 使用 Cargo、前端使用 pnpm。
3. 添加案例 `README.md`，至少包含 Feature、Background、Problem、Example、Usage Scenario、Limitations 和 Run。
4. 在对应的特性地图中登记语言、版本、特性与案例路径。
5. 在本机独立运行该案例后再提交。

根目录不提供 Maven 聚合工程或跨语言统一构建命令；每个案例应能脱离其他案例独立理解和运行。
