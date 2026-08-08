package com.tu.languagelab.java25.kdf;

import javax.crypto.KDF;

public final class KdfDemo {
    private KdfDemo() { }
    public static boolean hkdfAvailable() throws Exception {
        // KDF 把密钥派生算法纳入标准 API，避免每个项目各自封装协议细节。
        KDF.getInstance("HKDF-SHA256");
        return true;
    }
    public static void main(String[] args) throws Exception { System.out.println(hkdfAvailable()); }
}
