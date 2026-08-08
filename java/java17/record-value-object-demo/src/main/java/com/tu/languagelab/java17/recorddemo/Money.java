package com.tu.languagelab.java17.recorddemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Objects;

public record Money(String currency, BigDecimal amount) {
    public Money {
        // 紧凑构造器会在 Record 组件赋值前执行，适合集中完成值对象规范化。
        currency = Objects.requireNonNull(currency, "currency must not be null").trim();
        amount = Objects.requireNonNull(amount, "amount must not be null");

        if (currency.isEmpty()) {
            throw new IllegalArgumentException("currency must not be blank");
        }
        if (amount.signum() < 0) {
            throw new IllegalArgumentException("amount must not be negative");
        }

        // 统一组件值后，Record 自动生成的 equals/hashCode 才能表达这里定义的值语义。
        currency = currency.toUpperCase(Locale.ROOT);
        amount = amount.setScale(2, RoundingMode.UNNECESSARY);
    }

    public String format() {
        return currency + " " + amount.toPlainString();
    }
}
