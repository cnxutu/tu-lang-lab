# K5 开发环境上手指南

本指南面向 Windows 原生、Windows WSL2 Ubuntu 和 macOS，目标是让第一次进入 K5 的人完成工具链安装、环境验证、Demo 运行和断点调试。

K5 实际目录：`D:\workspace\github\tu-lang-lab`。WSL 中对应 `/mnt/d/workspace/github/tu-lang-lab`。在 WSL/macOS 上长期编译时，建议将仓库放在 Linux/macOS 本地磁盘，例如 `~/workspace/tu-lang-lab`，避免在 `/mnt/d` 或外接 NTFS 目录上频繁读写构建产物。

## 1. 环境选择

| 环境 | 推荐用途 | 推荐工具 | 说明 |
| --- | --- | --- | --- |
| Windows 原生 | IntelliJ IDEA、Windows 调试、Java | Temurin JDK、Maven、Python、Node/pnpm、Go、MSYS2 GCC 或 MSVC | C 的 Makefile 更适合 MSYS2 或 WSL |
| Windows WSL2 Ubuntu | Linux/CI 一致的命令行学习 | OpenJDK/Temurin、Maven、Python、rustup、Node/pnpm、Go、GCC/Clang、GDB | VS Code 安装在 Windows，用 Remote - WSL 连接 |
| macOS | Unix 工具链、Clang、Homebrew | Temurin/SDKMAN、Python、Node/pnpm、rustup、Go、Apple Clang | C 使用 Xcode Command Line Tools |

推荐主线：Windows 用户用 WSL2 跑 Go、Rust、C 和脚本；Java 可在 IntelliJ IDEA 原生或 WSL 中运行；Frontend 使用 Node/pnpm；Python 两边均可。

## 2. 通用准备

1. 安装 [Git](https://git-scm.com/downloads)，确认 `git --version`。
2. 打开 K5，不要把 Vue、React、Spring 等框架工程放进本仓库。
3. 运行环境检查脚本：

PowerShell：

```powershell
cd D:\workspace\github\tu-lang-lab
powershell -ExecutionPolicy Bypass -File .\scripts\check-environment.ps1
```

WSL/macOS：

```bash
cd ~/workspace/tu-lang-lab
bash scripts/check-environment.sh
```

`-Strict`/`--strict` 会在任一工具缺失时返回非零；第一次检查建议先不使用 strict。

## 2.1 一键安装脚本

脚本默认只打印计划，不修改系统。确认清单后再加 `-Install` 或 `--install`。Tomcat 默认不安装，只有明确加 `-IncludeTomcat`/`--include-tomcat` 才会下载；Tomcat 不是 K5 语言案例依赖，只作为可选 Java Web 容器。

Windows 原生（管理员/普通 PowerShell 均可，WinGet 按安装器要求请求权限）：

```powershell
cd D:\workspace\github\tu-lang-lab
.\scripts\bootstrap-windows.ps1
.\scripts\bootstrap-windows.ps1 -Install -IncludeTomcat
```

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

安装完成后关闭旧终端并重新打开，再运行 `check-environment`。Windows 使用 WinGet 的精确包 ID；如果某个 ID 随仓库变化，先执行 `winget search <name>`，不要盲目改成不明来源的下载地址。WinGet 的安装规则见 [Microsoft WinGet install](https://learn.microsoft.com/en-us/windows/package-manager/winget/install)。

Tomcat 脚本默认使用 Apache 官方 Tomcat 11.0.24 下载地址；Apache 下载页提供 Windows zip、Linux tar.gz、签名和 SHA-512 校验，生产环境使用前应核对 [Tomcat 11 downloads](https://tomcat.apache.org/download-11)。macOS 优先使用 Homebrew 的 `tomcat` formula，版本和路径以 [Homebrew tomcat formula](https://formulae.brew.sh/formula/tomcat) 为准。

## 3. Windows 原生

### 3.1 基础工具

- 终端： [Windows Terminal](https://learn.microsoft.com/en-us/windows/terminal/)。
- Java： [IntelliJ IDEA](https://www.jetbrains.com/idea/)。
- 多语言： [VS Code](https://code.visualstudio.com/)。

### 3.2 Java/JDK 8、17、21、25

K5 默认 JDK 17，同时保留 Java 8、21、25 案例。推荐 [Eclipse Temurin 安装页](https://adoptium.net/installation/) 安装多个 JDK，不要只安装 JRE。

```powershell
java -version
javac -version
mvn -version
```

当前 PowerShell 会话切换 JDK：

```powershell
cd D:\workspace\github\tu-lang-lab
.\scripts\set-java-home.ps1 -Version 17
```

脚本只修改当前 PowerShell 进程，不覆盖系统环境变量。Maven 安装参考 [Apache Maven Install](https://maven.apache.org/install.html)。进入任意 Java Demo 后执行：

```powershell
mvn clean test
```

Java 25 案例仍需单独安装 JDK 25，并按 README 的 `pending_jdk25_verification` 状态验证。

### 3.3 Python

从 [Python Downloads](https://www.python.org/downloads/) 安装 Python 3.13+，安装器中勾选 Add Python to PATH：

```powershell
cd D:\workspace\github\tu-lang-lab\python\python3-feature\syntax-basics-demo
py -3.13 -m venv .venv
.\.venv\Scripts\Activate.ps1
python -m unittest discover -s tests
```

K5 当前案例主要使用标准库，不需要先安装框架依赖；虚拟环境不要提交。

### 3.4 Node.js、pnpm、TypeScript

从 [Node.js Downloads](https://nodejs.org/en/download/) 安装 LTS。按 [pnpm Installation](https://pnpm.io/installation) 使用 Corepack：

```powershell
npm install --global corepack@latest
corepack enable pnpm
pnpm --version
```

进入 Frontend Demo 后：

```powershell
pnpm install
pnpm test
pnpm typecheck
```

### 3.5 Go

从 [Go Install](https://go.dev/doc/install) 安装 Go，确认：

```powershell
go version
go env GOPATH GOMODCACHE
```

进入 Go Demo 后执行 `go test ./...`；并发案例追加 `go test -race ./...`。

### 3.6 C

Windows 原生有两条路线：推荐 [MSYS2](https://www.msys2.org/) UCRT64 GCC，或使用 [MSVC Build Tools](https://learn.microsoft.com/en-us/cpp/overview/acquire-msvc) 进行 Visual Studio 调试。MSYS2 UCRT64 中执行：

```bash
pacman -Syu
pacman -S --needed base-devel mingw-w64-ucrt-x86_64-toolchain
gcc --version
make --version
```

进入 C Demo 后：

```bash
make test
make
./demo
```

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

## 6. IDE 与调试入口

### IntelliJ IDEA（Java）

1. 使用 `File → Open` 直接打开具体 Demo 目录，不导入根目录 Maven 聚合工程。
2. `Project SDK` 选择该 Demo README 要求的 JDK。
3. Maven 面板执行 `clean/test`；主类旁点击 Run/Debug。
4. 预览案例确认运行配置包含 README 指定的 `--enable-preview`。

### VS Code（多语言/WSL）

推荐扩展：[Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)、[Python](https://marketplace.visualstudio.com/items?itemName=ms-python.python)、[Go](https://marketplace.visualstudio.com/items?itemName=golang.go)、[rust-analyzer](https://marketplace.visualstudio.com/items?itemName=rust-lang.rust-analyzer)、[C/C++](https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools)。

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
