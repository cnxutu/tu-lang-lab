package com.tu.languagelab.java8.fundamentals.concurrency;

/** 同步计数器用于说明共享可变状态、临界区和 intrinsic lock 的基础边界。 */
public final class SafeCounter {
    private int value;

    public synchronized void increment() {
        // synchronized 让“读取—修改—写回”成为一个不可被交错打断的临界区。
        value++;
    }

    public synchronized int value() {
        return value;
    }
}
