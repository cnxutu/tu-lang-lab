package com.tu.languagelab.java25.stablevalues;

import java.lang.StableValue;

public final class StableValuesDemo {
    private static final StableValue<String> LABEL = StableValue.of();
    private StableValuesDemo() { }
    public static String label() {
        // StableValue 只能成功设置一次，适合懒加载后保持不变的配置值。
        return LABEL.orElseSet(() -> "k5");
    }
    public static void main(String[] args) { System.out.println(label()); }
}
