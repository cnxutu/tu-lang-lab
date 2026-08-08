package com.tu.languagelab.java8.future;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
/** 用受控执行器模拟资料加载，突出 CompletableFuture 的执行器和组合背景。 */
public final class ProfileLoader {
    private final Executor executor;
    public ProfileLoader(Executor executor) { this.executor = executor; }
    public CompletableFuture<String> loadProfile(String userId) {
        // 显式传入执行器，避免把执行资源和业务组合逻辑隐式绑定到公共线程池。
        CompletableFuture<String> name = CompletableFuture.supplyAsync(() -> "Ada", executor);
        CompletableFuture<Integer> score = CompletableFuture.supplyAsync(() -> 42, executor);
        return name.thenCombine(score, (value, points) -> userId + ":" + value + ":" + points);
    }
}
