# Web API DOM 与事件 Demo

## Feature

使用 DOM 创建元素、绑定事件并通过 `dataset` 保存交互状态。

## Background

DOM 是浏览器把 HTML 文档暴露给 JavaScript 的对象模型，事件是用户动作的入口。

## Problem

页面交互若直接操作字符串或轮询状态，容易造成更新不同步和事件泄漏。

## Example

`src/index.html` 可直接在浏览器打开，`renderLesson` 展示同一能力的可测试函数。

## Usage Scenario

表单交互、列表按钮、无框架页面和浏览器 API 学习。

## Limitations

Node 测试使用最小文档替身，不能替代真实浏览器渲染、布局和事件冒泡验证。

## Version & Status

DOM Events / `stable`；Node 22 验证逻辑，浏览器需手动打开 HTML。

## Learning Resources

- [WHATWG DOM Standard](https://dom.spec.whatwg.org/) ★★★★★。
- [MDN：Introduction to events](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Building_blocks/Events) ★★★★★。
- [web.dev：Learn HTML](https://web.dev/learn/html) ★★★★☆。

## Code Walkthrough

中文注释解释监听器如何把动作转成状态更新；测试替换最小 document，验证核心行为。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：用户动作需要驱动局部更新 → DOM/Event → 直接反馈 → 复杂组件状态应迁移到框架实验室。

## Verification

Node 22 下执行 `pnpm test`；浏览器中打开 `src/index.html` 点击按钮验证视觉行为。

## Run

```bash
pnpm test
# 浏览器打开 src/index.html
```
