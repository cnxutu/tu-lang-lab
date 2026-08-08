package com.tu.languagelab.java17.random;

import java.util.random.RandomGenerator;

public final class Dice {
    private Dice() {
    }

    public static int roll(RandomGenerator generator) {
        // 以接口接收生成器，测试可传入固定种子的实现，业务可按算法选择实现。
        return generator.nextInt(1, 7);
    }
}
