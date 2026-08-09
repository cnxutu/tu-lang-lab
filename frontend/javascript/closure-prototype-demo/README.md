# JavaScript 闭包与对象方法 Demo

## Feature

展示闭包保存私有状态，以及对象方法通过 `this` 访问接收者。

## Background

JavaScript 函数是一等对象，词法作用域和原型对象共同构成语言的对象模型。

## Problem

模块需要封装状态，但不希望暴露可被任意修改的字段。

## Example

`createCounter` 返回闭包，每次调用都递增内部变量。

## Usage Scenario

计数器、缓存工厂、事件处理器和轻量状态封装。

## Limitations

闭包会延长引用对象寿命；脱离接收者调用方法可能丢失 `this`。

## Version & Status

ECMAScript 2015+ / `stable`；使用 Node 22 验证。

## Learning Resources

- [ECMAScript：Lexical Environments](https://tc39.es/ecma262/#sec-lexical-environments) ★★★★★。
- [MDN：Closures](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Closures) ★★★★★。
- [You Don't Know JS Yet](https://github.com/getify/You-Dont-Know-JS) ★★★★★ 深入系列。

## Code Walkthrough

`value` 不在返回值中暴露，只能经由箭头函数访问；测试验证多个调用共享同一闭包状态。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：组件状态需要私有化 → 闭包 → 小而直接的封装 → 长生命周期闭包需关注内存，复杂状态可用类。

## Verification

Node 22.17.1 下 `pnpm test` 通过。

## Run

```bash
pnpm test
node src/main.js
```
