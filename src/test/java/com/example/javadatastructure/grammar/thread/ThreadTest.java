package com.example.javadatastructure.grammar.thread;

import org.junit.jupiter.api.Test;

import java.awt.*;

/**
 * 프로세스: 운영체제에서 메모리를 할당받아 실행중인 프로그램
 *
 * 멀티 태스킹: 두가지 이상의 작업을 동시에 처리하는 것
 * 운영체제는 멀티 태스킹을 할 수 있도록 CPU 및 메모리 자원을 프로세스마다 적절히 할당해주고, 병렬로 실행시킨다.
 * 멀티 태스킹이 꼭 멀티 프로세스를 뜻하지는 않는다. 한 프로세스 내에서 멀티 태스킹을 할 수 있는 프로세스도 있다.
 *
 * 스레드: 하나의 코드 실행 흐름으로 프로세스 안에서 생긴다.
 * 기본적으로 한 프로세스에는 하나의 스레드를 가진다.
 * 한 프로세스 내에 스레드가 두개라면 두개의 코드 실행 흐름이 생긴다는 의미이다.
 *
 * 멀티 프로세스는 프로그램 단위의 멀티 태스킹이라면 멀티 스레드는 프로그램 내부에서의 멀티 태스킹이다.
 *
 * 멀티 프로세스는 운영체제에서 할당받은 자신의 메모리를 가지고 실행하기 때문에 서로 독립적이다.
 * 따라서 하나의 프로세스에서 오류가 발생해도 다른 프로세스에게 영향을 미치지 않는다.
 *
 * 하지만 멀티 스레드는 하나의 프로세스 내부에 생성되기 때문에 하나의 스레드가 예외를 발생시키면 프로세스 자체가 종료될 수 있다.
 * 그래서 멀티 스레드를 사용할 때에는 예외처리를 잘 해야한다.
 *
 * 멀티 스레드는 다양한 곳에서 사용된다. 대용량 데이터의 처리 시간을 줄이기 위해 데이터를 분할해서 병렬로 처리하는 곳에서 사용한다.
 * 또, 네트워크 통신을 하기 위해서 사용되기도 하고, 다수의 요청을 처리하는 서버를 개발할 때에도 사요된다.
 */
public class ThreadTest {
    /**
     * 메인 스레드
     * 모든 자바 프로그램은 메인 스레드가 main() 메서드를 실행하면서 시작된다.
     * 메인 스레드는 main() 메서드의 첫 코드부터 아래로 순차적으로 실행하고,
     * main() 메서드의 마지막 코드를 실행하거나 return을 만나면 실행이 종료된다.
     *
     * 메인 스레드는 필요에 따라 작업 스레드들을 만들어서 병렬로 코드를 실행할 수 있다.
     * 즉 멀티 스레드를 생성해서 멀티 태스킹을 수행한다.
     *
     * 싱글 스레드 프로그램에서는 메인 스레드가 종료하면 프로세스도 종료된다.
     * 하지만 멀티 스레드 프로그램에서는 실행 중인 스레드가 하나라도 있다면, 프로세스는 종료되지 않는다.
     * 메인 스레드가 작업 스레드가 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면 프로세스는 종료되지 않는다.
     */
    // public static void main(String[] args) {}

