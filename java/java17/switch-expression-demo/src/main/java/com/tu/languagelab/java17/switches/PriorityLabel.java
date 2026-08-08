package com.tu.languagelab.java17.switches;
public final class PriorityLabel { private PriorityLabel() { } public static String from(int priority) { return switch (priority) { case 1 -> "low"; case 2 -> "normal"; case 3 -> "high"; default -> throw new IllegalArgumentException("unknown priority"); }; } }
