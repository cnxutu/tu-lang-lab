# Async/Await Demo

## Feature
用 `asyncio`、`async def`、`await` 和 `gather` 组合等待型任务。
## Version & Status
Python 3.13；stable API。
## Background
网络等待期间线程可以处理其他协程，适合 I/O 并发。
## Problem
同步等待多个 I/O 会让总耗时近似串行相加。
## Example
两个协程通过 `asyncio.gather` 聚合结果。
## Usage Scenario
HTTP、数据库和文件等异步 I/O 扇出。
## Limitations
asyncio 不会自动加速 CPU 密集任务；阻塞调用会卡住事件循环。
## Code Walkthrough
`await asyncio.sleep` 主动让出事件循环；`asyncio.run` 创建运行边界。
## Business Mapping
问题 → I/O 等待占用执行机会；特性 → coroutine/event loop；收益 → 并发等待；风险/替代 → CPU 任务使用进程或线程。
## Learning Resources
- [asyncio](https://docs.python.org/3/library/asyncio.html)（★★★★★，官方 API）
- [Coroutines and Tasks](https://docs.python.org/3/library/asyncio-task.html)（★★★★★，执行模型）
- [Real Python Async IO](https://realpython.com/async-io-python/)（★★★★☆，实践）
## Run
`python -m unittest discover -s tests`；`python src/async_demo.py`。
## Verification
测试通过 `asyncio.run` 验证确定性聚合结果。
