package com.tu.languagelab.jvm.memory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MemorySnapshotTest {
    @Test
    void capturesNonNegativeJvmMetrics() {
        MemorySnapshot snapshot = MemorySnapshot.capture();
        assertTrue(snapshot.usedBytes() >= 0);
        assertTrue(snapshot.committedBytes() >= snapshot.usedBytes());
        assertTrue(snapshot.maxBytes() > 0);
    }
}
