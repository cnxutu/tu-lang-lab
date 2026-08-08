package com.tu.languagelab.java8.fundamentals.generics;

import java.util.List;

/**
 * 泛型算法用边界表达“元素必须可比较”，让复用和类型检查同时成立。
 */
public final class GenericAlgorithms {
    private GenericAlgorithms() {
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("values must not be empty");
        }
        T result = values.get(0);
        for (T value : values) {
            if (value.compareTo(result) > 0) {
                result = value;
            }
        }
        // 上界保证 T 可比较，通配符让算法接受 T 子类型集合。
        return result;
    }
}
