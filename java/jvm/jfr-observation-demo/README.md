# JVM JFR Observation Demo

## Feature
使用 JDK Flight Recorder API 录制一个最小 JVM 事件文件。

## Version & Status
- JDK 17；JFR API stable，事件集合和默认配置需以 JDK 文档为准。

## Background
JFR 适合低开销地关联 CPU、线程、分配和 GC 事件，比手工拼接日志更适合持续诊断。

## Problem
仅凭单条日志难以解释启动、线程或 GC 的时间关系。

## Example
`JfrObservation.record` 启动 Recording、运行短负载、停止并写出 `.jfr` 文件。

## Code Walkthrough
try-with-resources 保证 Recording 关闭；示例只验证文件生成，不输出大事件日志。

## Business Mapping
问题 → 性能异常缺少时间线；特性 → JFR 事件录制；收益 → 可在 JDK Mission Control 中回放；风险/替代 → 录制配置和数据保留需考虑隐私与成本。

## Usage Scenario
启动诊断、线上低开销采样和 GC/线程关联分析。

## Limitations
示例不代表生产事件模板；`.jfr` 文件可能含环境信息，不应随意提交仓库。

## Learning Resources
- [JFR API](https://docs.oracle.com/en/java/javase/17/docs/api/jdk.jfr/jdk/jfr/package-summary.html)（★★★★★，官方 API）
- [JDK Flight Recorder](https://docs.oracle.com/en/java/javase/17/jfapi/)（★★★★★，官方指南）
- [Inside Java](https://inside.java/tag/jfr/)（★★★★☆，实践背景）

## Run
`mvn clean test`；`mvn package` 后执行主类，生成 `target/k5-demo.jfr`；用 JDK Mission Control 打开它。

## Verification
验证文件可生成且大小大于零；记录 JDK、OS、JVM 参数和命令，不提交录制文件。
