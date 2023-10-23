package com.example.javadatastructure.object;

import org.junit.jupiter.api.Test;

public class InterfaceTest {
    @Test
    void interfaceTest() {
        // 이 코드가 가능한 이유는 다형성때문.
        Machine m = new Car();
        m.print();

        Engine e = new Car();
        e.engine();

        /**
         * 다형성
         * 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
         * 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 함.
         * JAVA는 다형성을 위해 부모 클래스 또는 인터페이스의 타입 변환을 허용한다.
         * 부모 타입에는 모든 자식 객체가 대입될 수 있고, 인터페이스 타입에는 모든 구현 객체가 대입될 수 있다.
         */
    }
}
