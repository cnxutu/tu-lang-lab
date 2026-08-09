# C 类型与控制流 Demo

## Feature

使用枚举、函数和 `switch` 表达有限状态。

## Background

C 直接暴露底层数据表示，理解整数、枚举和控制流是后续指针学习的基础。

## Problem

状态若散落为无名整数，阅读和维护时很难知道每个值的含义。

## Example

`lesson_label` 把发布状态转换为文本。

## Usage Scenario

协议状态、解析阶段和嵌入式状态机。

## Limitations

C 不会自动阻止非法枚举值；外部输入必须自行校验。

## Version & Status

C11 / `toolchain_pending_verification`。

## Learning Resources

- [C11 Draft](https://www.open-std.org/jtc1/sc22/wg14/www/docs/n1570.pdf) ★★★★★。
- [cppreference：C language](https://en.cppreference.com/w/c) ★★★★★。
- [Beej's Guide to C](https://beej.us/guide/bgc/) ★★★★☆。

## Code Walkthrough

中文注释解释 enum/switch 的状态建模；测试直接断言 published 分支。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：状态值缺少语义 → enum/switch → 可读性提高 → 外部数据仍需边界检查。

## Verification

安装 GCC/Clang 后执行 `make test`；当前主机未发现 C 编译器。

## Run

```bash
make test
make
./demo
```
