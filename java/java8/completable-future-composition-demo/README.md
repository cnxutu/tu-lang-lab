# CompletableFuture Composition Demo
## Feature
`CompletableFuture.supplyAsync` 与 `thenCombine`。
## Version & Status
JDK 8，`stable`。
## Background
页面或接口常需并发获取多个互不依赖的数据，再组合为一个响应。
## Problem
如何明确执行器并组合名称与积分两个异步结果。
## Example
`ProfileLoader` 用同一显式执行器启动两个任务，再用 `thenCombine` 合成结果。
## Usage Scenario
并发查询用户资料、推荐和权限等独立数据源。
## Limitations
真实服务还要定义超时、取消、异常传播和下游资源限流；本案例不使用公共线程池。
## Learning Resources
- [CompletableFuture API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
- [Dev.java Concurrency](https://dev.java/learn/)
## Code Walkthrough
先看两个 `supplyAsync`，再看 `thenCombine` 如何仅在两者完成后合成。
## Business Mapping
问题：多个独立调用串行导致延迟叠加。收益：并发等待后组合。风险：并发数不能超过下游承载能力。
## Verification
测试验证确定性组合结果。
## Run
JDK 8 下执行 `mvn clean test`。
