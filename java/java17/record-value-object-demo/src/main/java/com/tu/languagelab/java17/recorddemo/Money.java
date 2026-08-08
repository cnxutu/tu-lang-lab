package com.tu.languagelab.java17.recorddemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Objects;

public record Money(String currency, BigDecimal amount) {
    public Money {
        currency = Objects.requireNonNull(currency, "currency must not be null").trim();
        amount = Objects.requireNonNull(amount, "amount must not be null");

        if (currency.isEmpty()) {
            throw new IllegalArgumentException("currency must not be blank");
        }
        if (amount.signum() < 0) {
            throw new IllegalArgumentException("amount must not be negative");
        }

        currency = currency.toUpperCase(Locale.ROOT);
        amount = amount.setScale(2, RoundingMode.UNNECESSARY);
    }

    public String format() {
        return currency + " " + amount.toPlainString();
    }
}
