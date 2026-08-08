package com.tu.languagelab.java25.jfr;

public final class Jfr25Workload {
    private Jfr25Workload() { }
    public static long compute() {
        long value = 0;
        for (int i = 0; i < 100_000; i++) value += i;
        // Java 25 的 JFR 事件/采样参数由启动配置控制，源码只提供稳定负载。
        return value;
    }
    public static void main(String[] args) { System.out.println(compute()); }
}
