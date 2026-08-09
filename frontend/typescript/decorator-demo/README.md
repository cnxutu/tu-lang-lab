# TypeScript 装饰器 Demo

## Feature

使用 TypeScript 标准装饰器包装类方法，并保持方法类型。

## Background

装饰器适合把日志、计时、权限等横切行为附着到声明位置。

## Problem

重复在每个方法中编写相同横切代码会污染核心业务表达。

## Example

`@measured` 包装 `LessonService.title`，示例保持无框架依赖。

## Usage Scenario

SDK 方法审计、指标采集和声明式校验。

## Limitations

装饰器改变调用链，调试和初始化顺序需要明确；运行时仍需真实校验逻辑。

## Version & Status

TypeScript 5.x standard decorators / `stable`；通过 `tsc --noEmit` 验证。

## Learning Resources

- [TypeScript 5.0：Decorators](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0/#decorators) ★★★★★。
- [TypeScript Handbook：Decorators](https://www.typescriptlang.org/docs/handbook/2/decorators.html) ★★★★☆。
- [TC39 Decorators proposal](https://github.com/tc39/proposal-decorators) ★★★★★。

## Code Walkthrough

中文注释说明包装函数如何保留 `this`、参数和返回值类型；`@measured` 使用标准装饰器上下文。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：横切逻辑散落 → Decorator → 声明式复用 → 复杂依赖注入仍需明确生命周期。

## Verification

安装 TypeScript 后执行 `pnpm typecheck`。

## Run

```bash
pnpm install
pnpm typecheck
```
