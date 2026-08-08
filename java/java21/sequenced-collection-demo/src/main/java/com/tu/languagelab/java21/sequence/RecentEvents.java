package com.tu.languagelab.java21.sequence;

import java.util.ArrayList;
import java.util.List;

public final class RecentEvents {
    private RecentEvents() {
    }

    public static List<String> latestFirst(List<String> events) {
        // reversed 返回顺序视图，避免手写索引倒序循环。
        return new ArrayList<>(events.reversed());
    }
}
