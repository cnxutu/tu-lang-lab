# K5 开发环境上手指南

本指南面向 Windows 宿主 + WSL2 Ubuntu 和 macOS，目标是让第一次进入 K5 的人完成工具链安装、环境验证、Demo 运行和断点调试。

K5 实际目录：`D:\workspace\github\tu-lang-lab`。WSL 中对应 `/mnt/d/workspace/github/tu-lang-lab`。在 WSL/macOS 上长期编译时，建议将仓库放在 Linux/macOS 本地磁盘，例如 `~/workspace/tu-lang-lab`，避免在 `/mnt/d` 或外接 NTFS 目录上频繁读写构建产物。

## 1. 环境选择

| 环境 | 推荐用途 | 推荐工具 | 说明 |
| --- | --- | --- | --- |
| Windows 宿主 | 安装 VS Code、启动 WSL2、打开 Remote - WSL | Windows Terminal、VS Code、WSL2 Ubuntu | 不在 Windows 原生维护 K5 编译器或依赖 |
| Windows WSL2 Ubuntu | Linux/CI 一致的命令行学习 | OpenJDK/Temurin、Maven、Python、rustup、Node/pnpm、Go、GCC/Clang、GDB | VS Code 安装在 Windows，用 Remote - WSL 连接 |
| macOS | Unix 工具链、Clang、Homebrew | Temurin/SDKMAN、Python、Node/pnpm、rustup、Go、Apple Clang | C 使用 Xcode Command Line Tools |

推荐主线：整个 K5 统一使用 WSL2 Ubuntu 工具链和 VS Code。Windows 只承担 VS Code 宿主与 WSL 入口，Java、Python、Rust、Go、C、Frontend 全部在 WSL 中运行。VS Code 负责编辑、终端和调试，JDK、Python、rustc、Go、GCC/Clang 与 Node.js 仍是各语言真正的编译器或运行时。

K5 根目录不是 Maven 聚合工程，也没有跨语言统一构建命令。打开根目录用于导航即可；运行时必须进入具体 Demo 目录，按照该 Demo 的 README 执行命令。

## 2. 通用准备

