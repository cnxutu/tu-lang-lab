package com.tu.languagelab.jvm.memory;

public final class MemoryObservationDemo {
    private MemoryObservationDemo() { }
    public static void main(String[] args) {
        System.out.println(MemorySnapshot.capture());
    }
}
