package com.tu.languagelab.jvm.bytecode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BytecodeTargetTest {
    @Test
    void classifiesNumbersAndAddsValues() {
        assertEquals("negative", BytecodeTarget.classify(-1));
        assertEquals("positive-even", BytecodeTarget.classify(4));
        assertEquals("positive-odd", BytecodeTarget.classify(3));
        assertEquals(7, BytecodeTarget.add(3, 4));
    }
}
