package com.tu.languagelab.java25.flexibleconstructor;

public class ValidatedRangeBase {
    private final int start;
    private final int end;
    protected ValidatedRangeBase(int start, int end) { this.start = start; this.end = end; }
    protected int start() { return start; }
    protected int end() { return end; }
}
