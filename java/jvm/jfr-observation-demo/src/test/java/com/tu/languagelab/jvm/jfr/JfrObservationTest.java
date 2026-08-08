package com.tu.languagelab.jvm.jfr;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class JfrObservationTest {
    @Test
    void writesRecordingFile() throws Exception {
        Path output = Path.of("target", "test-k5-demo.jfr");
        JfrObservation.record(output);
        assertTrue(Files.size(output) > 0);
    }
}
