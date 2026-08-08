package com.tu.languagelab.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public final class TaskOperations {
    private TaskOperations() {
    }

    public static List<Task> sortByName(List<Task> tasks) {
        List<Task> sortedTasks = new ArrayList<Task>(tasks);
        Collections.sort(sortedTasks, Comparator.comparing(Task::getName));
        return sortedTasks;
    }

    public static List<Task> filter(List<Task> tasks, Predicate<Task> rule) {
        List<Task> selectedTasks = new ArrayList<Task>();
        for (Task task : tasks) {
            if (rule.test(task)) {
                selectedTasks.add(task);
            }
        }
        return selectedTasks;
    }

    public static List<String> format(List<Task> tasks, Function<Task, String> formatter) {
        List<String> formattedTasks = new ArrayList<String>();
        for (Task task : tasks) {
            formattedTasks.add(formatter.apply(task));
        }
        return formattedTasks;
    }

    public static String formatTask(Task task) {
        return task.getName() + " (priority=" + task.getPriority() + ")";
    }
}
