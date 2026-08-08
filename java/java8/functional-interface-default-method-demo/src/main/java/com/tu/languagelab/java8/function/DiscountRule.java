package com.tu.languagelab.java8.function;

@FunctionalInterface
public interface DiscountRule {
    int apply(int price);

    default int applyWithFloor(int price, int floor) {
        // 默认方法让接口在演进时保留旧实现，同时复用统一的下限规则。
        return Math.max(floor, apply(price));
    }
}
