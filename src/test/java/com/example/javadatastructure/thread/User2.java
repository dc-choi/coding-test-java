package com.example.javadatastructure.thread;

public class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        this.calculator.setMemory(100);
    }
}
