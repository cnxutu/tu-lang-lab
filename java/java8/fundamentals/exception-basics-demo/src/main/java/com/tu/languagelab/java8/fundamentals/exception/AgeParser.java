package com.tu.languagelab.java8.fundamentals.exception;

/** 输入解析边界：把格式错误和范围错误统一为可处理的领域异常。 */
public final class AgeParser {
    private AgeParser() { }
    public static int parse(String text) throws InvalidAgeException {
        try {
            int age = Integer.parseInt(text);
            if (age < 0 || age > 150) throw new InvalidAgeException("age out of range");
            return age;
        } catch (NumberFormatException ex) {
            // 对外抛出领域异常，调用者不必依赖底层数字解析器的实现细节。
            throw new InvalidAgeException("age must be an integer");
        }
    }
}
