# Bytecode Inspection Demo

## Feature

使用 `javap -c -p` 将一个包含分支与方法调用的 Java 类反汇编为字节码。

## Background

理解 JVM 需要把源代码层面的控制流、调用和运算与 class 文件中的指令建立联系。`javap` 是 JDK 自带的静态观察工具。

## Problem

如何编译一个可预测的小型类，并观察其条件分支与整数加法在字节码中的表示。

## Example

`BytecodeTarget.classify` 包含两个条件分支，`BytecodeTarget.add` 包含一个整数加法；README 给出对应的 `javap` 命令。

## Usage Scenario

适合在学习类文件、分支指令、调用指令或编译器差异前建立最小观察样本。

## Limitations

`javap` 输出依赖编译器、JDK 版本和编译选项。本案例只观察 class 文件，不代表 JIT 优化后的机器码，也不对指令布局作跨版本承诺。

## Run

在 macOS 或 WSL2 中切换到 JDK 17 后运行：

```bash
export JAVA_HOME=/path/to/jdk17
export PATH="$JAVA_HOME/bin:$PATH"
mvn clean test
java -cp target/classes com.tu.languagelab.jvm.bytecode.BytecodeInspectionDemo
javap -c -p -classpath target/classes com.tu.languagelab.jvm.bytecode.BytecodeTarget
```

预期主类输出：

```text
classify=positive-even
sum=7
```
