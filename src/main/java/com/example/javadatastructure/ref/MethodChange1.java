package com.example.javadatastructure.ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        change(a); // Java는 기본형을 넘겨줄 때 값을 복사해서 넘겨준다.
        System.out.println("a = " + a);
    }

    public static void change(int x) {
        x = 20;
    }
}
