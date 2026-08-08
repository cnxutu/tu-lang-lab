package com.tu.languagelab.java8.fundamentals.exception;

/** 领域异常把底层解析失败转换成调用者真正关心的年龄校验契约。 */
public final class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}
