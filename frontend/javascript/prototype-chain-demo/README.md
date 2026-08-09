# JavaScript 原型链 Demo

## Feature

展示构造函数、`prototype` 方法和实例到原型的查找链。

## Background

JavaScript 对象属性查找沿原型链进行，class 语法也是这套机制的语法糖。

## Problem

不理解原型会导致实例方法重复创建、继承关系误判和 `this` 使用错误。

## Example

两个 `Lesson` 实例共享同一个 `describe` 函数。

## Usage Scenario

需要理解旧式 SDK、class 编译产物或对象继承行为时使用。

## Limitations

直接修改共享 prototype 会影响所有实例；现代代码通常优先使用 class 或组合。

## Version & Status

ECMAScript 5+ / `stable`；Node 22 已验证。

## Learning Resources

- [ECMAScript：Ordinary Object Internal Methods](https://tc39.es/ecma262/#sec-ordinary-object-internal-methods-and-internal-slots) ★★★★★。
- [MDN：Inheritance and the prototype chain](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Inheritance_and_the_prototype_chain) ★★★★★。
- [You Don't Know JS：Objects & Classes](https://github.com/getify/You-Dont-Know-JS) ★★★★★。

## Code Walkthrough

中文注释说明方法放到 prototype 的共享原因；测试验证引用相同而实例数据不同。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：对象行为重复占用内存 → 原型共享 → 节省方法副本 → 继承层次复杂时优先组合。

## Verification

Node 22 下执行 `pnpm test`。

## Run

```bash
pnpm test
```
