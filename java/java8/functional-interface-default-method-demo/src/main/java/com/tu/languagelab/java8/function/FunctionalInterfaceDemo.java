package com.tu.languagelab.java8.function;

/** 展示默认方法如何在增加接口能力时保持旧实现的兼容性。 */
public final class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        DiscountRule tenPercentOff = price -> price * 90 / 100;
        System.out.println(tenPercentOff.applyWithFloor(100, 50));
    }
}
