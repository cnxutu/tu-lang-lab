package com.tu.languagelab.java8.fundamentals.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用同一组数据对照 List、Set、Map 的职责，帮助初学者先建立集合选择依据。
 */
public final class CollectionCatalog {
    private CollectionCatalog() {
    }

    public static String summarize() {
        List<String> ordered = new ArrayList<String>(Arrays.asList("java", "python", "java"));
        Set<String> unique = new HashSet<String>(ordered);
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String language : ordered) {
            counts.put(language, counts.containsKey(language) ? counts.get(language) + 1 : 1);
        }
        // List 保顺序，Set 去重，Map 建立键值索引；先根据问题选择集合，而非死记类型名。
        return ordered.size() + ":" + unique.size() + ":" + counts.get("java");
    }
}
