package com.tu.languagelab.java8.fundamentals.oop;

/**
 * 用封装保护账户余额不变量：调用者只能通过存取款操作改变状态。
 * 这个模型对应初学 Java 时“对象负责自己的行为”的核心背景。
 */
public final class BankAccount {
    private final String owner;
    private long cents;

    public BankAccount(String owner, long openingCents) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("owner must not be blank");
        }
        if (openingCents < 0) {
            throw new IllegalArgumentException("opening balance must not be negative");
        }
        this.owner = owner;
        this.cents = openingCents;
    }

    public void deposit(long amountCents) {
        if (amountCents <= 0) {
            throw new IllegalArgumentException("deposit must be positive");
        }
        cents += amountCents;
    }

    public void withdraw(long amountCents) {
        if (amountCents <= 0 || amountCents > cents) {
            throw new IllegalArgumentException("withdraw amount is invalid");
        }
        cents -= amountCents;
    }

    public String owner() {
        return owner;
    }

    public long balanceCents() {
        // 状态只能通过受约束的方法变化，这就是封装保护不变量的价值。
        return cents;
    }
}
