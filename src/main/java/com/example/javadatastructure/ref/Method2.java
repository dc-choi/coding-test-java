package com.example.javadatastructure.ref;

public class Method2 {
    public static void main(String[] args) {
        Student s = create("홍길동", 20, 80);
        Student s2 = create("김길동", 30, 90);

        s.print();
        s2.print();
    }

    static Student create(String name, int age, int grade) {
        Student s = new Student();
        s.setting(name, age, grade);
        return s;
    }
}
