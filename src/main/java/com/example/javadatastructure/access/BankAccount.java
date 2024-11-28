package com.example.javadatastructure.access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) balance += amount;
        else System.out.println("입금액이 올바르지 않습니다.");
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) balance -= amount;
        else System.out.println("출금액이 올바르지 않거나 잔액이 부족합니다.");
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
