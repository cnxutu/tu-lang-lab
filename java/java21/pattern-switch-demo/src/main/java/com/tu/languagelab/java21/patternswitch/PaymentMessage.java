package com.tu.languagelab.java21.patternswitch;

public final class PaymentMessage {
    private PaymentMessage() {
    }

    public static String describe(PaymentResult result) {
        // switch 直接按运行时类型匹配；sealed 层级使编译器能检查分支是否穷尽。
        return switch (result) {
            case PaymentResult.Success success -> "paid:" + success.receiptId();
            case PaymentResult.Declined declined -> "declined:" + declined.reason();
            case PaymentResult.RetryableFailure failure -> "retry:" + failure.message();
        };
    }
}
