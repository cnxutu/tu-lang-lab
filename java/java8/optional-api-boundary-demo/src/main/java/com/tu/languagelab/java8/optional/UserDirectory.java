package com.tu.languagelab.java8.optional;
import java.util.Map;
import java.util.Optional;
public final class UserDirectory {
    private final Map<String, String> displayNames;
    public UserDirectory(Map<String, String> displayNames) { this.displayNames = displayNames; }
    public Optional<String> findDisplayName(String userId) {
        // Optional 只在返回边界表达“可能不存在”，调用方必须显式决定缺失策略。
        return Optional.ofNullable(displayNames.get(userId));
    }
}
