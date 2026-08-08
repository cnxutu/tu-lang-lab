package com.tu.languagelab.java21.structuredconcurrency;

import java.util.concurrent.StructuredTaskScope;

public final class DashboardLoader {
    public Dashboard load(String userId) throws Exception {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            // 子任务与当前请求拥有共同作用域；其中一个失败时其余任务会被取消。
            var profile = scope.fork(() -> new Profile(userId, "standard"));
            var notifications = scope.fork(() -> 3);
            scope.join().throwIfFailed();
            return new Dashboard(profile.get(), notifications.get());
        }
    }
}
