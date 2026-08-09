# Web API Event Loop Demo

## Feature
观察同步代码、microtask 与 timer 的事件循环顺序。

## Background
浏览器事件循环协调 JavaScript 栈、微任务队列、渲染与任务队列。

## Problem
错误理解调度顺序会导致 UI 卡顿、竞态和错误的加载状态。

## Example
`queueMicrotask` 的回调先于 `setTimeout` 回调执行；Node 测试复现同一核心顺序。

## Usage Scenario
Promise 回调、输入事件、定时器和渲染更新的排队分析。

## Limitations
浏览器与 Node 的任务源细节不同，渲染阶段不能仅凭 Node 测试推断。

## Version & Status
Web API / `stable`；Node 22 验证调度核心。

## Learning Resources
- [HTML Standard：Event loops](https://html.spec.whatwg.org/multipage/webappapis.html#event-loops) ★★★★★。
- [MDN：JavaScript execution model](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Execution_model) ★★★★★。
- [Jake Archibald：Tasks, microtasks, queues and schedules](https://jakearchibald.com/2015/tasks-microtasks-queues-and-schedules/) ★★★★★。

## Code Walkthrough
先记录同步项，再注册 microtask 和 timer；测试等待一个 timer 后断言顺序。

## Business Mapping
问题 → 特性 → 收益 → 风险/替代方案：异步回调顺序不明 → Event Loop → 可预测更新 → 长任务仍需拆分或移入 Worker。

## Verification
Node 22.17.1 下 `pnpm test` 通过。

## Run
```bash
pnpm test
```
