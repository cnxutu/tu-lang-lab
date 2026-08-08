package com.tu.languagelab.java25.objectheaders;

public final class ObjectHeaderWorkload {
    private ObjectHeaderWorkload() { }
    public static int allocate(int count) {
        Object[] values = new Object[count];
        for (int i = 0; i < values.length; i++) values[i] = new Object();
        // 对象头压缩是 JVM 布局实验，不改变 Java 代码的对象语义。
        return values.length;
    }
    public static void main(String[] args) { System.out.println(allocate(10_000)); }
}
