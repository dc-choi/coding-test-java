package com.example.javadatastructure.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value = 10;
        Data b = a; // 참조형이라서 주소값을 복사한다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a.value = " + a.value + ", b.value = " + b.value);

        a.value = 20;
        System.out.println("a.value = " + a.value + ", b.value = " + b.value);
    }
}
