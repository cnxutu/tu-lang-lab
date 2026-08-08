package com.tu.languagelab.java8.time;

import java.time.Duration;
import java.time.ZonedDateTime;

public final class DeliveryWindow {
    private DeliveryWindow() {
    }

    public static long minutesBetween(ZonedDateTime start, ZonedDateTime end) {
        // ZonedDateTime 保留时区规则，避免以本地字符串计算跨时区时长。
        return Duration.between(start, end).toMinutes();
    }
}
