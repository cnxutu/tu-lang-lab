package com.tu.languagelab.java8.function;

@FunctionalInterface
/** 函数式接口把可替换的折扣规则变成单一抽象方法契约。 */
public interface DiscountRule {
    int apply(int price);

    default int applyWithFloor(int price, int floor) {
        // 默认方法让接口在演进时保留旧实现，同时复用统一的下限规则。
        return Math.max(floor, apply(price));
    }
}
