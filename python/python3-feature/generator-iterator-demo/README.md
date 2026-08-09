# Generator and Iterator Demo

## Feature
用 `yield` 实现惰性迭代器。
## Version & Status
Python 3.13；stable。
## Background
大数据流不应一次性加载到内存。
## Problem
列表会立即创建全部结果，无法表达逐项消费。
## Example
`countdown` 每次迭代只产生一个数字。
## Usage Scenario
日志流、文件行处理和分页数据。
## Limitations
生成器只能按迭代方向消费一次；需要重复遍历时重新创建。
## Code Walkthrough
`yield` 暂停函数状态，下一次 `next` 从暂停位置继续。
## Business Mapping
问题 → 数据量大且消费节奏不一致；特性 → generator；收益 → 降低瞬时内存；风险/替代 → 需要随机访问时使用序列。
## Learning Resources
- [Generators](https://docs.python.org/3/howto/functional.html#generators)（★★★★★，官方教程）
- [Iterator Protocol](https://docs.python.org/3/library/stdtypes.html#iterator-types)（★★★★★，契约）
- [Real Python Generators](https://realpython.com/introduction-to-python-generators/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/generator_demo.py`。
## Verification
测试验证惰性迭代器第一次产生序列、第二次已耗尽。
