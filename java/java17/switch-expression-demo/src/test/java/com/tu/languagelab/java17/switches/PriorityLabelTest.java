package com.tu.languagelab.java17.switches;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PriorityLabelTest { @Test void mapsEachKnownPriority() { assertEquals("high", PriorityLabel.from(3)); assertThrows(IllegalArgumentException.class, () -> PriorityLabel.from(0)); } }
