package com.example.javadatastructure.grammar.thread;

public class Task implements Runnable {
    /**
     * run() 메서드에는 작업 스레드가 실행할 코드를 작성한다.
     */
    @Override
    public void run() {
        System.out.println("run");
    }
}
