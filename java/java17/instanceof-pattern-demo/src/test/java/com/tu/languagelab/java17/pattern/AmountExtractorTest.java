package com.tu.languagelab.java17.pattern;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class AmountExtractorTest { @Test void bindsValueOnlyAfterTypeMatch() { assertEquals(42, AmountExtractor.extract(Integer.valueOf(42))); assertEquals(0, AmountExtractor.extract("42")); } }
