package com.tu.languagelab.java25.flexibleconstructor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ValidatedRangeTest {
    @Test void validatesBeforeDelegating() { assertEquals(3, new ValidatedRange(2, 5).length()); assertThrows(IllegalArgumentException.class, () -> new ValidatedRange(5, 2)); }
}