1. 安装 [Git](https://git-scm.com/downloads)，确认 `git --version`。
2. 打开 K5，不要把 Vue、React、Spring 等框架工程放进本仓库。
3. 在 WSL/macOS 中运行环境检查脚本：

```bash
cd ~/workspace/tu-lang-lab
bash scripts/check-environment.sh
```

`-Strict`/`--strict` 会在任一工具缺失时返回非零；第一次检查建议先不使用 strict。

## 2.1 工具链初始化脚本

脚本默认只打印计划，不修改系统。确认清单后再加 `-Install` 或 `--install`。Tomcat 默认不安装，只有明确加 `-IncludeTomcat`/`--include-tomcat` 才会下载；Tomcat 不是 K5 语言案例依赖，只作为可选 Java Web 容器。

WSL2 Ubuntu：

```bash
cd /mnt/d/workspace/github/tu-lang-lab
bash scripts/bootstrap-wsl-ubuntu.sh
bash scripts/bootstrap-wsl-ubuntu.sh --install --include-tomcat
```

macOS：

```bash
cd ~/workspace/tu-lang-lab
bash scripts/bootstrap-macos.sh
bash scripts/bootstrap-macos.sh --install --include-tomcat
```

安装完成后关闭旧终端并重新打开，再在 WSL 中运行 `check-environment`。Windows 不参与 K5 编译器和依赖管理，只需要安装 [VS Code](https://code.visualstudio.com/) 与 [WSL2](https://learn.microsoft.com/en-us/windows/wsl/install)。

Tomcat 脚本默认使用 Apache 官方 Tomcat 11.0.24 下载地址；Apache 下载页提供 Windows zip、Linux tar.gz、签名和 SHA-512 校验，生产环境使用前应核对 [Tomcat 11 downloads](https://tomcat.apache.org/download-11)。macOS 优先使用 Homebrew 的 `tomcat` formula，版本和路径以 [Homebrew tomcat formula](https://formulae.brew.sh/formula/tomcat) 为准。

## 3. Windows 宿主

### 3.1 VS Code 与 WSL 入口

- 终端： [Windows Terminal](https://learn.microsoft.com/en-us/windows/terminal/)。
- 统一编辑器与调试入口： [VS Code](https://code.visualstudio.com/docs)。
- Linux 工具链环境： [WSL2 Ubuntu 安装说明](https://learn.microsoft.com/en-us/windows/wsl/install)。

Windows 宿主中打开 WSL 项目：

```powershell
wsl
cd /mnt/d/workspace/github/tu-lang-lab
code .
```

推荐扩展：[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)、[Python](https://marketplace.visualstudio.com/items?itemName=ms-python.python)、[rust-analyzer](https://marketplace.visualstudio.com/items?itemName=rust-lang.rust-analyzer)、[Go](https://marketplace.visualstudio.com/items?itemName=golang.go)、[C/C++](https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools)、[ESLint](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)、[WSL](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-wsl)。

VS Code 是统一入口，所有 K5 编译器和依赖都在 WSL 中安装。完成 WSL 初始化后，按 [WSL2 Ubuntu](#4-windows-wsl2-ubuntu) 章节安装 JDK、Python、Rust、Go、C 和 Node/pnpm。

## 4. Windows WSL2 Ubuntu

### 4.1 安装 WSL2

在管理员 PowerShell 中执行 [Microsoft WSL 安装说明](https://learn.microsoft.com/en-us/windows/wsl/install)：

```powershell
wsl --install -d Ubuntu
wsl --set-default-version 2
wsl --list --verbose
```

重启后首次启动 Ubuntu，创建 Linux 用户并确认发行版 VERSION 为 2。使用 [WSL VS Code 指南](https://learn.microsoft.com/en-us/windows/wsl/tutorials/wsl-vscode) 配置远程编辑。

### 4.2 Ubuntu 基础包

```bash
sudo apt update
sudo apt install -y git curl unzip zip build-essential clang gdb lldb make pkg-config
```

### 4.3 Java 多版本

WSL 推荐 [SDKMAN](https://sdkman.io/install/) 管理多个 JDK：

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk list java
sdk install java <candidate-for-17>
sdk default java <candidate-for-17>
java -version
```

也可按 [Adoptium Linux 安装说明](https://adoptium.net/installation/linux/) 安装 Temurin。当前 shell 切换：

```bash
bash scripts/set-java-home.sh 17
```

### 4.4 Python、Rust、Go、Node/pnpm

```bash
sudo apt install -y python3 python3-venv python3-pip
python3 --version

curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
source "$HOME/.cargo/env"
rustup default stable

# Go 从官方页面下载对应架构 tar.gz：https://go.dev/doc/install
corepack enable pnpm
pnpm --version
```

### 4.5 在 WSL 中打开 K5

```bash
cd /mnt/d/workspace/github/tu-lang-lab
code .
```

VS Code 左下角应显示 WSL: Ubuntu。不要在 Windows 普通窗口中误用 Linux 解释器，也不要混用 Windows 与 WSL 生成的 `node_modules`、`target` 或可执行文件。

长期编译较多时，建议将仓库复制到 WSL 的 Linux 文件系统，例如 `~/workspace/tu-lang-lab`，再执行 `code .`；这样可以减少 `/mnt/d` 与 NTFS 之间的文件系统开销。

## 5. macOS

### 5.1 基础工具与 C

安装 [Homebrew](https://brew.sh/) 后：

```bash
brew update
brew install git curl wget unzip make
xcode-select --install
clang --version
make --version
```

Apple 官方说明见 [Xcode Command Line Tools](https://developer.apple.com/documentation/xcode/installing-the-command-line-tools)。Apple Silicon 和 Intel 的 Homebrew 前缀不同，不要把 `/opt/homebrew` 或 `/usr/local` 硬编码到项目文件；使用 `brew --prefix` 获取实际路径。

### 5.2 Java、Python、Node、Go、Rust

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk list java

brew install python@3.13 node go
corepack enable pnpm

curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
source "$HOME/.cargo/env"
rustup default stable
```

SDKMAN 的 Java 版本管理说明见 [SDKMAN Usage](https://sdkman.io/usage/)。

### 5.3 使用 VS Code 打开 K5

```bash
cd ~/workspace/tu-lang-lab
code .
```

macOS 使用 VS Code 集成终端运行各 Demo；Java、Python、Rust、Go、C 和 Frontend 的编译器/运行时仍由本机工具链提供。

## 6. IDE 与调试入口

### VS Code（K5 默认方案）

1. 使用 `File → Open Folder` 打开 K5 根目录，或直接在终端执行 `code .`。
2. 进入具体 Demo 目录后，先阅读 README，再在 VS Code 集成终端运行测试命令。
3. Java 使用 Extension Pack for Java 提供代码导航、Maven、运行和断点调试；JDK 版本仍需通过 `set-java-home.sh` 和 `mvn -version` 确认。
4. WSL 项目必须使用 Remote - WSL 打开，左下角显示 `WSL: Ubuntu` 后再运行 Linux 工具链。

### IntelliJ IDEA（可选的 Java 备用工具）

K5 根目录可以被 IDEA 作为普通项目打开，但当前仓库没有父 POM 或跨语言聚合模块；IDEA 不会自动把 Python、Rust、Go、C 和 Frontend 变成一个统一工程。若进行 Java 深度调试，可使用 `File → Open` 打开具体 Demo 目录，例如 `java/java21/virtual-thread-demo`，并选择 README 要求的 Project SDK。更多 Maven 操作见 [IntelliJ Maven support](https://www.jetbrains.com/help/idea/maven-support.html)。

如果希望只维护一个软件，优先使用 VS Code；IDEA 不属于 K5 的必需工具。

调试入口：

- Python：`python -m pdb src/<module>.py`，或在测试断点后运行 unittest。
- Go：先 `go test -run TestName -v`；需要断点时安装 Delve 后使用 Go Debug。
- Rust：`cargo test` 后用 `rust-gdb`/`rust-lldb`。
- C：编译增加 `-g`，再用 `gdb ./demo` 或 `lldb ./demo`。
- JavaScript/TypeScript：Node Demo 先运行 `pnpm test`，浏览器 Demo 用 DevTools Sources/Console。

## 7. 快速学习闭环

```text
环境检查 → 选择案例目录 → 阅读 README Background/Problem
→ 运行 test → 阅读中文注释和源码 → 修改一个输入
→ 重新运行 test → 阅读 Business Mapping/Limitations → 记录结论
```

示例：

```bash
cd python/python3-feature/generator-iterator-demo
python -m unittest discover -s tests

cd ../../../../go/concurrency/goroutine-channel-demo
go test ./...

cd ../../../../c/memory/pointer-memory-demo
make test
```

路径跳转以当前 shell 为准；K5 不提供根目录统一聚合构建命令。

## 8. 常见问题

| 症状 | 处理 |
| --- | --- |
| `java` 与 `javac` 版本不一致 | 重新运行 `set-java-home`，确认 `JAVA_HOME` 和 PATH 顺序 |
| Maven 使用错误 JDK | 先 `mvn -version`，再切换 JDK；不要只看 `java -version` |
| WSL 构建很慢 | 把仓库放到 `~/workspace`，不要在 `/mnt/d` 高频生成构建文件 |
| `pnpm` 找不到 | 确认 Node LTS、`corepack enable pnpm` 和新终端 PATH |
| Rust 编译器缺少 | `source "$HOME/.cargo/env"`，再 `rustup default stable` |
| C 找不到 `make` | WSL 安装 `build-essential`；Windows 安装 MSYS2 UCRT64 工具链 |
| 调试时没有符号 | C 增加 `-g`；Rust 使用 debug profile，不要先 `--release` |
| Windows/WSL 产物互相污染 | 清理对应环境的构建产物后，在同一环境重新构建 |

## 9. 官方入口汇总

- [Microsoft WSL](https://learn.microsoft.com/en-us/windows/wsl/install)
- [Eclipse Temurin](https://adoptium.net/installation/)
- [Python](https://www.python.org/downloads/)
- [Node.js](https://nodejs.org/en/download/)
- [pnpm](https://pnpm.io/installation)
- [Rustup](https://rust-lang.github.io/rustup/installation/)
- [Go](https://go.dev/doc/install)
- [Apache Maven](https://maven.apache.org/install.html)
- [MSYS2](https://www.msys2.org/)
- [Clang](https://clang.llvm.org/docs/)
- [Apple Command Line Tools](https://developer.apple.com/documentation/xcode/installing-the-command-line-tools)
