# TypeScript Utility Type Demo

## Feature
使用 `Pick` 与 `Partial` 构造安全的局部更新类型。

## Background
真实接口常区分完整实体和部分更新请求，类型应反映两者差异。

## Problem
直接使用 `Partial<Entity>` 可能允许修改不该变更的 ID 等字段。

## Example
`LessonPatch` 只开放 `title` 和 `summary`。

## Usage Scenario
表单 PATCH、配置覆盖和增量编辑。

## Limitations
工具类型只在编译期生效，运行时仍需校验字段和值。

## Version & Status
TypeScript 5.x / `stable`。

## Learning Resources
- [TypeScript Handbook：Utility Types](https://www.typescriptlang.org/docs/handbook/utility-types.html) ★★★★★。
- [TypeScript Handbook：Object Types](https://www.typescriptlang.org/docs/handbook/2/objects.html) ★★★★☆。
- [Type Challenges](https://github.com/type-challenges/type-challenges) ★★★★☆。

## Code Walkthrough
`Pick` 选择字段，`Partial` 让这些字段可选；注释解释了为什么不用完整对象更新。

## Business Mapping
问题 → 特性 → 收益 → 风险/替代方案：更新 DTO 泄漏不可变字段 → Utility Types → 契约精确 → 复杂校验仍需运行时 schema。

## Verification
安装 TypeScript 后执行 `pnpm typecheck`；本目录不依赖运行时框架。

## Run
```bash
pnpm install
pnpm typecheck
```
