package com.tu.languagelab.java8.lambda;

import java.util.Objects;

public final class Task {
    private final String name;
    private final int priority;

    public Task(String name, int priority) {
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
