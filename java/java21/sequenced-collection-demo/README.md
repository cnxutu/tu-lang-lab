# Sequenced Collection Demo
## Feature
`SequencedCollection` 与 `reversed`。
## Version & Status
JDK 21，`stable`。
## Background
历史记录、队列和时间线都需要首尾访问，但过去 API 分散在 List、Deque 等具体类型。
## Problem
如何以统一 API 读取最新事件优先的顺序。
## Example
`events.reversed()` 产生反向顺序视图，再复制为独立列表。
## Usage Scenario
审计记录、最近访问、消息时间线和栈/队列展示。
## Limitations
视图的可变性取决于底层集合；需要快照时显式复制。
## Learning Resources
- [JEP 431](https://openjdk.org/jeps/431)
## Code Walkthrough
观察 `reversed` 与新列表复制的不同职责。
## Business Mapping
问题：首尾 API 因集合类型不同而分散。收益：统一顺序抽象。风险：不要误以为视图总是不可变快照。
## Verification
测试验证反向遇到顺序。
## Run
JDK 21 下执行 `mvn clean test`。
