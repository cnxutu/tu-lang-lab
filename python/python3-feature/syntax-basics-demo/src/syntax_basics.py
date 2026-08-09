def summarize_user(name: str, *tags: str, **attributes: str) -> dict:
    """用参数解包和字典推导构造稳定的学习摘要。"""
    return {"name": name, "tags": list(tags), "attributes": attributes}


def main() -> None:
    print(summarize_user("Ada", "language", level="beginner"))


if __name__ == "__main__":
    main()
