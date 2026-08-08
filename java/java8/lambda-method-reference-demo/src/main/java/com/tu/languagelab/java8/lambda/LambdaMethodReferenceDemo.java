package com.tu.languagelab.java8.lambda;

import java.util.Arrays;
import java.util.List;

public final class LambdaMethodReferenceDemo {
    private LambdaMethodReferenceDemo() {
    }

    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("gamma", 3),
                new Task("alpha", 2),
                new Task("beta", 1));

        List<Task> importantTasks = TaskOperations.filter(tasks, task -> task.getPriority() >= 2);
        List<Task> sortedTasks = TaskOperations.sortByName(importantTasks);
        List<String> output = TaskOperations.format(sortedTasks, TaskOperations::formatTask);

        for (String line : output) {
            System.out.println(line);
        }
    }
}
