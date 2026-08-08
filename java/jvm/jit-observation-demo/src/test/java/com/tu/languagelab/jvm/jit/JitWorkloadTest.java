package com.tu.languagelab.jvm.jit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JitWorkloadTest {
    @Test
    void producesDeterministicWorkload() {
        assertEquals(285, JitWorkload.sumSquares(10));
    }
}
