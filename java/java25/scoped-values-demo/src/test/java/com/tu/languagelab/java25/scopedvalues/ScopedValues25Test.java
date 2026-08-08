package com.tu.languagelab.java25.scopedvalues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ScopedValues25Test {
    @Test void rendersBoundContext() throws Exception { assertEquals("request=r-25", ScopedValues25.render("r-25")); }
}
