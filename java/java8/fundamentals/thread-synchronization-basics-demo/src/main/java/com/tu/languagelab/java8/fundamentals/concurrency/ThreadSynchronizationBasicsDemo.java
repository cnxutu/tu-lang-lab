package com.tu.languagelab.java8.fundamentals.concurrency;

public final class ThreadSynchronizationBasicsDemo {
    private ThreadSynchronizationBasicsDemo() { }
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ThreadBasics.runWorkers(2, 1_000));
    }
}
