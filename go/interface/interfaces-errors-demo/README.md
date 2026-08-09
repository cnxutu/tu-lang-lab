# Go Interface 与 Error Demo

## Feature

展示隐式 interface、能力抽象和 sentinel error。

## Background

Go 接口由方法集合定义，错误值通过显式返回值传播。

## Problem

调用方不应依赖具体结构体，也不能把失败隐藏在日志或特殊数字中。

## Example

`AcceptScore` 只依赖 `Scorer`，失败时返回 `ErrInvalidScore`。

## Usage Scenario

存储适配器、策略对象和输入校验边界。

## Limitations

接口过大降低替换性；sentinel error 需要稳定语义和 `errors.Is` 判断。

## Version & Status

Go 1.13+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Tour：Interfaces](https://go.dev/tour/methods/9) ★★★★★。
- [Go Blog：Error handling](https://go.dev/blog/errors-are-values) ★★★★★。
- [Go Blog：Working with Errors](https://go.dev/blog/go1.13-errors) ★★★★☆。

## Code Walkthrough

中文注释解释接口的最小能力边界；测试覆盖成功和错误路径。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：实现需要可替换 → interface → 低耦合测试 → 接口过大时拆分，错误需要领域分类。

## Verification

安装 Go 后执行 `go test ./...`；当前主机未安装 Go。

## Run

```bash
go test ./...
```
