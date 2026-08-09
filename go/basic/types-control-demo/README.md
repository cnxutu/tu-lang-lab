# Go 类型与控制流 Demo

## Feature

展示 Go 的显式类型、常量枚举和 `switch` 控制流。

## Background

Go 追求简单、可读和快速编译，常用有限状态由常量和类型表达。

## Problem

状态值若使用散落字符串，容易拼写不一致和遗漏分支。

## Example

`LessonState` 表示学习案例状态，`DescribeLesson` 生成稳定文本。

## Usage Scenario

任务状态、审核状态和协议阶段的轻量建模。

## Limitations

`iota` 本身不会阻止非法整数转换；公共协议需要额外校验。

## Version & Status

Go 1.22+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Tour：Basics](https://go.dev/tour/basics/1) ★★★★★。
- [Go Language Specification](https://go.dev/ref/spec) ★★★★★。
- [Effective Go](https://go.dev/doc/effective_go) ★★★★★。

## Code Walkthrough

中文注释说明类型与 switch 如何表达状态；测试验证 published 分支。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：状态值不统一 → typed constants/switch → 编译期可读性 → 外部输入仍需解析校验。

## Verification

安装 Go 后在项目目录执行 `go test ./...`；当前主机未安装 Go。

## Run

```bash
go test ./...
```
