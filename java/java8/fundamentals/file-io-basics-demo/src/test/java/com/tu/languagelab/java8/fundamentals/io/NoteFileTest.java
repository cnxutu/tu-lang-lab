package com.tu.languagelab.java8.fundamentals.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class NoteFileTest {
    @Test
    void writesAndReadsUtf8Text() throws Exception {
        Path file = Files.createTempFile("k5-test-", ".txt");
        try {
            assertEquals(Arrays.asList("集合", "泛型"), NoteFile.writeAndRead(file, Arrays.asList("集合", "泛型")));
        } finally {
            Files.deleteIfExists(file);
        }
    }
}
