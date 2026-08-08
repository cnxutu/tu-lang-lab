package com.tu.languagelab.java21.structuredconcurrency;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DashboardLoaderTest {
    @Test
    void joinsRelatedTasksIntoOneResult() throws Exception {
        Dashboard dashboard = new DashboardLoader().load("u-100");

        assertEquals(new Profile("u-100", "standard"), dashboard.profile());
        assertEquals(3, dashboard.unreadNotifications());
    }
}
