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
            results.sort(Comparator.comparingInt(TaskResult::taskId));
            return results;
        }
    }
}
