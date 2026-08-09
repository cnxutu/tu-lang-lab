# TypeScript 高级类型 Demo

## Feature

使用 `keyof`、泛型约束和索引访问类型建立事件名与 payload 的映射。

## Background

高级类型允许把重复的接口关系编码进类型系统，而不是依赖文档约定。

## Problem

事件总线若允许任意名称和 payload，发布方与订阅方很容易错配。

## Example

`createEvent('lessonCompleted', { id, score })` 会得到对应的 payload 类型。

## Usage Scenario

前端事件总线、状态更新和跨模块消息契约。

## Limitations

类型关系不会在运行时自动验证；外部消息仍需 schema 或显式检查。

## Version & Status

TypeScript 4.x+ / `stable`；通过 TypeScript 5.6 类型检查。

## Learning Resources

- [TypeScript Handbook：Indexed Access Types](https://www.typescriptlang.org/docs/handbook/2/indexed-access-types.html) ★★★★★。
- [TypeScript Handbook：Keyof Type Operator](https://www.typescriptlang.org/docs/handbook/2/keyof-types.html) ★★★★★。
- [Type Challenges](https://github.com/type-challenges/type-challenges) ★★★★☆。

## Code Walkthrough

中文注释说明事件名到 payload 的类型绑定；修改事件名或字段会在编译期暴露错误。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：跨模块事件契约漂移 → 高级类型映射 → 发布/订阅一致 → 不可信边界仍需运行时 schema。

## Verification

安装 TypeScript 后执行 `pnpm typecheck`。

## Run

```bash
pnpm install
pnpm typecheck
```
