package com.tu.languagelab.java8.fundamentals.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public final class FileIoBasicsDemo {
    private FileIoBasicsDemo() { }
    public static void main(String[] args) throws Exception {
        Path file = Files.createTempFile("k5-note-", ".txt");
        System.out.println(NoteFile.writeAndRead(file, Arrays.asList("java8", "io")));
        Files.deleteIfExists(file);
    }
}
