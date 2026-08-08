package com.tu.languagelab.jvm.memory;

public record MemorySnapshot(long usedBytes, long committedBytes, long maxBytes) {
    public static MemorySnapshot capture() {
        Runtime runtime = Runtime.getRuntime();
        // Runtime 指标是当前 JVM 的观测快照，不等价于业务对象的精确大小。
        long used = runtime.totalMemory() - runtime.freeMemory();
        return new MemorySnapshot(used, runtime.totalMemory(), runtime.maxMemory());
    }
}
