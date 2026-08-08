package com.tu.languagelab.java8.fundamentals.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class GenericAlgorithmsTest {
    @Test
    void keepsTypeInformationAndConstrainsAlgorithm() {
        Box<String> box = new Box<String>("k5");
        assertEquals("k5", box.get());
        assertEquals(Integer.valueOf(3), GenericAlgorithms.max(Arrays.asList(3, 1, 2)));
    }
}
