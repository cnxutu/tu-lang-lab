package com.tu.languagelab.java21.unnamedpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BoxClassifierTest {
    @Test
    void ignoresUnusedRecordComponent() {
        assertEquals("box", BoxClassifier.classify(new Box("ignored")));
        assertEquals("other", BoxClassifier.classify(1));
    }
}
