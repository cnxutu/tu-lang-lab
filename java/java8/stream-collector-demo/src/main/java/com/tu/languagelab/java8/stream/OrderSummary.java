package com.tu.languagelab.java8.stream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/** 订单汇总结果，帮助把 Stream 的收集结果与实际报表问题对应起来。 */
public final class OrderSummary {
    private OrderSummary() { }
    public static Map<String, Long> countByCategory(List<String> categories) {
        // Collector 把“按键分组并计数”的意图声明出来，不需要手写可变 Map 循环。
        return categories.stream().collect(Collectors.groupingBy(category -> category, Collectors.counting()));
    }
}
