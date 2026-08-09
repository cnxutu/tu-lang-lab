# Bash 健壮脚本与清理 Demo

## Feature

展示 `set -Eeuo pipefail`、临时目录、`trap`、安全引用和 `mapfile`。

## Background

自动化脚本一旦遇到中间命令失败或用户中断，如果没有清理和失败传播，很容易留下错误产物。

## Problem

如何让脚本在失败或收到中断信号时释放临时资源，并避免未定义变量和空格路径导致的误操作。

## Example

脚本创建临时目录和输入文件，读取两行内容后输出数量；退出、SIGINT 或 SIGTERM 都会触发清理。

## Usage Scenario

适合构建临时工作区、打包前处理、测试夹具生成和一次性诊断脚本。

## Limitations

`rm -rf` 仍然具有破坏性，临时路径必须来自可信的 `mktemp`；脚本不应把用户输入直接拼接成删除路径。

## Run

```bash
bash demo.sh
bash test.sh
```

## Version & Status

- Bash 5.x
- `stable`
- 仅使用 Bash 内置能力和系统 `mktemp`

## Learning Resources

- [Bash Reference Manual: The Set Builtin](https://www.gnu.org/software/bash/manual/html_node/The-Set-Builtin.html)
- [Bash Reference Manual: Bourne Shell Builtins](https://www.gnu.org/software/bash/manual/html_node/Bourne-Shell-Builtins.html)
- [Google Shell Style Guide](https://google.github.io/styleguide/shellguide.html)

## Code Walkthrough

严格模式让未定义变量、管道中间失败和命令错误更早暴露；`trap` 把资源释放绑定到进程退出；`--` 和双引号避免路径被当作选项或被空格拆分。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：脚本需要可靠地创建并销毁临时资源 → 严格模式、`trap`、安全引用 → 降低残留文件和半成功状态 → 复杂事务或回滚流程应交给专门程序。

## Verification

测试脚本验证稳定输出；可用 `bash -n demo.sh` 做语法检查，并用 ShellCheck 做静态检查。
