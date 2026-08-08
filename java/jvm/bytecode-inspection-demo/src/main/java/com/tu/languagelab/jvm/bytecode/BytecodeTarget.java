package com.tu.languagelab.jvm.bytecode;

public final class BytecodeTarget {
    private BytecodeTarget() {
    }

    public static String classify(int value) {
        // 保留显式分支，便于用 javap 观察条件跳转指令与常量返回值。
        if (value < 0) {
            return "negative";
        }
        if (value % 2 == 0) {
            return "positive-even";
        }
        return "positive-odd";
    }

    public static int add(int left, int right) {
        return left + right;
    }
}
