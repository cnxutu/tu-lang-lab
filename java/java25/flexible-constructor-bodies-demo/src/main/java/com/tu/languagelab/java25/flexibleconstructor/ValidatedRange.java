package com.tu.languagelab.java25.flexibleconstructor;

public final class ValidatedRange extends ValidatedRangeBase {
    public ValidatedRange(int start, int end) {
        // Java 25 允许在显式 super 前做不访问 this 的参数校验。
        if (start > end) throw new IllegalArgumentException("start > end");
        super(start, end);
    }
    public int length() { return end() - start(); }
}
