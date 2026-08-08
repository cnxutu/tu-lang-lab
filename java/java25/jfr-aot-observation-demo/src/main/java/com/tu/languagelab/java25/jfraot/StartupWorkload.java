package com.tu.languagelab.java25.jfraot;

public final class StartupWorkload {
    private StartupWorkload() { }
    public static String marker() {
        // JFR/AOT 是启动与运行时观察入口，Java 代码只提供确定性启动负载。
        return "startup-observation";
    }
    public static void main(String[] args) { System.out.println(marker()); }
}
