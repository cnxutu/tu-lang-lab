package com.tu.languagelab.java25.stablevalues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StableValuesDemoTest { @Test void initializesAtMostOnce() { assertEquals("k5", StableValuesDemo.label()); } }
