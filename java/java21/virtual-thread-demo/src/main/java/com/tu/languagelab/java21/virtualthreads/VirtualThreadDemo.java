package com.tu.languagelab.java21.virtualthreads;

import java.util.List;

public final class VirtualThreadDemo {
    private VirtualThreadDemo() {
    }

    public static void main(String[] args) throws Exception {
        List<TaskResult> results = VirtualThreadTasks.collectTaskResults(4);
        long virtualThreadCount = results.stream().filter(TaskResult::virtualThread).count();

        System.out.println("completed=" + results.size());
        System.out.println("virtualThreads=" + virtualThreadCount);
        System.out.println("taskIds=" + results.stream().map(TaskResult::taskId).toList());
    }
}
