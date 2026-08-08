package com.tu.languagelab.java17.recorddemo;

import java.math.BigDecimal;

public final class RecordValueObjectDemo {
    private RecordValueObjectDemo() {
    }

    public static void main(String[] args) {
        Money first = new Money("usd", new BigDecimal("12.30"));
        Money sameValue = new Money("USD", new BigDecimal("12.30"));

        System.out.println(first.format());
        System.out.println("same value=" + first.equals(sameValue));
    }
}
