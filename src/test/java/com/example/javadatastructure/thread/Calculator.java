package com.example.javadatastructure.thread;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    /**
     * 메서드 전체내용을 임계영역으로 만든다.
     * @param memory
     */
    public synchronized void setMemory(int memory) {
        // 일부 영역만 블록으로 임계 영역으로 지정할 수 있다.
        // synchronized () {}
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("에러");
        }

        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