    @Test
    void threadTest() {
        /**
         * 자바에서는 작업 스레드도 객체로 생성된다.
         * Thread 클래스를 직접 객체화해서 생성해도 되지만, Thread를 상속해서 하위 클래스를 만들 수도 있다.
         * Thread 클래스로 작업 스레드 객체를 직접 생성하려면 Runnable을 매개값으로 갖는 생성자를 호출해야 한다.
         */
        Thread thread = new Thread(new Task());
        thread.start();

        Runnable runnable = new Task();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // 익명 객체를 매개값으로 사용할 수 있다.
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        });
        thread3.start();

        // 람다식을 사용해서 스레드를 사용할 수 있다.
        // Runnable이 함수적 인터페이스이기 때문이다.
        Thread thread4 = new Thread(() -> System.out.println("run"));
        thread4.start(); // run() 메서드를 실행한다.
    }

    @Test
    void threadTest2() {
        /**
         * 0.5초 주기로 beep음을 발생시키면서 동시에 프린팅을 하는 작업이 있다고 가정을 한다.
         * beep음과 프린팅은 서로 다른 작업이므로 메인 스레드가 동시에 두 가지 작업을 처리할 수 없다.
         * 멀티스레드를 사용하지 않는다면, 메인 스레드는 beep음을 모두 발생한 다음, 프린팅을 시작한다.
         */
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

    @Test
    void threadTest3() {
        /**
         * 실행할 작업을 Runnable로 만들지 않고 Thread의 하위 클래스로 정의하면서 작업내용을 추가할 수 있다.
         * Thread 클래스르 상속한 후 run 메서드를 overriding해서 스레드가 실행할 코드를 작성하면 된다.
         */

        Thread thread = new WorkerThread();
        thread.start();

        // 익명 자식 객체로 직접 작업 스레드 객체를 생성할 수 있다.
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        thread2.start();
    }

    @Test
    void threadName() {
        /**
         * thread는 자신의 이름을 가진다. 디버깅시 어떤 스레드가 어떤 작업을 하는지 확인하기 위해 사용한다.
         * 메인 스레드는 main이라는 이름을 가진다.
         * 우리가 직접 생성한 스레드는 자동적으로 Thread-n이라는 이름으로 설정된다.
         */
        // 현재 실행되는 스레드 객체 얻기 (현재 스레드의 참조를 얻는다.)
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        Thread aa = new Thread(() -> {
            System.out.println("aa");
        });
        aa.setName("aa");
        aa.start();
    }

    @Test
    void scheduled() {
        /**
         * 멀티 스레드는 동시성 또는 병렬성으로 실행된다.
         *
         * 동시성: 하나의 코어에서 멀티 스레드가 번갈아가며 실행하는 것
         * 병렬성: 멀티 코어에서 개별 스레드를 동시에 실행하는 것
         *
         * 스레드의 개수가 코어의 수보다 많을 경우, 스레드를 어떤 순서에 의해 동시성으로 실행할 것인가를 결정해야 한다.
         * 이것을 스레드 스케줄링이라고 한다.
         * 스레드 스케줄링에 의해 스레드들은 아주 짧은 시간에 번갈아가면서 그들의 run() 메서드를 실행한다.
         *
         * JAVA의 스레드 스케줄링은 우선순위(priority) 방식과 순환 할당(Round-Robin) 방식을 사용한다.
         *
         * 우선순위 방식
         * 우선순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링하는 것
         * 우선순위 번호를 부여할 수 있기 때문에 개발자가 코드로 제어할 수 있다.
         * 단, 코어가 여러개일 경우 여러개의 스레드가 병렬성으로 실행될 수 있다.
         * 그렇기에 멀티 코어의 경우 우선순위 방식이 크게 영향을 주지 않는다.
         *
         * 순환 할당 방식
         * 시간 할당량을 정해서 하나의 스레드를 정해진 시간만큼 실행하고 다시 다른 스레드를 실행하는 방식
         * JVM에 의해서 정해지기 때문에 코드로 제어할 수 없다.
         */
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 2000000000; i++) {}
            System.out.println("run10");
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000000000; i++) {}
            System.out.println("run5");
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 2000000000; i++) {}
            System.out.println("run1");
        });

        // 1 ~ 10까지 우선순위를 부여함.
        // 10이 가장 높고 1이 가장 낮다. 가독성을 위해 상수를 사용
        thread.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread2.start();
        thread3.start();
    }

    @Test
    void shareMemory() {
        /**
         * 싱글 스레드 프로그램에서는 한개의 스레드가 객체를 독차지해서 사용하면 되지만,
         * 멀티 스레드 프로그램에서는 스레드들이 객체를 공유해서 작업해야 하는 경우가 있다.
         * 이 경우, 스레드 A를 사용하던 객체가 스레드 B에 의해 상태가 변경될 수 있기 때문에
         * 스레드 A가 의도했던 것과는 다른 결과를 산출할 수도 있다.
         *
         * 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 스레드 작업이 끝날 때까지 객체에 잠금을 걸어서 다른 스레드가 사용할 수 없도록 해야한다.
         * 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역을 임계 영역(critical section)이라고 한다.
         * 자바는 임계 영역을 지정하기 위해 동기화(synchronized) 메서드와 동기화 블록을 제공한다.
         * 스레드가 객체 내부의 동기화 메서드 또는 블록에 들어가면 즉시 객체에 잠금을 걸어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 한다.
         */
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);

        User2 user2 = new User2();
        user2.setCalculator(calculator);

        user1.start();
        user2.start();
    }

    @Test
    void threadStatus() {
        /**
         * 스레드 객체를 생성하고, start() 메서드를 호출하면 곧바로 스레드가 실행되는 것처럼 보이지만 사실은 실행 대기 상태가 된다.
         * 실행 대기 상태란 아직 스케줄링이 되지 않아서 실행을 가디라고 있는 상태를 말한다.
         * 실행 대기 상태에 있는 스레드 중에서 스레드 스케줄링으로 선택된 스레드가 CPU를 점유하고 run() 메서드를 실행한다.
         * 이때를 실행 상태라고 한다.
         *
         * 실행 상태의 스레드는 run() 메서드를 모두 실행하기 전에 스레드 스케줄링에 의해 다시 실행 대기 상태로 돌아갈 수 있다.
         * 그리고 실행 대기 상태에 있는 다른 스레드가 선택되어 실행상태가 된다.
         * 이렇게 스레드는 실행 대기 상태를 번갈아가면서 자신의 run() 메서드를 조금씩 실행한다.
         * 실행 상태에서 run() 메서드가 종료되면, 더 이상 실행할 코드가 없기 때문에 스레드의 실행은 멈추게 된다.
         * 이 상태를 종료 상태라고 한다.
         *
         * 경우에 따라서 스레드는 실행 상태에서 실행 대기 상태로 가지 않을 수도 있다.
         * 실행 상태에서 일시 정지 상태로 가기도 하는데 일시 정지 상태는 스레드가 실행할 수 없는 상태이다.
         * 일시 정지 상태는 WAITING, TIMED_WAITING, BLOCKED가 있는데 일시 정지 상태가 되는 이유는 나중에 설명한다.
         * 스레드가 다시 실행 상태로 가기 위해서는 일시 정지 상태에서 실행 대기 상태로 가야 한다는 것만 알아두자.
         *
         * 이러한 스레드의 상태를 코드에서 확인할 수 있도록 하기 위해 getState() 메서드가 있다.
         * getState() 메서드는 다음 표처럼 스레드 상태에 따라서 Thread.State라는 열거 상수를 리턴한다.
         */
        StartPrintThread startPrintThread = new StartPrintThread(new TargetThread());
        startPrintThread.start();
    }
}
