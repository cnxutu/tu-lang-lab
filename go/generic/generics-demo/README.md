# Go Generics Demo

## Feature

使用 Go 1.18+ 类型参数编写通用 map 算法。

## Background

泛型减少重复代码，同时比 `interface{}` 保留更明确的编译期类型关系。

## Problem

相同遍历逻辑若为每种类型复制一份，会增加维护成本和错误概率。

## Example

`Map` 把整数切片转换为字符串切片。

## Usage Scenario

集合转换、通用校验器和基础库算法。

## Limitations

泛型不能替代所有接口抽象；类型约束复杂时会降低可读性。

## Version & Status

Go 1.18+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Blog：An Introduction to Generics](https://go.dev/blog/intro-generics) ★★★★★。
- [Go Specification：Type parameters](https://go.dev/ref/spec#Type_parameter_declarations) ★★★★★。
- [Go by Example：Generics](https://gobyexample.com/generics) ★★★★☆。

## Code Walkthrough

中文注释说明 `T`/`R` 如何表达输入输出类型；测试验证整数到字符串的实例化。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：同类算法重复实现 → 泛型 → 类型安全复用 → 动态插件边界仍适合 interface。

## Verification

安装 Go 后执行 `go test ./...`；当前主机未安装 Go。

## Run

```bash
go test ./...
```
