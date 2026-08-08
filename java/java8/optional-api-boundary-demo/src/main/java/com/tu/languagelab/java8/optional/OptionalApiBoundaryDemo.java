package com.tu.languagelab.java8.optional;
import java.util.Collections;
public final class OptionalApiBoundaryDemo { public static void main(String[] args) { System.out.println(new UserDirectory(Collections.singletonMap("u1", "Ada")).findDisplayName("u2").orElse("anonymous")); } }
