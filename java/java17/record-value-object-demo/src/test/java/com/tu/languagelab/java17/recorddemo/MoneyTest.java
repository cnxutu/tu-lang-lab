package com.tu.languagelab.java17.recorddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    void normalizesAndComparesValueObjects() {
        Money first = new Money(" usd ", new BigDecimal("12.30"));
        Money sameValue = new Money("USD", new BigDecimal("12.30"));

        assertEquals("USD", first.currency());
        assertEquals("USD 12.30", first.format());
        assertEquals(first, sameValue);
    }

    @Test
    void rejectsInvalidAmounts() {
        assertThrows(IllegalArgumentException.class,
                () -> new Money("USD", new BigDecimal("-0.01")));
    }
}
