package com.tu.languagelab.java17.patternswitchpreview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ValueFormatterTest {
    @Test
    void formatsTypePatternsAndNull() {
        assertEquals("integer:7", ValueFormatter.format(7));
        assertEquals("text:lab", ValueFormatter.format("lab"));
        assertEquals("null", ValueFormatter.format(null));
        assertEquals("other", ValueFormatter.format(1L));
    }
}
