package com.tu.languagelab.java8.function;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class DiscountRuleTest { @Test void appliesRuleAndFloor() { DiscountRule rule = p -> p / 2; assertEquals(60, rule.applyWithFloor(100, 60)); } }
