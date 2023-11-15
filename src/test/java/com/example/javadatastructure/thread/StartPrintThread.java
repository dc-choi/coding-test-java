package com.example.javadatastructure.thread;

public class StartPrintThread extends Thread {
    private Thread targetThread;

    public StartPrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true) {
            State state = targetThread.getState();
            System.out.println("타켓 스레드 상태: " + state);

            if (state == State.NEW) targetThread.start();

            if (state == State.TERMINATED) break;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
