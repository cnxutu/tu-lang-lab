# C 数组与字符串 Demo

## Feature

展示数组/指针语义和以 `\0` 结尾的 C 字符串。

## Background

C 没有独立 string 类型，字符数组和指针约定共同构成字符串 API。

## Problem

字符串长度、缓冲区容量和结束符处理错误容易造成越界读写。

## Example

`lesson_length` 手工遍历字符串并处理 NULL。

## Usage Scenario

协议字段、嵌入式缓冲区和 C API 互操作。

## Limitations

本例不负责目标缓冲区容量；生产代码要使用长度参数和边界检查。

## Version & Status

C11 / `toolchain_pending_verification`。

## Learning Resources

- [cppreference：Null-terminated byte strings](https://en.cppreference.com/w/c/string/byte) ★★★★★。
- [C FAQ：Strings](https://www.cs.uwaterloo.ca/~m32rober/ai/strings.html) ★★★★☆。
- [CERT C：STR rules](https://wiki.sei.cmu.edu/confluence/display/c/STR31-C) ★★★★★。

## Code Walkthrough

中文注释强调 `\0` 约定；测试覆盖正常字符串和 NULL 边界。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：需要与 C API 交换文本 → char array/string convention → 零拷贝互操作 → 所有长度都需显式验证。

## Verification

安装 C 编译器后执行 `make test`；当前主机未发现 GCC/Clang。

## Run

```bash
make test
make
./demo
```
