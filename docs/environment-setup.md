# 开发环境约定

本仓库需要同时在 macOS 和 Windows WSL2 Ubuntu 中可用。具体安装路径和个人环境变量不提交到仓库。

需要按操作系统从零配置时，先阅读 [环境上手指南](environment-setup-guide.md) 和 [VS Code 编辑器与调试指南](ide-and-editor-guide.md)；本页保留工具链约束、案例命令和当前验证边界。

新机器可以先预览并执行对应 Bootstrap 脚本：WSL2 Ubuntu 使用 `scripts/bootstrap-wsl-ubuntu.sh`，macOS 使用 `scripts/bootstrap-macos.sh`。Windows 不维护原生语言工具链，只安装 VS Code、Windows Terminal 和 WSL2；脚本默认只预览，确认后加 `-Install` 或 `--install`；Tomcat 只有显式指定 include 选项才安装。

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
- 当前 Windows 主机尚未发现 `rustc`/`cargo`；Rust 案例已完成源码、Cargo manifest 和 README 静态审计，统一标记 `toolchain_pending_verification`。
- 安装后执行 `rustup default stable`，再按 [学习案例目录](learning-case-catalog.md) 的顺序逐个运行 `cargo test`。

## Frontend

- 使用 Node.js LTS 与 pnpm。
- 浏览器案例可用 Vite 提供本地开发服务器；Vite 只承担运行与构建，不作为学习主题。
- 不在本仓库引入 Vue、React 等框架。

## Go

- 推荐使用 Go 官方安装包或版本管理工具，案例为独立 Go module。
- 每个案例执行 `go test ./...`；并发案例额外执行 `go test -race ./...`。
- 当前主机未发现 `go` 命令，案例统一标记 `toolchain_pending_verification`。

## C

- 推荐使用 GCC 或 Clang，案例为独立 Make 工程，默认 C11。
- 每个案例执行 `make test`，再执行 `make` 和 `./demo`。
- 当前主机未发现 `gcc`/`clang`，案例统一标记 `toolchain_pending_verification`。
