# Bash 变量与控制流 Demo

## Feature

展示变量、只读变量、数组、函数、命令替换、`for` 循环和算术条件。

## Background

Shell 脚本经常需要读取参数、遍历文件或命令结果，再根据状态选择下一步操作。

## Problem

如何用最少的 Bash 语法把一组输入转换为稳定、可读的命令输出。

## Example

`demo.sh` 保存项目名和数字数组，通过函数分类数字并输出确定性结果。

## Usage Scenario

适合编写构建前检查、批量执行命令、环境探测和简单文件处理脚本。

## Limitations

Shell 的数组和算术语法是 Bash 能力，不保证在 `/bin/sh` 或其他 Shell 中可用；复杂数据处理应交给 Python、Go 等语言。

## Run

```bash
bash demo.sh
bash test.sh
```

## Version & Status

- Bash 5.x
- `stable`
- 无第三方依赖

## Learning Resources

- [Bash Reference Manual](https://www.gnu.org/software/bash/manual/bash.html)
- [Bash Builtins](https://www.gnu.org/software/bash/manual/html_node/Bash-Builtins.html)
- [Google Shell Style Guide](https://google.github.io/styleguide/shellguide.html)

## Code Walkthrough

`readonly` 表达不会重新赋值的配置；`"${numbers[@]}"` 保留数组元素边界；`$(...)` 把函数输出作为字符串使用。中文注释说明了数组、函数和算术条件的组合位置。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：批量执行前需要按条件分支 → 函数、数组、`if` 和循环 → 小型自动化脚本可读且启动快 → Bash 状态管理复杂时改用 Python 或 Go。

## Verification

测试脚本比较完整输出，确保示例行为确定；修改脚本后执行 `bash test.sh`。
