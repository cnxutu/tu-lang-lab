package com.tu.languagelab.java8.fundamentals.generics;

/**
 * 泛型容器在编译期保留元素类型，解决原始集合取值时依赖强制转换的问题。
 */
public final class Box<T> {
    private final T value;
    public Box(T value) { this.value = value; }
    public T get() { return value; }
}
