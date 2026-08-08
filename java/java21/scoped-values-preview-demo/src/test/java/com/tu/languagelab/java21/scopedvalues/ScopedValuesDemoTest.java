package com.tu.languagelab.java21.scopedvalues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ScopedValuesDemoTest {
    @Test
    void bindsContextOnlyInsideScope() throws Exception {
        assertEquals("request=r-21", ScopedValuesDemo.render("r-21"));
    }
}
