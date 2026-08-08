package com.tu.languagelab.java8.fundamentals.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AgeParserTest {
    @Test
    void separatesValidInputFromDomainFailure() throws Exception {
        assertEquals(18, AgeParser.parse("18"));
        assertThrows(InvalidAgeException.class, () -> AgeParser.parse("unknown"));
        assertThrows(InvalidAgeException.class, () -> AgeParser.parse("151"));
    }
}
