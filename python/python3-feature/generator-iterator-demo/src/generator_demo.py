from collections.abc import Iterator


def countdown(start: int) -> Iterator[int]:
    """yield 按需产生值，避免一次性创建完整列表。"""
    current = start
    while current > 0:
        yield current
        current -= 1


def main() -> None:
    print(list(countdown(3)))


if __name__ == "__main__":
    main()
