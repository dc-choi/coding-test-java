package com.example.javadatastructure.oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data);
        add(data);
        add(data);
    }

    private static void add(ValueData data) {
        data.value++;
        System.out.println("숫자 데이터 증가: " + data.value);
    }
}
