package com.tu.languagelab.java21.patternswitch;

public sealed interface PaymentResult permits PaymentResult.Success, PaymentResult.Declined, PaymentResult.RetryableFailure {
    record Success(String receiptId) implements PaymentResult {
    }

    record Declined(String reason) implements PaymentResult {
    }

    record RetryableFailure(String message) implements PaymentResult {
    }
}
