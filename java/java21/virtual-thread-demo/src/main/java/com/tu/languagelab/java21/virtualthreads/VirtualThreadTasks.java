package com.tu.languagelab.java21.virtualthreads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class VirtualThreadTasks {
    private VirtualThreadTasks() {
    }

    public static List<TaskResult> collectTaskResults(int taskCount)
            throws InterruptedException, ExecutionException {
        if (taskCount <= 0) {
            throw new IllegalArgumentException("taskCount must be positive");
        }

        List<Future<TaskResult>> futures = new ArrayList<Future<TaskResult>>();
        try (ExecutorService executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            // 每个任务创建一个虚拟线程；它适合大量阻塞任务，而不是复用为线程池。
            for (int taskId = 1; taskId <= taskCount; taskId++) {
                final int currentTaskId = taskId;
                futures.add(executor.submit(() -> new TaskResult(
                        currentTaskId,
                        Thread.currentThread().isVirtual())));
            }

            List<TaskResult> results = new ArrayList<TaskResult>();
            for (Future<TaskResult> future : futures) {
                results.add(future.get());
            }
            // 并发完成顺序不可预测，排序使 Demo 的输出和断言保持确定。
            results.sort(Comparator.comparingInt(TaskResult::taskId));
            return results;
        }
    }
}
