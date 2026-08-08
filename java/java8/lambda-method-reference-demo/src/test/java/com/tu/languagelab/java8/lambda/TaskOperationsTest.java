package com.tu.languagelab.java8.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class TaskOperationsTest {
    @Test
    void filtersSortsAndFormatsTasksWithFunctionalParameters() {
        List<Task> tasks = Arrays.asList(
                new Task("gamma", 3),
                new Task("alpha", 2),
                new Task("beta", 1));

        List<Task> importantTasks = TaskOperations.filter(tasks, task -> task.getPriority() >= 2);
        List<Task> sortedTasks = TaskOperations.sortByName(importantTasks);

        assertEquals(Arrays.asList("alpha", "gamma"), Arrays.asList(
                sortedTasks.get(0).getName(), sortedTasks.get(1).getName()));
        assertEquals(Arrays.asList("alpha (priority=2)", "gamma (priority=3)"),
                TaskOperations.format(sortedTasks, TaskOperations::formatTask));
    }
}
