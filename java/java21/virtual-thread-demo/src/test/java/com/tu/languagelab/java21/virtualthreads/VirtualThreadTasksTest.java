package com.tu.languagelab.java21.virtualthreads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class VirtualThreadTasksTest {
    @Test
    void createsOneVirtualThreadPerTaskAndReturnsStableOrder() throws Exception {
        List<TaskResult> results = VirtualThreadTasks.collectTaskResults(4);

        assertEquals(List.of(1, 2, 3, 4), results.stream().map(TaskResult::taskId).toList());
        assertTrue(results.stream().allMatch(TaskResult::virtualThread));
    }

    @Test
    void rejectsNonPositiveTaskCounts() {
        assertThrows(IllegalArgumentException.class, () -> VirtualThreadTasks.collectTaskResults(0));
    }
}
