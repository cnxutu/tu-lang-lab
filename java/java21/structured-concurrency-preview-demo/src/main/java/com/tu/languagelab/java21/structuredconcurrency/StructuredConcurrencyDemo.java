package com.tu.languagelab.java21.structuredconcurrency;

public final class StructuredConcurrencyDemo {
    private StructuredConcurrencyDemo() {
    }

    public static void main(String[] args) throws Exception {
        Dashboard dashboard = new DashboardLoader().load("u-100");
        System.out.println(dashboard.profile().userId() + ":" + dashboard.unreadNotifications());
    }
}
