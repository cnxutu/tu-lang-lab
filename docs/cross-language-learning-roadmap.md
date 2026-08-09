# 跨语言推荐学习路线

## 为什么按这个顺序

Python 先建立高层表达能力和标准库直觉；JavaScript/Web API 再理解事件循环与异步边界；TypeScript 将动态接口显式化；C 用指针、结构体和预处理器建立底层模型；Go 再对照 GC、接口和 goroutine；Rust 最后用所有权、借用和生命周期解释“安全是如何被编译器证明的”。Java 则作为主线，持续对比 JVM、并发和类型系统。

## 阶段路线

1. Python：语法 → 函数对象 → 迭代器 → 类型/数据类 → 标准库 → 资源管理 → async/match → GIL/内存。
2. JavaScript：模块 → 闭包 → 原型链 → Promise → Event Loop → Fetch 取消 → DOM 事件。
3. TypeScript：泛型/联合类型 → Utility Types → 装饰器 → 高级类型 → 运行时校验边界。
4. C：类型 → 指针 → struct → 字符串 → File I/O → 预处理器。
5. Go：类型 → slice/map → interface/error → 泛型 → goroutine/channel → context/HTTP。
6. Rust：枚举 → 所有权 → 借用 → 生命周期 → Result/Option → Trait/泛型 → async 运行时。
7. Java 对照：Lambda/Stream → Record/Sealed → Virtual Thread → JVM 观测。

## 每个 Demo 的阅读动作

先读 README 的 Background 和 Problem，再运行最小示例，随后阅读中文注释和测试，最后查看 Business Mapping 与 Limitations。不要先复制代码到框架项目；先确认语言能力本身解决的边界。
