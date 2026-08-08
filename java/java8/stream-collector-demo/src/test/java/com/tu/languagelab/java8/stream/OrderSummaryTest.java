package com.tu.languagelab.java8.stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
class OrderSummaryTest { @Test void groupsAndCounts() { assertEquals(Long.valueOf(2), OrderSummary.countByCategory(Arrays.asList("book", "book", "pen")).get("book")); } }
