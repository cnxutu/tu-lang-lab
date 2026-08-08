package com.tu.languagelab.java25.moduleimports;

import module java.sql;

public final class ModuleImportDemo {
    private ModuleImportDemo() { }
    public static String driverType() { return Driver.class.getSimpleName(); }
    public static void main(String[] args) { System.out.println(driverType()); }
}
