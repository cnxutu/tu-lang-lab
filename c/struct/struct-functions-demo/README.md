# C Struct 与函数 Demo

## Feature

使用 `struct` 聚合数据，并通过 `const` 指针传给函数。

## Background

C 没有内置对象系统，结构体和函数组合是组织领域数据的基础方式。

## Problem

相关字段若分散传递，函数签名会变长且容易把字段顺序传错。

## Example

`lesson` 聚合标题和时长，`is_short` 只读判断。

## Usage Scenario

协议头、配置快照和嵌入式设备数据。

## Limitations

结构体不自动管理内部指针的生命周期；拷贝和所有权需手工约定。

## Version & Status

C11 / `toolchain_pending_verification`。

## Learning Resources

- [cppreference：Struct and union](https://en.cppreference.com/w/c/language/struct) ★★★★★。
- [C11：Structure and union spec](https://www.open-std.org/jtc1/sc22/wg14/www/docs/n1570.pdf) ★★★★★。
- [GNU C Intro：Structures](https://www.gnu.org/software/c-intro-and-ref/manual/html_node/Structures.html) ★★★★☆。

## Code Walkthrough

中文注释解释 const 指针的只读边界；测试覆盖结构体和 NULL 输入。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：相关字段需要统一传递 → struct → 数据契约清晰 → 嵌套指针复杂时需明确内存协议。

## Verification

安装 C 编译器后执行 `make test`；当前主机未发现 C 编译器。

## Run

```bash
make test
make
./demo
```
