import json
from pathlib import Path


def round_trip(path: Path, payload: dict[str, object]) -> dict[str, object]:
    """pathlib 负责路径语义，json 负责文本边界，组合成可测试的标准库操作。"""
    path.write_text(json.dumps(payload, ensure_ascii=False), encoding="utf-8")
    return json.loads(path.read_text(encoding="utf-8"))


if __name__ == "__main__":
    file = Path("target") / "sample.json"
    file.parent.mkdir(exist_ok=True)
    print(round_trip(file, {"language": "python", "version": 3}))
