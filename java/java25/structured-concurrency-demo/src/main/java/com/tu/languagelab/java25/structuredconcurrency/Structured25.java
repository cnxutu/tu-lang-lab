package com.tu.languagelab.java25.structuredconcurrency;

import java.util.concurrent.StructuredTaskScope;

public final class Structured25 {
    private Structured25() { }
    public static String load() throws Exception {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var left = scope.fork(() -> "profile");
            var right = scope.fork(() -> "alerts");
            scope.join().throwIfFailed();
            // 结构化作用域把子任务取消、等待和异常传播绑定到一次请求。
            return left.get() + "+" + right.get();
        }
    }
    public static void main(String[] args) throws Exception { System.out.println(load()); }
}
