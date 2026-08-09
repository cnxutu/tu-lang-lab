# Go Slice 与 Map Demo

## Feature

使用 slice 表示有序序列，使用 map 完成频次聚合。

## Background

Go 的 slice 是数组视图，map 是内置哈希表；两者是日常数据处理基础。

## Problem

业务数据常需要遍历、分组和处理空集合，手写边界时容易 panic。

## Example

`GroupByLanguage` 统计语言出现次数，`First` 用布尔值表达是否存在。

## Usage Scenario

标签聚合、配置索引和批量数据预处理。

## Limitations

map 遍历顺序不保证；共享 map 的并发写入必须加同步或改用 channel。

## Version & Status

Go 1.22+ / `toolchain_pending_verification`。

## Learning Resources

- [Go Tour：Slices](https://go.dev/tour/moretypes/7) ★★★★★。
- [Go Tour：Maps](https://go.dev/tour/moretypes/19) ★★★★★。
- [Go Blog：Slices](https://go.dev/blog/slices-intro) ★★★★☆。

## Code Walkthrough

中文注释解释 map 零值累加；测试覆盖聚合和空 slice 分支。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：需要轻量分组统计 → slice/map → 简洁高效 → 有序结果需显式排序，复杂聚合可交给数据库。

## Verification

安装 Go 后执行 `go test ./...`；当前主机未安装 Go。

## Run

```bash
go test ./...
```
