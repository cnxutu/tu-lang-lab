# Go 与 C 学习路线

## 为什么先学 C，再对照 Go

C 直接展示内存、指针、结构体和编译阶段，适合建立运行机制基础；Go 在此之上提供垃圾回收、接口、泛型和 goroutine/channel，适合对比“显式资源控制”和“运行时/语言协作”。

## 推荐阶段

1. C：类型/控制流 → 指针 → struct → 数组/字符串 → File I/O → 预处理器。
2. Go：类型/控制流 → slice/map → interface/error → generics → goroutine/channel → context/HTTP。
3. 对照：C 指针与 Go 引用语义；C 手工资源与 Go GC；C 线程/共享内存与 Go channel；C 宏与 Go 构建标签。

## 阅读动作

先读当前 Demo 的 Background 和 Problem，再执行最小命令；接着阅读关键中文注释和测试，最后记录“该特性替代了什么旧做法、不能解决什么问题”。
