package com.tu.languagelab.java17.hex;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class TraceIdCodecTest { @Test void encodesBytesAsHex() { assertEquals("0a1f", TraceIdCodec.encode(new byte[] {0x0a, 0x1f})); } }
