package com.example.javadatastructure.thread;

public class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        this.calculator.setMemory(50);
    }
}
