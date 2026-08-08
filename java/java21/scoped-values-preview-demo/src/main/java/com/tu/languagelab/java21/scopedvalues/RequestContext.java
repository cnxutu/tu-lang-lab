package com.tu.languagelab.java21.scopedvalues;

import java.lang.ScopedValue;

public final class RequestContext {
    public static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();

    private RequestContext() {
    }

    public static String currentRequestId() {
        // ScopedValue 由动态作用域提供只读上下文，避免通过 ThreadLocal 到处传参。
        return REQUEST_ID.get();
    }
}
