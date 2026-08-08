package com.tu.languagelab.java25.shenandoah;

public final class ShenandoahWorkload {
    private ShenandoahWorkload() { }
    public static int churn(int rounds) {
        int checksum = 0;
        for (int i = 0; i < rounds; i++) checksum ^= new byte[2048].length;
        return checksum;
    }
    public static void main(String[] args) { System.out.println(churn(20_000)); }
}
