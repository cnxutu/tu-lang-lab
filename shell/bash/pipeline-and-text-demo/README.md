# Bash 管道与文本处理 Demo

## Feature

展示标准输入输出、管道、`awk` 字段聚合和 `sort` 稳定排序。

## Background

Shell 的强项不是内置复杂集合，而是把多个专注单一职责的命令组合起来。

## Problem

如何从多行文本中按字段统计语言出现次数，并让输出顺序稳定、方便后续脚本消费。

## Example

`printf` 产生 CSV 风格输入，`awk` 按第一列计数，`sort` 对最终结果排序。

## Usage Scenario

适合日志摘要、构建产物清单、测试结果汇总和命令行报表生成。

## Limitations

复杂 CSV（引号、换行、转义）不能仅靠简单 `awk -F','` 正确解析，应使用专用解析器或 Python。

## Run

```bash
bash demo.sh
bash test.sh
```

## Version & Status

- Bash 5.x、GNU awk、GNU coreutils
- `stable`
- 依赖 WSL/macOS 中可用的 `awk` 与 `sort`

## Learning Resources

- [GNU awk User's Guide](https://www.gnu.org/software/gawk/manual/gawk.html)
- [GNU Coreutils Manual](https://www.gnu.org/software/coreutils/manual/coreutils.html)
- [ShellCheck](https://www.shellcheck.net/)

## Code Walkthrough

管道左侧只负责提供输入，`awk` 只负责聚合，`sort` 只负责确定顺序；每个阶段通过标准流传递数据，避免临时文件。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：需要快速汇总文本日志 → 管道、字段处理、排序 → 无需启动完整应用即可完成诊断 → 输入格式复杂或数据量很大时使用 Python/SQL。

## Verification

测试脚本比较两行确定性输出；运行 `bash test.sh` 验证管道阶段没有改变结果。
