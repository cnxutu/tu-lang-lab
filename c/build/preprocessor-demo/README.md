# C 预处理器与构建 Demo

## Feature

使用 `#define` 和编译参数把构建配置传给 C 源码。

## Background

C 预处理器在编译前处理宏、条件编译和头文件包含，是跨平台构建的早期机制。

## Problem

同一源码需要根据构建目标选择版本、特性或平台分支。

## Example

Makefile 通过 `-DLESSON_VERSION=5` 编译配置值。

## Usage Scenario

平台适配、调试开关和嵌入式构建配置。

## Limitations

宏没有类型检查，复杂宏会降低可读性；现代代码应优先使用 const、函数和构建系统变量。

## Version & Status

C11 / `toolchain_pending_verification`。

## Learning Resources

- [cppreference：Preprocessor](https://en.cppreference.com/w/c/preprocessor) ★★★★★。
- [GCC CPP Manual](https://gcc.gnu.org/onlinedocs/cpp/) ★★★★★。
- [CMake Tutorial](https://cmake.org/cmake/help/latest/guide/tutorial/index.html) ★★★★☆，作为后续构建专题。

## Code Walkthrough

中文注释说明宏的编译前阶段和类型边界；测试验证 Makefile 传入的版本值。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：同一源码适配不同构建目标 → preprocessor → 低依赖配置 → 宏复杂时迁移到类型化配置或构建系统。

## Verification

安装 C 编译器后执行 `make test`；当前主机未发现 GCC/Clang。

## Run

```bash
make test
make
./demo
```
