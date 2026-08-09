# Web API Fetch 与 AbortController Demo

## Feature
使用 `AbortController` 为 `fetch` 请求设置超时和取消边界。

## Background
现代 Web API 将网络请求、取消信号和 Promise 组合成可组合的异步接口。

## Problem
页面切换或请求超时后，继续占用连接和更新已销毁视图会造成资源浪费。

## Example
`fetchWithTimeout` 在截止时间触发 `abort`，并在 finally 中清理 timer。

## Usage Scenario
搜索联想、路由切换、上传取消和客户端超时策略。

## Limitations
取消只通知客户端；服务端已接收的工作仍需幂等和超时设计。

## Version & Status
Fetch/AbortController / `stable`；Node 22 内置 API 验证。

## Learning Resources
- [WHATWG Fetch Standard](https://fetch.spec.whatwg.org/) ★★★★★。
- [MDN：AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) ★★★★★。
- [web.dev：Fetch API](https://web.dev/articles/introduction-to-fetch) ★★★★☆。

## Code Walkthrough
控制器信号传给 fetch 实现，定时器调用 abort；中文注释强调 finally 清理资源。

## Business Mapping
问题 → 特性 → 收益 → 风险/替代方案：无效请求持续占用连接 → AbortController → 及时取消 → 服务端仍需幂等、重试和超时。

## Verification
Node 22.17.1 下 `pnpm test` 通过超时取消测试。

## Run
```bash
pnpm test
```
