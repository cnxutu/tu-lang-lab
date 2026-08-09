# Bash 后台任务与信号 Demo

## Feature

展示后台任务、`$!`、`wait`、进程数组、`trap` 和结果收集。

## Background

Shell 可以并发启动多个外部命令，但必须显式管理子进程、退出状态和清理责任。

## Problem

如何并发执行多个独立短任务，同时等待所有任务完成，并让输出顺序不受实际完成先后影响。

## Example

三个后台 worker 将结果写入临时文件，主进程保存 PID 并逐个 `wait`，最后通过 `sort` 统一收集。

## Usage Scenario

适合并行运行独立测试、同时检查多个目录或批量调用外部命令。

## Limitations

Shell 的并发控制能力有限；大量任务需要限流、超时和结构化错误传播时，应使用 Go、Python asyncio 或专用任务系统。

## Run

```bash
bash demo.sh
bash test.sh
```

## Version & Status

- Bash 5.x
- `stable`
- 使用系统 `sleep`、`cat` 和 `sort`

## Learning Resources

- [Bash Reference Manual: Job Control](https://www.gnu.org/software/bash/manual/html_node/Job-Control.html)
- [Bash Reference Manual: Bourne Shell Builtins](https://www.gnu.org/software/bash/manual/html_node/Bourne-Shell-Builtins.html)
- [BashFAQ/031](https://mywiki.wooledge.org/BashFAQ/031)

## Code Walkthrough

`&` 启动后台任务，`$!` 获取子进程 PID，`wait` 等待并传播退出码；临时目录通过 `trap` 在正常退出和常见中断信号下清理。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：多个独立检查需要并行执行 → 后台任务、PID、`wait` → 缩短等待时间 → 任务数量大、需要限流或重试时使用更强的并发工具。

## Verification

测试脚本比较排序后的三行输出；执行 `bash -n demo.sh` 和 ShellCheck 可继续验证语法与常见误用。
