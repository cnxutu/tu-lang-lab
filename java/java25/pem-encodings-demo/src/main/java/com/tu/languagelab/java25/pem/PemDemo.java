package com.tu.languagelab.java25.pem;

import java.security.PEMRecord;

public final class PemDemo {
    private PemDemo() { }
    public static String encodeRecord() {
        // PEMRecord 保存类型与 Base64 内容，编码器负责补齐标准头尾。
        return new PEMRecord("K5 DATA", "SzU=").toString();
    }
    public static void main(String[] args) { System.out.println(encodeRecord()); }
}
