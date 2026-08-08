package com.tu.languagelab.java8.fundamentals.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** 使用 NIO.2 的最小文本文件读写器，突出路径、编码和资源边界。 */
public final class NoteFile {
    private NoteFile() { }

    public static List<String> writeAndRead(Path path, List<String> lines) throws IOException {
        // Files API 负责资源关闭和 UTF-8 编码，适合小型文本文件的清晰示例。
        Files.write(path, lines, StandardCharsets.UTF_8);
        return Files.readAllLines(path, StandardCharsets.UTF_8);
    }
}
