package com.example.javadatastructure.ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // 기본형이라서 값이 복사된다.
        System.out.println("a = " + a + ", b = " + b);

        b = 20;
        System.out.println("a = " + a + ", b = " + b);

        a = 30;
        System.out.println("a = " + a + ", b = " + b);
    }
}
