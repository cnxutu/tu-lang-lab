# TypeScript 类型系统与泛型 Demo

## Feature
使用泛型和判别联合建模成功/失败结果。

## Background
TypeScript 在 JavaScript 之上提供静态类型检查，编译后仍是 JavaScript。

## Problem
API 返回值若依赖约定，调用方容易在失败分支读取不存在的数据。

## Example
`ApiResult<T>` 携带数据类型，`unwrap` 通过 `ok` 完成类型收窄。

## Usage Scenario
SDK、HTTP 客户端和领域服务的结果契约。

## Limitations
类型检查不等于运行时校验，外部 JSON 仍需 schema 验证。

## Version & Status
TypeScript 5.x / `stable`；使用 `pnpm exec tsc --noEmit` 验证。

## Learning Resources
- [TypeScript Handbook：Generics](https://www.typescriptlang.org/docs/handbook/2/generics.html) ★★★★★。
- [TypeScript Handbook：Narrowing](https://www.typescriptlang.org/docs/handbook/2/narrowing.html) ★★★★★。
- [Effective TypeScript](https://effectivetypescript.com/) ★★★★☆。

## Code Walkthrough
`ok` 是判别字段；分支后 TypeScript 才允许访问 `data` 或 `message`。

## Business Mapping
问题 → 特性 → 收益 → 风险/替代方案：接口错误分支容易漏处理 → 泛型/联合类型 → 编译期提示 → 运行时仍需验证不可信输入。

## Verification
安装 TypeScript 后执行 `pnpm typecheck`；网络不可用时至少做源码静态复核。

## Run
```bash
pnpm install
pnpm typecheck
```
