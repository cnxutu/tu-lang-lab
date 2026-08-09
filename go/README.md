# Go 语言学习区

本目录聚焦 Go 的语言设计、标准库和并发模型，不引入 Web 框架或业务工程。

## 推荐顺序

`types-control-demo` → `slices-maps-demo` → `interfaces-errors-demo` → `generics-demo` → `goroutine-channel-demo` → `context-http-demo`。

每个案例都是独立 Go module，关键代码包含中文注释，测试命令统一为 `go test ./...`。当前主机未安装 Go，统一标记 `toolchain_pending_verification`。

完整前置/后续关系见 [`docs/learning-case-catalog.md`](../docs/learning-case-catalog.md)。
