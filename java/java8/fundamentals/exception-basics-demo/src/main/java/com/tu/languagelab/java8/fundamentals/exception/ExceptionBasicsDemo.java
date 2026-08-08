package com.tu.languagelab.java8.fundamentals.exception;

public final class ExceptionBasicsDemo {
    private ExceptionBasicsDemo() { }
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println(AgeParser.parse("18"));
    }
}
