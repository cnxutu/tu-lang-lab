from itertools import islice
from collections import Counter


def top_tags(tags: list[str], limit: int = 2) -> list[tuple[str, int]]:
    # Counter 负责统计，most_common 直接表达“按频次取前 N 个”的意图。
    return Counter(tags).most_common(limit)


def take_window(values: list[int], size: int) -> list[int]:
    # islice 只消费需要的前缀，适合把有限读取策略写得清楚。
    return list(islice(values, size))
