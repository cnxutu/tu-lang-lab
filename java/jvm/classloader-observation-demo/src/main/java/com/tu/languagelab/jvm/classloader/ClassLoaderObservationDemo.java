package com.tu.languagelab.jvm.classloader;

public final class ClassLoaderObservationDemo {
    private ClassLoaderObservationDemo() { }
    public static String describe(Class<?> type) {
        ClassLoader loader = type.getClassLoader();
        // Bootstrap 加载器在 Java API 中以 null 表示，因此输出名称前先处理该边界。
        return type.getName() + " -> " + (loader == null ? "bootstrap" : loader.getName());
    }
    public static void main(String[] args) {
        System.out.println(describe(ClassLoaderObservationDemo.class));
        System.out.println(describe(String.class));
    }
}
