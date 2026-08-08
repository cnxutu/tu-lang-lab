package com.tu.languagelab.java21.patternswitch;

public final class PatternSwitchDemo {
    private PatternSwitchDemo() {
    }

    public static void main(String[] args) {
        System.out.println(PaymentMessage.describe(new PaymentResult.Success("R-100")));
        System.out.println(PaymentMessage.describe(new PaymentResult.RetryableFailure("gateway-timeout")));
    }
}
