# 开发环境约定

本仓库需要同时在 macOS 和 Windows WSL2 Ubuntu 中可用。具体安装路径和个人环境变量不提交到仓库。

## Java

- 默认 JDK：17。
- 案例按自身 `pom.xml` 的 `maven.compiler.release` 绑定语言级别，不建立根级 Maven 聚合工程。
- 需要多个 JDK 的案例使用 Maven Toolchains；本机 `toolchains.xml` 只保存本机 JDK 路径，不提交。
- 预览特性案例必须明确添加 `--enable-preview`，并在 README 写明对应 JDK。

基本检查：

```text
java -version
mvn -version
```

## Python

- 每个案例使用独立 `pyproject.toml`，遵循 PEP 621 元数据约定。
- 推荐使用 `uv` 创建与运行虚拟环境；不把 `.venv/` 提交到仓库。
- 不引入 FastAPI、LangChain 等框架依赖。

## Rust

- 使用 `rustup` 管理工具链，案例作为独立 Cargo crate。
- 每个案例通过 `cargo run` 或 `cargo test` 独立验证。

## Frontend

- 使用 Node.js LTS 与 pnpm。
- 浏览器案例可用 Vite 提供本地开发服务器；Vite 只承担运行与构建，不作为学习主题。
- 不在本仓库引入 Vue、React 等框架。
