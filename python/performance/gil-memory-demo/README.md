# Python GIL 与内存观察 Demo

## Feature

用最小 CPU 工作和引用计数快照，区分 CPython 的 GIL、线程语义与实现细节。

## Background

CPython 的 GIL 影响同一进程内 Python 字节码线程的并行方式；引用计数又是 CPython 的内存管理实现细节。

## Problem

“多线程一定提升 CPU 性能”或“引用计数就是 Python 语言规范”都是常见误解。

## Example

`run_two_threads` 验证线程结果，`reference_count_snapshot` 只做观察，不输出性能结论。

## Usage Scenario

选择 CPU 多进程、I/O 多线程或异步方案前，先理解解释器边界。

## Limitations

本例不是基准测试；不同 Python 实现、版本和构建参数可能有不同 GIL/内存行为。

## Version & Status

Python 3.13 / `stable`；CPython 3.13 已验证。

## Learning Resources

- [Python FAQ：GIL](https://docs.python.org/3/faq/library.html#what-kinds-of-global-value-mutation-are-thread-safe) ★★★★★。
- [Python Data Model：对象生命周期](https://docs.python.org/3/reference/datamodel.html) ★★★★★。
- [Real Python：GIL](https://realpython.com/python-gil/) ★★★★☆。

## Code Walkthrough

中文注释明确 `sys.getrefcount` 只适用于 CPython 观察；测试只断言确定性结果，不把时延当结论。

## Business Mapping

问题 → 特性 → 收益 → 风险/替代方案：CPU 任务线程扩展性不佳 → GIL 观察 → 正确选择进程/异步/原生扩展 → 不同解释器需重新验证。

## Verification

Python 3.13 下执行 `python -m unittest discover -s tests`。

## Run

```bash
python -m unittest discover -s tests
```
