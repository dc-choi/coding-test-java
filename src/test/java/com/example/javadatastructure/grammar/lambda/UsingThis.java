package com.example.javadatastructure.grammar.lambda;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionalInterface myFunctionalInterface = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterField : " + UsingThis.this.outterField);

                System.out.println();

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField);
            };
            myFunctionalInterface.method();
        }
    }
}
