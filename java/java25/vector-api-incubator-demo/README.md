# Vector API (Java 25 Incubator) Demo

## Feature
Vector API 以 incubator 模块表达数据并行操作（JEP 508）。
## Version & Status
JDK 25；`pending_jdk25_verification`；孵化 API，编译/运行需 `--add-modules jdk.incubator.vector`。
## Background
数组计算中的同构操作适合 SIMD，但手写平台指令难以移植。
## Problem
逐元素求和无法直接表达向量宽度和硬件加速机会。
## Example
`VectorSum` 对向量宽度分块，剩余尾部元素用标量循环处理。
## Usage Scenario
图像、信号、特征向量和批量数值计算。
## Limitations
API 仍可能变化；不保证每台 CPU 都有收益，必须用 JMH 验证。
## Code Walkthrough
`loopBound` 保证安全向量边界，tail loop 保证长度非向量倍数时正确。
## Business Mapping
问题 → 数值批处理吞吐；特性 → Vector API；收益 → 可移植 SIMD 表达；风险/替代 → 标量代码或 JNI/专用库。
## Learning Resources
- [JEP 508](https://openjdk.org/jeps/508)（★★★★★，孵化状态）
- [Vector API Javadoc](https://docs.oracle.com/en/java/javase/25/docs/api/jdk.incubator.vector/module-summary.html)（★★★★★，API）
- [OpenJDK Vector API](https://github.com/openjdk/jdk/tree/master/src/jdk.incubator.vector)（★★★★☆，实现与测试）
## Run
JDK 25 下执行 `mvn clean test`；POM 已显式加入 `jdk.incubator.vector`。
## Verification
`pending_jdk25_verification`；需记录 CPU 指令集、向量宽度、JDK build 和 JMH 结果。
