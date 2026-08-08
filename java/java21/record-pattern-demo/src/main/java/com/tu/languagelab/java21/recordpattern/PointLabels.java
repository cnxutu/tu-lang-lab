package com.tu.languagelab.java21.recordpattern;

public final class PointLabels {
    private PointLabels() {
    }

    public static String label(Object value) {
        // Record Pattern 在类型匹配时直接解构组件，避免重复调用 accessor。
        if (value instanceof Point(int x, int y)) {
            return x == y ? "diagonal" : "other";
        }
        return "unknown";
    }
}
