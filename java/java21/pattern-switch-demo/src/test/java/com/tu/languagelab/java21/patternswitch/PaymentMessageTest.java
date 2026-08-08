package com.tu.languagelab.java21.patternswitch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaymentMessageTest {
    @Test
    void mapsEveryKnownPaymentResult() {
        assertEquals("paid:R-100", PaymentMessage.describe(new PaymentResult.Success("R-100")));
        assertEquals("declined:insufficient-funds", PaymentMessage.describe(new PaymentResult.Declined("insufficient-funds")));
        assertEquals("retry:gateway-timeout", PaymentMessage.describe(new PaymentResult.RetryableFailure("gateway-timeout")));
    }
}
