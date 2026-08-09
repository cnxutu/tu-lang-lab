from dataclasses import dataclass
from typing import TypeVar


T = TypeVar("T")


@dataclass(frozen=True)
class Result:
    value: str


def identity(value: T) -> T:
    """类型变量表达输入和输出保持同一类型，运行时仍由 Python 动态执行。"""
    return value


def build_result(text: str) -> Result:
    return Result(identity(text))


if __name__ == "__main__":
    print(build_result("typed-boundary"))
