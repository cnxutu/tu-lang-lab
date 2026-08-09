from __future__ import annotations

import sys
import threading


def cpu_work(iterations: int) -> int:
    """返回可重复的 CPU 工作结果，用于观察线程调度而非性能基准。"""
    return sum(index * index for index in range(iterations))


def reference_count_snapshot(value: object) -> int:
    # CPython 的引用计数是实现细节；不要把它当成跨解释器契约。
    return sys.getrefcount(value)


def run_two_threads(iterations: int) -> list[int]:
    results: list[int] = []
    threads = [threading.Thread(target=lambda: results.append(cpu_work(iterations))) for _ in range(2)]
    for thread in threads:
        thread.start()
    for thread in threads:
        thread.join()
    return results
