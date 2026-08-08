package com.tu.languagelab.java8.fundamentals.concurrency;

/** 用 Thread、start 和 join 组成最小 worker 生命周期，连接基础线程与后续高层并发 API。 */
public final class ThreadBasics {
    private ThreadBasics() { }

    public static int runWorkers(int workerCount, int incrementsPerWorker) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Thread[] workers = new Thread[workerCount];
        for (int i = 0; i < workerCount; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < incrementsPerWorker; j++) counter.increment();
            });
            workers[i].start();
        }
        for (Thread worker : workers) worker.join();
        // join 保证主线程在读取结果前，所有工作线程都已完成。
        return counter.value();
    }
}
