package com.tu.languagelab.java25.primitivepatterns;

public final class PrimitivePatternsDemo {
    private PrimitivePatternsDemo() { }
    public static String classify(Object value) {
        // Java 25 预览允许 switch 直接匹配 primitive 类型，减少包装类型分支样板。
        return switch (value) {
            case int number -> "int:" + number;
            case long number -> "long:" + number;
            case null -> "null";
            default -> "other";
        };
    }
    public static void main(String[] args) { System.out.println(classify(25)); }
}
