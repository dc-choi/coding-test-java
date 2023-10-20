package com.example.javadatastructure.object;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }

    public void print() {
        System.out.println("싱글톤 객체 생성 완료!");
    }
}
