package com.tu.languagelab.java21.unnamedpatterns;

public final class UnnamedPatternsDemo {
    private UnnamedPatternsDemo() {
    }

    public static void main(String[] args) {
        System.out.println(BoxClassifier.classify(new Box("ignored")));
    }
}
