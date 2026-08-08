package com.tu.languagelab.java25.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class VectorSumTest { @Test void sumsWithVectorAndScalarTail() { assertEquals(6, VectorSum.sum(new int[]{1, 2, 3})); } }
