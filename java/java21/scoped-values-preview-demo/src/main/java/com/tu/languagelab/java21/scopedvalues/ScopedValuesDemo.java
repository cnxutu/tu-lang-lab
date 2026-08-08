package com.tu.languagelab.java21.scopedvalues;

public final class ScopedValuesDemo {
    private ScopedValuesDemo() {
    }

    public static String render(String requestId) throws Exception {
        return ScopedValue.where(RequestContext.REQUEST_ID, requestId)
                .call(() -> "request=" + RequestContext.currentRequestId());
    }

    public static void main(String[] args) throws Exception {
        System.out.println(render("r-21"));
    }
}
