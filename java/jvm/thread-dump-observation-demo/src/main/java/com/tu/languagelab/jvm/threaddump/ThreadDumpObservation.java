package com.tu.languagelab.jvm.threaddump;

import java.util.Map;

public final class ThreadDumpObservation {
    private ThreadDumpObservation() { }
    public static int threadCount() {
        // getAllStackTraces 是进程内的瞬时快照，适合教学验证，不替代 jstack 现场。
        return Map.copyOf(Thread.getAllStackTraces()).size();
    }
    public static void main(String[] args) {
        System.out.println("threads=" + threadCount());
    }
}
