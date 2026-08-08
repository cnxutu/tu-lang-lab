package com.tu.languagelab.jvm.jit;

public final class JitWorkload {
    private JitWorkload() { }
    public static long sumSquares(int count) {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (long) i * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        long result = 0;
        for (int i = 0; i < 20_000; i++) {
            result ^= sumSquares(1_000);
        }
        System.out.println(result);
    }
}
