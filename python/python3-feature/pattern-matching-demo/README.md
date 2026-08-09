# Structural Pattern Matching Demo

## Feature
用 Python 3.10+ `match/case` 按映射、序列和空值结构分派。
## Version & Status
Python 3.13；stable since Python 3.10。
## Background
复杂输入解析常堆叠 isinstance、键访问和长度判断。
## Problem
分支逻辑重复且结构意图不明显。
## Example
`describe` 匹配用户字典、列表和 None。
## Usage Scenario
事件路由、协议解析和 AST/配置处理。
## Limitations
模式匹配不是类型验证框架，开放输入仍需 default 分支。
## Code Walkthrough
映射模式绑定 `name`，序列模式使用 `*rest`，`_` 表示兜底。
## Business Mapping
问题 → 输入结构分支重复；特性 → structural pattern matching；收益 → 分支和数据形状靠近；风险/替代 → 简单条件使用 if 更直观。
## Learning Resources
- [PEP 634](https://peps.python.org/pep-0634/)（★★★★★，语义）
- [match Statements](https://docs.python.org/3/tutorial/controlflow.html#match-statements)（★★★★★，官方教程）
- [Real Python Structural Pattern Matching](https://realpython.com/structural-pattern-matching/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/pattern_demo.py`。
## Verification
测试覆盖映射、序列和 None 三种结构。
