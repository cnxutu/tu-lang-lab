package com.tu.languagelab.java17.hex;
import java.util.HexFormat;
public final class TraceIdCodec { private TraceIdCodec() { } public static String encode(byte[] value) { return HexFormat.of().formatHex(value); } }
