package com.tu.languagelab.java21.unnamedpatterns;

public final class BoxClassifier {
    private BoxClassifier() {
    }

    public static String classify(Object value) {
        // `_` 明确表示组件被刻意忽略，避免为不用的数据起名造成误读。
        return switch (value) {
            case Box(_) -> "box";
            case null -> "null";
            default -> "other";
        };
    }
}
