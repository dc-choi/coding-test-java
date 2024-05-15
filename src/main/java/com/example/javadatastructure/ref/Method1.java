package com.example.javadatastructure.ref;

public class Method1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setting("홍길동", 20, 80);

        Student s2 = new Student();
        s2.setting("김길동", 30, 90);

        s.print();
        s2.print();
    }
}
