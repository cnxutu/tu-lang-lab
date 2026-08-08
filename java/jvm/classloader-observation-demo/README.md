# JVM ClassLoader Observation Demo

## Feature
观察应用类与 JDK 核心类的类加载器归属。

## Version & Status
- JDK 17；stable API，输出依赖运行环境。

## Background
类名相同不代表类型相同；类加载器也是类型身份的一部分。

## Problem
插件、容器和模块化系统中的 `ClassCastException` 常需要先确认类由谁加载。

## Example
对自定义类和 `String` 调用 `getClassLoader()`，将 `null` 解释为 bootstrap 边界。

## Code Walkthrough
`describe` 只做观察，不修改类加载器委派关系。

## Business Mapping
问题 → 插件隔离或热加载故障难定位；特性 → ClassLoader 观察；收益 → 建立类型身份判断；风险/替代 → 生产排查还需结合模块路径、启动参数和线程上下文。

## Usage Scenario
插件系统、容器启动和依赖冲突诊断。

## Limitations
具体 loader 名称随启动方式变化，不能写死为某个实现类。

## Learning Resources
- [ClassLoader API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/ClassLoader.html)（★★★★★，官方契约）
- [JVMS Loading](https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-5.html)（★★★★★，规范）
- [JavaGuide JVM](https://github.com/Snailclimb/JavaGuide)（★★★★☆，中文排查索引）

## Run
`mvn clean test`；`mvn package` 后执行 `java -cp target/classes com.tu.languagelab.jvm.classloader.ClassLoaderObservationDemo`。

## Verification
验证记录 JDK 17、OS、classpath/module 参数和命令；不记录机器路径。
