# C 学习地图

| 状态 | 能力 | Demo | 适合解决的问题 |
| --- | --- | --- | --- |
| stable | 类型与控制流 | [`types-control-demo`](../c/basic/types-control-demo/) | 枚举状态和显式分支 |
| stable | 指针与内存 | [`pointer-memory-demo`](../c/memory/pointer-memory-demo/) | 输出参数和地址级操作 |
| stable | Struct/函数 | [`struct-functions-demo`](../c/struct/struct-functions-demo/) | 聚合数据与只读访问 |
| stable | 数组/字符串 | [`arrays-strings-demo`](../c/string/arrays-strings-demo/) | C 字符串和缓冲区边界 |
| stable | 标准库 File I/O | [`file-io-demo`](../c/stdlib/file-io-demo/) | 文件句柄和资源检查 |
| stable | 预处理器/构建 | [`preprocessor-demo`](../c/build/preprocessor-demo/) | 平台配置和编译期开关 |

当前 C 工具链状态为 `toolchain_pending_verification`；安装 GCC 或 Clang 后逐目录执行 `make test`，再执行 `make` 和 `./demo`。
