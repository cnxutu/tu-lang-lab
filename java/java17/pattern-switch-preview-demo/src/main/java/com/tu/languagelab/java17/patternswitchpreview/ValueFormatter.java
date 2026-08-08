package com.tu.languagelab.java17.patternswitchpreview;

public final class ValueFormatter {
    private ValueFormatter() {
    }

    public static String format(Object value) {
        // Java 17 的预览语法：case 同时完成类型判断与变量绑定，运行需 --enable-preview。
        return switch (value) {
            case Integer number -> "integer:" + number;
            case String text -> "text:" + text;
            case null -> "null";
            default -> "other";
        };
    }
}
