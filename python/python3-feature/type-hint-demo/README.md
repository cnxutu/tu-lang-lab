# Type Hint Demo

## Feature
使用类型变量、函数标注和不可变结果对象表达 API 契约。
## Version & Status
Python 3.13；stable syntax/API，静态检查工具可选。
## Background
动态语言的灵活性需要额外的可读性和工具支持。
## Problem
调用者无法从函数签名快速知道输入输出关系。
## Example
`identity` 用 `TypeVar` 表达输入输出同型，`Result` 表达结构。
## Usage Scenario
公共库、团队协作和 IDE 静态检查。
## Limitations
类型标注默认不在运行时阻止错误值；需要 mypy/pyright 等工具时另行配置。
## Code Walkthrough
`T` 保留泛型关系，`@dataclass(frozen=True)` 使结果不可变。
## Business Mapping
问题 → 动态边界难维护；特性 → type hints；收益 → 文档和检查；风险/替代 → 不要把标注误解为运行时验证。
## Learning Resources
- [typing](https://docs.python.org/3/library/typing.html)（★★★★★，官方 API）
- [Type Hints HOWTO](https://docs.python.org/3/howto/annotations.html)（★★★★☆，官方说明）
- [mypy](https://github.com/python/mypy)（★★★★☆，开源静态检查）
## Run
`python -m unittest discover -s tests`；`python src/type_hint_demo.py`。
## Verification
测试验证泛型函数和 dataclass 结果，不把运行时执行当作静态检查替代。
