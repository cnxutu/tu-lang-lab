# Shell / Bash 特性地图

| 状态 | 特性 | Demo | 重点问题 | 业务映射 |
| --- | --- | --- | --- | --- |
| stable | 变量、数组、函数、条件与循环 | [basics-and-control-demo](../shell/bash/basics-and-control-demo/README.md) | 如何编排简单输入和分支 | 构建前检查、批量命令 |
| stable | 管道、标准流、awk、排序 | [pipeline-and-text-demo](../shell/bash/pipeline-and-text-demo/README.md) | 如何组合小工具处理文本 | 日志摘要、结果汇总 |
| stable | 严格模式、trap、临时资源 | [safe-script-demo](../shell/bash/safe-script-demo/README.md) | 如何避免半成功和资源残留 | 打包、测试夹具、诊断脚本 |
| stable | 后台任务、wait、信号清理 | [process-and-signal-demo](../shell/bash/process-and-signal-demo/README.md) | 如何并行短任务并收集状态 | 批量检查、并行测试 |
| planned | 参数解析、可移植 POSIX sh | TBD | 如何兼容不同 Shell | 跨发行版安装脚本 |
| planned | ShellCheck、Bats 测试与 CI | TBD | 如何把脚本纳入质量门禁 | 自动化脚本回归 |

## 推荐学习顺序

先读变量与控制流，再读管道文本处理；随后用严格模式和 `trap` 修正脚本可靠性，最后学习后台任务与信号。每个 Demo 都应先运行，再修改一个输入或分支，观察退出码和输出变化。
