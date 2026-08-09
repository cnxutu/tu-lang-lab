import asyncio


async def fetch(label: str, delay: float) -> str:
    """await 让出事件循环，适合等待 I/O，不会把 CPU 计算变成异步。"""
    await asyncio.sleep(delay)
    return label


async def collect() -> list[str]:
    return list(await asyncio.gather(fetch("profile", 0), fetch("alerts", 0)))


def main() -> None:
    print(asyncio.run(collect()))


if __name__ == "__main__":
    main()
