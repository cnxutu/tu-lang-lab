# K5 编辑器与调试指南

## 结论：统一使用 VS Code

K5 是多语言学习实验室，推荐只使用 VS Code 作为统一的编辑器、集成终端和调试入口。VS Code 不会替代语言工具链：

| 学习方向 | 实际编译器或运行时 | VS Code 入口 |
| --- | --- | --- |
| Java/JVM | JDK、Maven | Extension Pack for Java、Maven 面板、Java 调试器 |
| Python | Python 解释器、`venv` | Python 扩展、测试面板、断点调试 |
| Rust | `rustc`、Cargo | rust-analyzer、Cargo 命令、调试器 |
| Go | `go`、Delve | Go 扩展、`go test`、Go Debug |
| C | GCC/Clang、Make、GDB/LLDB | C/C++ 扩展、任务、GDB/LLDB |
| JavaScript/TypeScript/Web API | Node.js、pnpm、浏览器 | ESLint、Node.js、浏览器 DevTools |

官方入口：[Visual Studio Code 文档](https://code.visualstudio.com/docs)。

## Windows 宿主 + WSL2 工作流

安装 Windows 版 VS Code 后，在 PowerShell 中进入 WSL，再打开 K5：

```powershell
wsl
cd /mnt/d/workspace/github/tu-lang-lab
code .
```

Windows 只安装 VS Code、Windows Terminal 和 WSL2，不在 Windows 原生维护 K5 的 JDK、Python、Rust、Go、C 或 Node 工具链。打开根目录只用于导航，真正运行在 WSL 中完成。K5 没有根目录 Maven 聚合工程，运行时请进入具体案例，例如：

```bash
cd /mnt/d/workspace/github/tu-lang-lab/java/java17/record-value-object-demo
mvn clean test
```

Java 8/17/21/25 案例运行前，在 WSL 当前终端切换 JDK，再确认 Maven 使用的版本：

```bash
cd /mnt/d/workspace/github/tu-lang-lab
bash scripts/set-java-home.sh 17
mvn -version
```

## WSL2 Ubuntu 中的 VS Code 窗口

WSL2 是 K5 的主工具链环境，适合 Linux 命令行、Java、Python、Rust、Go、C、Frontend 和与 CI 一致的环境。VS Code 安装在 Windows，使用 Remote - WSL 连接 Ubuntu。官方说明见 [VS Code WSL 教程](https://learn.microsoft.com/en-us/windows/wsl/tutorials/wsl-vscode)。

```bash
cd /mnt/d/workspace/github/tu-lang-lab
code .
```

左下角显示 `WSL: Ubuntu` 后，VS Code 的终端、扩展和调试器都运行在 WSL 环境。不要在同一个目录混用 Windows 与 WSL 生成的 `target`、`node_modules`、Cargo target 或可执行文件。

长时间构建时，建议把仓库放在 WSL 文件系统：

```bash
mkdir -p ~/workspace
cp -a /mnt/d/workspace/github/tu-lang-lab ~/workspace/
cd ~/workspace/tu-lang-lab
code .
```

## macOS 工作流

安装 VS Code 和本机工具链后：

```bash
cd ~/workspace/tu-lang-lab
code .
```

在 VS Code 集成终端按 Demo README 运行命令。Java 使用 JDK/Maven，C 使用 Apple Clang，Rust 使用 Cargo，Go 使用 `go`，Frontend 使用 Node.js/pnpm。

## 推荐扩展

- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Python](https://marketplace.visualstudio.com/items?itemName=ms-python.python)
- [rust-analyzer](https://marketplace.visualstudio.com/items?itemName=rust-lang.rust-analyzer)
- [Go](https://marketplace.visualstudio.com/items?itemName=golang.go)
- [C/C++](https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools)
- [ESLint](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)
- [WSL](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-wsl)

仓库提供 `.vscode/extensions.json` 作为推荐清单；扩展安装位置会随当前窗口是 Windows 还是 WSL 而变化。

## 单个 Demo 的标准学习循环

```text
打开 Demo README
→ 阅读 Feature/Background
→ 在 VS Code 中运行测试
→ 进入 src/main 修改代码
→ 设置断点并调试
→ 对照 Limitations 和 Business Mapping 总结
```

常用入口：

- Java：运行 `mvn clean test`，从主类旁的 Run/Debug CodeLens 启动。
- Python：使用测试面板或 `python -m unittest discover -s tests`。
- Rust：使用 `cargo test`，再通过 rust-analyzer 调试。
- Go：使用 `go test ./...`，需要断点时使用 Go Debug/Delve。
- C：使用 `make test`，调试版本保留 `-g`，再使用 GDB/LLDB。
- Frontend：使用 `pnpm test` 或 README 中的 Node 命令，浏览器案例使用 DevTools。

## IntelliJ IDEA 是否可以使用

可以。Windows 上 IDEA 能打开 `D:\workspace\github\tu-lang-lab` 根目录，也能单独打开某个 Java Demo；但根目录不是 Maven 聚合项目，IDEA 不会把 Python、Rust、Go、C 和 Frontend 自动组织成统一多语言工程。

因此 IDEA 只作为 Java 深度调试的可选工具，不是 K5 必需软件。若希望只维护一个 IDE，使用 VS Code 即可。IDEA 的 Maven 功能说明见 [Maven support](https://www.jetbrains.com/help/idea/maven-support.html)。

## 常见边界

- VS Code 能统一界面，不能统一不同语言的编译器版本。
- Windows 与 WSL 必须分别维护 PATH、JDK、Python 虚拟环境和构建产物。
- 根目录没有跨语言构建命令；每个 Demo 都应脱离其他目录独立运行。
- Java 预览案例仍须按 README 传入 `--enable-preview`，不能由编辑器自动推断。
