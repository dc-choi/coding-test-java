package com.example.javadatastructure.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.value = 10;
        System.out.println("d.value = " + d.value);
        change(d); // Java는 참조형을 넘겨줄 때 주소값을 복사해서 넘겨준다.
        System.out.println("d.value = " + d.value);
    }

    public static void change(Data x) {
        x.value = 20;
    }
}
