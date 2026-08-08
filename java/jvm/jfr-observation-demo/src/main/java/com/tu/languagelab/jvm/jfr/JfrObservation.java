package com.tu.languagelab.jvm.jfr;

import java.nio.file.Path;
import jdk.jfr.Recording;

public final class JfrObservation {
    private JfrObservation() { }
    public static Path record(Path output) throws Exception {
        try (Recording recording = new Recording()) {
            recording.start();
            for (int i = 0; i < 100_000; i++) {
                Math.sqrt(i);
            }
            recording.stop();
            recording.dump(output);
            return output;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(record(Path.of("target", "k5-demo.jfr")));
    }
}
