package com.tu.languagelab.java8.fundamentals.oop;

public final class ObjectOrientedBasicsDemo {
    private ObjectOrientedBasicsDemo() {
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ada", 1_000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.owner() + ":" + account.balanceCents());
    }
}
