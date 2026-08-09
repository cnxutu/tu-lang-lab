# Go Context 与 HTTP Demo

## Feature

使用 `context.Context` 将取消信号传递给标准库 HTTP 请求。

## Background

服务端请求必须能响应超时、客户端断开和上游取消，避免无效工作继续运行。

## Problem

没有统一取消边界时，网络请求可能在调用方已经放弃后仍占用连接。

## Example

`RequestWithContext` 将 context 绑定到 request；测试用已取消 context 验证失败路径。

## Usage Scenario

HTTP 客户端、命令行超时和服务端请求链路。

## Limitations

context 不应存放业务对象；生产请求仍需配置 timeout、重试和连接池。

## Version & Status

Go 1.7+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Blog：Context](https://go.dev/blog/context) ★★★★★。
- [context package 文档](https://pkg.go.dev/context) ★★★★★。
- [net/http package 文档](https://pkg.go.dev/net/http) ★★★★★。

## Code Walkthrough

中文注释说明 context 如何穿过 HTTP 边界；测试覆盖取消错误而不是依赖真实网络。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：上游取消后下游仍工作 → context/request → 节省连接和计算 → timeout、重试和幂等仍需额外设计。

## Verification

安装 Go 后执行 `go test ./...`；当前主机未安装 Go。

## Run

```bash
go test ./...
```
