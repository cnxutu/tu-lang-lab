package com.tu.languagelab.java25.scopedvalues;

import java.lang.ScopedValue;

public final class ScopedValues25 {
    static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();
    private ScopedValues25() { }
    public static String render(String requestId) throws Exception {
        // Java 25 中 Scoped Values 已稳定，动态作用域提供不可变请求上下文。
        return ScopedValue.where(REQUEST_ID, requestId).call(() -> "request=" + REQUEST_ID.get());
    }
    public static void main(String[] args) throws Exception { System.out.println(render("r-25")); }
}
