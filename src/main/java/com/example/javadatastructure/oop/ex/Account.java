package com.example.javadatastructure.oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족.");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("잔고: " + balance);
    }
}
