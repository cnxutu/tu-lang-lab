# Go 学习地图

| 状态 | 能力 | Demo | 适合解决的问题 |
| --- | --- | --- | --- |
| stable | 类型与控制流 | [`types-control-demo`](../go/basic/types-control-demo/) | 有限状态和显式分支 |
| stable | Slice/Map | [`slices-maps-demo`](../go/collection/slices-maps-demo/) | 序列处理与频次聚合 |
| stable | Interface/Error | [`interfaces-errors-demo`](../go/interface/interfaces-errors-demo/) | 可替换能力与失败传播 |
| stable | Generics | [`generics-demo`](../go/generic/generics-demo/) | 类型安全的算法复用 |
| stable | Goroutine/Channel | [`goroutine-channel-demo`](../go/concurrency/goroutine-channel-demo/) | 并发任务与结果汇聚 |
| stable | Context/HTTP | [`context-http-demo`](../go/stdlib/context-http-demo/) | 超时、取消和请求链路 |

当前 Go 工具链状态为 `toolchain_pending_verification`；安装 Go 后按案例目录逐项执行 `go test ./...`，并对并发案例执行 `go test -race ./...`。
