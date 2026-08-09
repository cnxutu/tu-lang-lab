# Python Syntax Basics Demo

## Feature
函数参数、解包、字典和基本类型表达。
## Version & Status
Python 3.13；stable language basics。
## Background
初学者需要先理解 Python 的对象、容器和调用约定，再进入高级特性。
## Problem
不理解 `*args/**kwargs` 和容器组合时，后续 API 会显得神秘。
## Example
`summarize_user` 同时接收位置参数和关键字参数。
## Usage Scenario
配置组装、命令行参数和数据记录。
## Limitations
类型标注不等于运行时强制校验。
## Code Walkthrough
函数返回普通 dict，测试直接比较数据结构。
## Business Mapping
问题 → 输入形态不统一；特性 → 参数解包与容器；收益 → API 灵活；风险/替代 → 公共接口仍需明确 schema。
## Learning Resources
- [Python Tutorial](https://docs.python.org/3/tutorial/)（★★★★★，官方入门）
- [Python Language Reference](https://docs.python.org/3/reference/)（★★★★★，语义）
- [Real Python](https://realpython.com/)（★★★★☆，实践文章）
## Run
在目录执行 `python -m unittest discover -s tests`，再运行 `python src/syntax_basics.py`。
## Verification
Python 3.13 测试验证位置参数、关键字参数和确定性结果。
