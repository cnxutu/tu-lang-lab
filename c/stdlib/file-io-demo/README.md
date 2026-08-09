# C 标准库文件 I/O Demo

## Feature

使用 `FILE*`、`fprintf` 和 `tmpfile` 完成可测试的标准库文件写入。

## Background

C 标准库把文件抽象为句柄，资源生命周期由调用方明确管理。

## Problem

文件打开、写入和关闭失败若不检查，会产生数据丢失或资源泄漏。

## Example

`write_lesson` 检查句柄和写入返回值，测试使用临时文件。

## Usage Scenario

日志、配置导出和嵌入式持久化边界。

## Limitations

本例不处理编码、并发写和原子替换；生产文件写入需更完整的失败恢复。

## Version & Status

C11 stdio / `toolchain_pending_verification`。

## Learning Resources

- [cppreference：stdio](https://en.cppreference.com/w/c/io) ★★★★★。
- [C11：Input/output](https://www.open-std.org/jtc1/sc22/wg14/www/docs/n1570.pdf) ★★★★★。
- [GNU C Intro：Files](https://www.gnu.org/software/c-intro-and-ref/manual/html_node/Streams.html) ★★★★☆。

## Code Walkthrough

中文注释说明 FILE 资源边界；测试覆盖临时文件成功写入和 NULL 失败。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：需要最小依赖写文件 → stdio → 可移植标准库 → 关键数据需要原子写、fsync 和恢复策略。

## Verification

安装 C 编译器后执行 `make test`；当前主机未安装编译器。

## Run

```bash
make test
make
./demo
```
