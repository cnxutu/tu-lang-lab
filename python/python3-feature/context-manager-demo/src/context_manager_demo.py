from contextlib import contextmanager
from typing import Iterator


@contextmanager
def managed_events(events: list[str]) -> Iterator[list[str]]:
    """上下文管理器把资源准备和清理绑定到 with 作用域。"""
    events.append("open")
    try:
        yield events
    finally:
        events.append("close")


def run() -> list[str]:
    events: list[str] = []
    with managed_events(events) as current:
        current.append("work")
    return events


if __name__ == "__main__":
    print(run())
