# C 指针与内存 Demo

## Feature

使用指针读取并修改调用方变量，同时处理空指针边界。

## Background

C 的指针是地址级抽象，也是理解数组、字符串和手工内存管理的入口。

## Problem

函数默认按值传递，需要通过地址修改调用方数据。

## Example

`increment` 接受 `int *` 并修改目标值。

## Usage Scenario

输出参数、缓冲区操作和系统 API 交互。

## Limitations

空指针、悬垂指针、越界和 double free 都可能导致未定义行为；本例不演示堆分配。

## Version & Status

C11 / `toolchain_pending_verification`。

## Learning Resources

- [C11：Pointer types](https://www.open-std.org/jtc1/sc22/wg14/www/docs/n1570.pdf) ★★★★★。
- [cppreference：Pointers](https://en.cppreference.com/w/c/language/pointer) ★★★★★。
- [CS50：Pointers](https://cs50.harvard.edu/x/2023/weeks/4/) ★★★★☆。

## Code Walkthrough

中文注释说明指针修改调用方的原因；测试同时覆盖正常和 NULL 路径。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：需要修改外部缓冲区 → pointer → 零拷贝/直接控制 → 高风险边界可考虑更安全的封装语言。

## Verification

安装 C 编译器后执行 `make test`；当前主机未安装 GCC/Clang。

## Run

```bash
make test
make
./demo
```
