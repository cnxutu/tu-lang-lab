package com.tu.languagelab.java8.lambda;

import java.util.Objects;

/** 最小任务数据对象，用于让 Lambda 示例聚焦行为而非业务模型。 */
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
