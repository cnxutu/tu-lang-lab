# HTTP Network Basics Demo

## Feature
使用 JDK 8 `HttpURLConnection` 完成一次本地 HTTP GET。

## Version & Status
JDK 8；`stable`。

## Background
网络调用同时涉及 URL、连接超时、响应流和连接释放，是业务系统的重要边界。

## Problem
初学网络代码常忘记超时、编码或 disconnect，导致线程长期阻塞。

## Example
案例启动本地 `HttpServer`，再用 `HttpURLConnection` 读取响应，不依赖外部网络。

## Usage Scenario
理解 HTTP 客户端生命周期、健康检查和简单内部接口调用。

## Limitations
`HttpURLConnection` API 较底层；真实项目还需连接池、重试、认证和指标。

## Code Walkthrough
设置 method、connect/read timeout，按 UTF-8 读响应，finally 关闭本地 server。

## Business Mapping
问题 → 网络边界无超时且资源未释放；特性 → URL/URLConnection；收益 → 形成最小可靠调用骨架；风险/替代 → 复杂客户端使用成熟 HTTP 库。

## Learning Resources
- [Networking Tutorial](https://docs.oracle.com/javase/tutorial/networking/)（★★★★★，官方教程）
- [HttpURLConnection API](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html)（★★★★★，契约）
- [JavaGuide 网络编程](https://github.com/Snailclimb/JavaGuide)（★★★☆☆，中文索引）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `HttpNetworkBasicsDemo`。

## Verification
测试只访问本地临时端口，确定性验证响应为 `hello-java8`。

