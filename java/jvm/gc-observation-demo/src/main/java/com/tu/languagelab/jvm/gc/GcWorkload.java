package com.tu.languagelab.jvm.gc;

public final class GcWorkload {
    private GcWorkload() { }
    public static int allocateShortLivedObjects(int rounds) {
        int checksum = 0;
        for (int i = 0; i < rounds; i++) {
            checksum ^= new byte[1024].length;
        }
        return checksum;
    }
    public static void main(String[] args) {
        System.out.println(allocateShortLivedObjects(10_000));
    }
}
