package com.tu.languagelab.java8.fundamentals.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    @Test
    void protectsBalanceInvariant() {
        BankAccount account = new BankAccount("Ada", 1_000);
        account.deposit(500);
        account.withdraw(200);
        assertEquals(1_300, account.balanceCents());
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2_000));
    }
}
