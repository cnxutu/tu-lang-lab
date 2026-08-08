package com.tu.languagelab.jvm.bytecode;

public final class BytecodeInspectionDemo {
    private BytecodeInspectionDemo() {
    }

    public static void main(String[] args) {
        System.out.println("classify=" + BytecodeTarget.classify(4));
        System.out.println("sum=" + BytecodeTarget.add(3, 4));
    }
}
