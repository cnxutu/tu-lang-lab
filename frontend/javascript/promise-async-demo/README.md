# JavaScript Promise 与 Async Demo

## Feature

用 `Promise.all` 和 `async/await` 并发加载多个学习单元。

## Background

JavaScript 通过事件循环处理 I/O 等待，Promise 表示未来完成或失败的结果。

## Problem

回调嵌套会让错误传播和并发收集难以阅读。

## Example

`loadAll` 将多个 `loadLesson` 任务并发提交，并保持输入顺序。

## Usage Scenario

页面并行请求配置、详情和权限信息时可使用。

## Limitations

`Promise.all` 任一失败就整体失败；需要部分成功时应使用 `allSettled`。

## Version & Status

ECMAScript 2017+ / `stable`；使用 Node 22 验证。

## Learning Resources

- [ECMAScript Promise Objects](https://tc39.es/ecma262/#sec-promise-objects) ★★★★★。
- [MDN：Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) ★★★★★。
- [javascript.info：Async/await](https://javascript.info/async-await) ★★★★☆。

## Code Walkthrough

`await Promise.resolve()` 保留异步边界，`Promise.all` 体现并发而非串行循环；中文注释解释了语义。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：多个独立 I/O 请求耗时 → Promise.all → 缩短等待 → 部分失败场景改用 allSettled 或分组重试。

## Verification

Node 22.17.1 下 `pnpm test` 通过。

## Run

```bash
pnpm test
node src/main.js
```
