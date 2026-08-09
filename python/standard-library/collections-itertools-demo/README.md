# Python Collections 与 Itertools Demo

## Feature

使用标准库 `Counter` 和 `islice` 完成频次统计与有限窗口读取。

## Background

标准库提供了经过验证的集合和迭代工具，减少重复手写边界逻辑。

## Problem

统计、截取和迭代边界若手写，容易出现排序、空输入和过度消费错误。

## Example

`top_tags` 统计热门标签，`take_window` 只取指定数量。

## Usage Scenario

报表聚合、分页预览、日志标签分析和流式输入的前缀读取。

## Limitations

`Counter` 会把输入统计到内存；无限迭代器必须明确窗口或停止条件。

## Version & Status

Python 3.10+ / `stable`；CPython 3.13 已验证。

## Learning Resources

- [collections 文档](https://docs.python.org/3/library/collections.html) ★★★★★。
- [itertools 文档](https://docs.python.org/3/library/itertools.html) ★★★★★。
- [Python Cookbook](https://github.com/dabeaz/python-cookbook) ★★★★☆。

## Code Walkthrough

中文注释说明 `Counter` 和 `islice` 各自承担的意图；测试覆盖统计和窗口两个核心路径。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：重复实现聚合与分页 → 标准库集合/迭代器 → 边界可靠、代码短 → 超大数据需流式存储或数据库聚合。

## Verification

Python 3.13 下执行 `python -m unittest discover -s tests`。

## Run

```bash
python -m unittest discover -s tests
```
