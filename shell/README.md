# Shell 学习区

本目录以 Bash 为主，沉淀 Shell 语言本身的语法、进程模型、管道组合和脚本工程实践。它服务于 WSL2 Ubuntu 中的环境初始化、构建辅助和诊断脚本，不引入部署平台或业务框架。

## 推荐顺序

1. [变量与控制流](bash/basics-and-control-demo/README.md)
2. [管道与文本处理](bash/pipeline-and-text-demo/README.md)
3. [健壮脚本与清理](bash/safe-script-demo/README.md)
4. [后台任务与信号](bash/process-and-signal-demo/README.md)

## 学习边界

- 案例默认使用 Bash 5.x，运行环境为 WSL2 Ubuntu 或 macOS。
- `set -Eeuo pipefail`、正确引用变量、检查退出码和清理临时资源是重点。
- Shell 适合编排命令和连接工具，不适合承载复杂数据结构、长生命周期服务或大规模业务逻辑。
- 需要 POSIX `sh` 兼容时，应避免数组、`[[ ]]`、进程替换等 Bash 专属语法，并单独验证目标 Shell。

完整索引见 [`docs/shell-feature-map.md`](../docs/shell-feature-map.md)，外部资料见 [`docs/shell-learning-resources.md`](../docs/shell-learning-resources.md)。
