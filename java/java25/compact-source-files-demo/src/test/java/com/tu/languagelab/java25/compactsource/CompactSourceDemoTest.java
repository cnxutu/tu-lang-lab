package com.tu.languagelab.java25.compactsource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CompactSourceDemoTest {
    @Test void keepsExampleDeterministic() { assertEquals("compact-source", CompactSourceDemo.message()); }
}
