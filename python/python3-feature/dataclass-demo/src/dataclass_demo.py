from dataclasses import dataclass


@dataclass(frozen=True)
class Coordinate:
    """不可变 dataclass 自动提供初始化、比较和调试表示，适合值对象。"""
    x: int
    y: int


def midpoint(left: Coordinate, right: Coordinate) -> Coordinate:
    return Coordinate((left.x + right.x) // 2, (left.y + right.y) // 2)


if __name__ == "__main__":
    print(midpoint(Coordinate(0, 0), Coordinate(2, 4)))
