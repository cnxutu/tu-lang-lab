from functools import wraps
from typing import Callable, TypeVar


T = TypeVar("T")


def audit(label: str) -> Callable[[Callable[..., T]], Callable[..., T]]:
    """装饰器在不修改业务函数主体的前提下增加调用记录。"""
    def decorate(function: Callable[..., T]) -> Callable[..., T]:
        @wraps(function)
        def wrapped(*args, **kwargs) -> T:
            print("audit:" + label)
            return function(*args, **kwargs)

        return wrapped

    return decorate


@audit("calculate")
def calculate(left: int, right: int) -> int:
    return left + right


if __name__ == "__main__":
    print(calculate(2, 3))
