package com.example.javadatastructure.access.ex;

public class MaxCount {
    private int count;
    private int max;

    public MaxCount(int max) {
        count = 0;
        this.max = max;
    }

    public void increment() {
        if (isMaxed()) count++;
        else System.out.println("최대 값을 넘길 수 없습니다.");
    }

    public int getCount() {
        return count;
    }

    private boolean isMaxed() {
        return count < max;
    }
}
