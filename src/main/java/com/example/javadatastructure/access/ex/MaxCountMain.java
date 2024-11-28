package com.example.javadatastructure.access.ex;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCount maxCount = new MaxCount(5);
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        System.out.println("count: " + maxCount.getCount());
    }
}
