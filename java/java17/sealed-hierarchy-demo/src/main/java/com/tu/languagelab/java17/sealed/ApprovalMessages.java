package com.tu.languagelab.java17.sealed;

public final class ApprovalMessages {
    private ApprovalMessages() {
    }

    public static String describe(ApprovalResult result) {
        // Sealed permits 清单将可用结果限制为两类，防止未知子类型绕过模型边界。
        if (result instanceof Approved) {
            return "approved";
        }
        return "rejected";
    }
}
