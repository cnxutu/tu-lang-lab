# File IO Basics Demo

## Feature
使用 `Path`、`Files` 和 UTF-8 读写小型文本文件。

## Version & Status
JDK 8；`stable`。

## Background
文件是最直接的持久化边界，初学者需要理解路径、编码和资源生命周期。

## Problem
手写流关闭和默认编码容易造成泄漏或跨机器乱码。

## Example
`NoteFile.writeAndRead` 写入两行中文，再按 UTF-8 读取。

## Usage Scenario
配置、学习笔记、导入导出和小型批处理。

## Limitations
`readAllLines` 适合小文件；大文件应使用 buffered streaming。

## Code Walkthrough
`StandardCharsets.UTF_8` 固定编码；测试 finally 删除临时文件。

## Business Mapping
问题 → 文件编码和关闭逻辑不一致；特性 → NIO.2 Files；收益 → 代码短且资源边界清晰；风险/替代 → 大文件和并发写入需专门设计。

## Learning Resources
- [Basic I/O Tutorial](https://docs.oracle.com/javase/tutorial/essential/io/)（★★★★★，官方教程）
- [Files API](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html)（★★★★★，契约）
- [JavaGuide IO](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文索引）

## Run
设置 JDK 8 后执行 `mvn clean test`，运行 `FileIoBasicsDemo`。

## Verification
测试验证 UTF-8 中文内容读写，并在 finally 中清理临时文件。

