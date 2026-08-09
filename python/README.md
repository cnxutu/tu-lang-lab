# Python 学习区

本目录只研究 Python 语言本身：语法演进、标准库、类型能力、异步模型与运行时行为，不放入 FastAPI、Django、LangChain 等框架。

## 推荐顺序

`syntax-basics-demo` → `decorator-demo` → `generator-iterator-demo` → `type-hint-demo`/`dataclass-demo` → `collections-itertools-demo` → `context-manager-demo`/`pathlib-json-demo` → `async-await-demo`/`pattern-matching-demo` → `gil-memory-demo`。

每个子目录都是独立工程，使用 `python -m unittest discover -s tests` 验证；关键代码包含中文注释和业务映射。

完整前置/后续关系见 [`docs/learning-case-catalog.md`](../docs/learning-case-catalog.md)。
