package com.example.javadatastructure.grammar.object;

public interface Engine {
    default void engine() {
        System.out.println("엔진이 가동됩니다.");
    }
}
