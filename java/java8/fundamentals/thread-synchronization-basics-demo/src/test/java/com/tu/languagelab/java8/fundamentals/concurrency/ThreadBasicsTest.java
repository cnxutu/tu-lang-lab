package com.tu.languagelab.java8.fundamentals.concurrency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ThreadBasicsTest {
    @Test
    void waitsForWorkersAndProtectsSharedState() throws Exception {
        assertEquals(2_000, ThreadBasics.runWorkers(4, 500));
    }
}
