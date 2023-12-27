package com.example.javadatastructure.grammar.lambda;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 20;

        // 컴파일 오류 발생
        // arg = 1;
        // localVar = 200;

        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println(arg);
            System.out.println(localVar);
        };
        myFunctionalInterface.method();
    }
}
