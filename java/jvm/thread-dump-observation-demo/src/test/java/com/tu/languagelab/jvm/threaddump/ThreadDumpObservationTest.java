package com.tu.languagelab.jvm.threaddump;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ThreadDumpObservationTest {
    @Test
    void seesAtLeastCurrentThread() {
        assertTrue(ThreadDumpObservation.threadCount() > 0);
    }
}
