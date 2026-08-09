# Dataclass Demo

## Feature
用 `@dataclass(frozen=True)` 建立值对象。
## Version & Status
Python 3.13；stable。
## Background
值对象通常需要初始化、比较和调试表示，手写样板容易出错。
## Problem
重复字段和相等性代码掩盖了业务含义。
## Example
`Coordinate` 自动获得构造和相等性，冻结后不可修改。
## Usage Scenario
坐标、配置、查询结果和消息快照。
## Limitations
dataclass 不自动提供领域不变量、持久化或深度不可变。
## Code Walkthrough
`midpoint` 保持纯函数；frozen 只约束字段赋值。
## Business Mapping
问题 → 值对象样板多；特性 → dataclass；收益 → 清晰可比较；风险/替代 → 复杂生命周期对象仍需普通类。
## Learning Resources
- [dataclasses](https://docs.python.org/3/library/dataclasses.html)（★★★★★，官方 API）
- [Data Classes PEP 557](https://peps.python.org/pep-0557/)（★★★★★，设计背景）
- [Real Python Dataclasses](https://realpython.com/python-data-classes/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/dataclass_demo.py`。
## Verification
测试覆盖值相等性、冻结赋值失败和中点计算。
