package com.example.javadatastructure.variable;

import org.junit.jupiter.api.Test;

/**
 * 참조 타입
 *
 * 기본 타입과 다르게 참조 타입인 변수는 메모리의 번지를 주소로 가진다.
 * 번지를 통해 객체를 참조한다는 뜻에서 참조타입이라고 불린다.
 *
 * 배열, 열거, 클래스, 인터페이스 타입을 의미한다.
 */
public class Reference {
    @Test
    void stack_heap() {
        int age = 28; // stack에 선언됨.
        String name = "최동철"; // stack에 메모리 주소가 있고 heap에 실제 값이 있음.
    }

    @Test
    void memory() {
        /**
         * JVM
         *
         * 1. 메서드 영역
         * 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 런타임 상수풀, 필드 데이터, 메서드 데이터, 메서드 코드, 생성자 코드등을 분류해서 저장한다.
         *
         * 2. 힙 영역
         * 객체와 배열이 생성되는 영역이다.
         * 힙 영역에 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
         *
         * 참조하는 변수나 필드가 없다면 의미없는 객체가 되기 때문에 이것을 쓰레기로 취급하고 쓰레기 객체를 힙 영역에서 자동으로 제거한다.
         * 이것을 Garbage Collector라고 부른다.
         *
         * 개발자는 객체를 제거하기 위해 별도의 코드를 작성할 필요가 없으며 코드로 객체를 제거할 방법 자체를 제공하지 않는다.
         *
         * 3. 스택 영역
         * 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당된다.
         * 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로 스택도 하나다.
         *
         * 스택은 메서드를 호출할 때마다 프레임을 push하고 메서드가 종료되면 해당 프레임을 pop하는 동작을 수행한다.
         * 예외 발생시 printStackTrace() 메서드로 보여주는 Stack Trace의 각 라인은 하나의 프레임을 표현한다.
         *
         * 프레임 내부에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 push되거나 pop된다.
         * 변수가 이 영역에 생성되는 시점은 초기화가 될 때, 즉 최초로 변수에 값이 저장될 때 이다.
         * 변수는 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거된다.
         */
        char v1 = 'a'; // 스택에 v1 변수가 push

        // if 블록이 시작
        if (v1 == 'a') {
            int v2 = 100; // 스택에 push
            double v3 = 3.14; // 스택에 push
        } // 블록을 벗어나는 시점에서 v2, v3변수가 pop

        boolean v4 = true; // 스택에 v4 변수가 push

        // scores 변수는 스택에 값의 주소가 있고 힙에 실제 값이 있다.
        int[] scores = { 10, 20, 30 };
    }

    @Test
    void reference_equals() {
        /**
         * 기본 타입 변수의 ==, != 연산은 변수의 값이 같은지, 아닌지를 조사함.
         * 참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용된다.
         *
         * 참조 타입 변수의 값을 힙 영역의 객체 주소이므로 결국 주소 값을 비교하는 것이 된다.
         * 동일한 주소 값을 갖고 있다는 것은 동일한 객체를 참조한다는 의미이다.
         */
        String name1 = "최동철";
        String name2 = name1;
        String name3 = "donchoi";

        // 주소값을 비교하는 중...
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false
    }

    @Test
    void reference_null() {
        /**
         * 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있다.
         * null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
         */
        String v1 = "최동철";
        String v2 = null;

        System.out.println(v1 == null); // false
        System.out.println(v2 == null); // true

        /**
         * 예외: 프로그램 실행 도중에 발생하는 오류
         *
         * 예외는 사용자의 잘못된 입력으로도 발생할 수 있고, 프로그래머가 코드를 잘못 작성해서 발생할 수도 있다.
         * 참조 타입을 사용하게 되면 가장 많이 발생하는 예외가 NullPointerException이다.
         *
         * 참조 타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다.
         * 참조 타입 변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데, 참조할 객체가 없으므로 사용할 수가 없는 것이다.
         * 그러나 프로그래머의 실수로 null값을 가지고 있는 참조 타입 변수를 사용하면 NullPointerException이 발생한다.
         */
        int[] arr = null;
        // arr[0] = 10; // NullPointerException 발생

        String name = null;
        // System.out.println(name.length()); // NullPointerException 발생
    }
}
