# Context Manager Demo

## Feature
使用 `contextmanager` 和 `with` 管理资源作用域。
## Version & Status
Python 3.13；stable。
## Background
文件、锁和连接必须在成功或异常后都完成清理。
## Problem
手写 try/finally 容易遗漏释放路径。
## Example
`managed_events` 记录 open/work/close 生命周期。
## Usage Scenario
文件、数据库连接、锁和临时资源。
## Limitations
上下文管理器只表达生命周期，不自动处理事务重试。
## Code Walkthrough
`yield` 前准备资源，`finally` 确保退出清理。
## Business Mapping
问题 → 资源泄漏；特性 → context manager；收益 → 清理结构化；风险/替代 → 异步资源使用 async context manager。
## Learning Resources
- [Context Manager Types](https://docs.python.org/3/library/stdtypes.html#context-manager-types)（★★★★★，契约）
- [contextlib](https://docs.python.org/3/library/contextlib.html)（★★★★★，官方工具）
- [Real Python Context Managers](https://realpython.com/python-with-statement/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/context_manager_demo.py`。
## Verification
测试确认 close 发生在 with 作用域结束之后。
