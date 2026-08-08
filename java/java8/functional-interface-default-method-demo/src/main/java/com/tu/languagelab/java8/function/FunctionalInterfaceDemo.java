package com.tu.languagelab.java8.function;

public final class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        DiscountRule tenPercentOff = price -> price * 90 / 100;
        System.out.println(tenPercentOff.applyWithFloor(100, 50));
    }
}
