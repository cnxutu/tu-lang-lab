package com.tu.languagelab.java21.foreignfunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NativeStringLengthTest {
    @Test
    void callsNativeStrlen() throws Throwable {
        assertEquals(2L, NativeStringLength.length("K5"));
    }
}
