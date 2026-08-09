# JavaScript ES Module Demo

## Feature

使用 ES Module 的命名导出、默认导出和静态 `import`。

## Background

模块系统让依赖关系显式化，浏览器和 Node.js 都能按模块边界组织代码。

## Problem

全局变量和隐式加载会造成命名冲突、初始化顺序不清和难以测试。

## Example

`src/math.js` 同时导出 `add` 与默认的 `sum`。

## Usage Scenario

前端工具函数、Node CLI 和可复用语言实验都适合按模块拆分。

## Limitations

浏览器原生模块需要正确的 MIME、路径和 CORS 配置；旧环境需打包器或转译。

## Version & Status

ECMAScript 2015+ / `stable`；使用 Node 22 验证。

## Learning Resources

- [ECMAScript Modules](https://tc39.es/ecma262/#sec-modules) ★★★★★ 标准定义。
- [MDN：JavaScript modules](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Modules) ★★★★★ 实用教程。
- [javascript.info：Modules](https://javascript.info/modules-intro) ★★★★☆ 解释清晰。

## Code Walkthrough

默认导出承载主函数，命名导出承载小能力；测试通过 Node 内置 test runner 验证导入结果。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：代码依赖不可追踪 → ES Module → 静态依赖与可测试边界 → 老浏览器项目需构建链兼容。

## Verification

Node 22.17.1 下执行 `pnpm test` 已覆盖模块导入与计算结果。

## Run

```bash
pnpm test
node src/main.js
```
