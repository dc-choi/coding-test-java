package com.example.javadatastructure.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("BigData.data: " + bigData.data);
        System.out.println("BigData.count: " + bigData.count);

        // NullPointerException
        // System.out.println("BigData.data.value: " + bigData.data.value);

        bigData.data = new Data();
        System.out.println("BigData.data.value: " + bigData.data.value);
    }
}
