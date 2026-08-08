package com.tu.languagelab.java17.pattern;

public final class AmountExtractor {
    private AmountExtractor() {
    }

    public static int extract(Object value) {
        // 模式变量只在类型检查成功的分支有效，消除重复强转并缩小变量作用域。
        if (value instanceof Integer amount) {
            return amount;
        }
        return 0;
    }
}
