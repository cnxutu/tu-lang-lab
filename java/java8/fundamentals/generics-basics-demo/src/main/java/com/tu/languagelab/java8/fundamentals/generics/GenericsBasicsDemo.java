package com.tu.languagelab.java8.fundamentals.generics;

import java.util.Arrays;

public final class GenericsBasicsDemo {
    private GenericsBasicsDemo() {
    }
    public static void main(String[] args) {
        Box<String> box = new Box<String>("type-safe");
        System.out.println(box.get() + ":" + GenericAlgorithms.max(Arrays.asList(3, 1, 2)));
    }
}
