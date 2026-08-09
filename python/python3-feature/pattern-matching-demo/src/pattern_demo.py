def describe(message: object) -> str:
    """match 按结构分派数据，避免多层 isinstance 和下标访问。"""
    match message:
        case {"kind": "user", "name": str(name)}:
            return "user:" + name
        case [first, *rest]:
            return "list:" + str(first) + ":" + str(len(rest))
        case None:
            return "empty"
        case _:
            return "other"


if __name__ == "__main__":
    print(describe({"kind": "user", "name": "Ada"}))
