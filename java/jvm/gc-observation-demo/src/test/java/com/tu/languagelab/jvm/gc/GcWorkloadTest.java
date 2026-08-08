package com.tu.languagelab.jvm.gc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GcWorkloadTest {
    @Test
    void allocatesShortLivedObjects() {
        assertEquals(0, GcWorkload.allocateShortLivedObjects(10));
    }
}
