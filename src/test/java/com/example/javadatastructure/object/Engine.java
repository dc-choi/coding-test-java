package com.example.javadatastructure.object;

public interface Engine {
    default void engine() {
        System.out.println("엔진이 가동됩니다.");
    }
}
