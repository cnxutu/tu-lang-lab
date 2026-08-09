# C 语言学习区

本目录聚焦 C 的类型、指针、内存、结构体、标准库和构建机制，不引入第三方框架。

## 推荐顺序

`types-control-demo` → `pointer-memory-demo` → `struct-functions-demo` → `arrays-strings-demo` → `file-io-demo` → `preprocessor-demo`。

每个案例都是独立 Make 工程，`make test` 编译并执行测试；当前主机未发现 GCC/Clang，统一标记 `toolchain_pending_verification`。

完整前置/后续关系见 [`docs/learning-case-catalog.md`](../docs/learning-case-catalog.md)。
