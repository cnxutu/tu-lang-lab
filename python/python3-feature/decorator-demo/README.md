# Python Decorator Demo

## Feature
使用装饰器在函数外增加审计行为，并保留元数据。
## Version & Status
Python 3.13；stable。
## Background
日志、计时、权限等横切行为不应复制到每个函数体。
## Problem
复制包装逻辑会造成遗漏和函数名丢失。
## Example
`@audit` 打印标签，`functools.wraps` 保留 `calculate.__name__`。
## Usage Scenario
审计、缓存、重试和输入校验的轻量封装。
## Limitations
装饰器会改变调用栈；复杂依赖注入应使用更明确的对象设计。
## Code Walkthrough
外层工厂接收标签，中层接收函数，内层包装调用。
## Business Mapping
问题 → 横切逻辑复制；特性 → decorator；收益 → 集中复用；风险/替代 → 注意参数签名、异常和可观测性。
## Learning Resources
- [Decorators HOWTO](https://docs.python.org/3/howto/functional.html#decorators)（★★★★★，官方语义）
- [functools.wraps](https://docs.python.org/3/library/functools.html#functools.wraps)（★★★★★，API）
- [Real Python Decorators](https://realpython.com/primer-on-python-decorators/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/decorator_demo.py`。
## Verification
测试验证包装函数结果和名称元数据。
