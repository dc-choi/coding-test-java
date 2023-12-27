package com.example.javadatastructure.grammar.lambda;

import org.junit.jupiter.api.Test;

public class LambdaTest {
    /**
     * 최근 함수형 프로그래밍이 다시 부각되고 있는데, 병렬처리와 이벤트 지향 프로그래밍에 적합하기 때문이다.
     * Java도 함수적 프로그래밍을 위해 8버전부터 람다식을 지원하면서 기존의 코드 패턴이 많이 달라졌다.
     *
     * 람다식은 익명 함수를 생성하기 위한 식으로 객체 지향 언어보다는 함수 지향 언어에 가깝다.
     * 람다식을 사용하게 되면 코드가 매우 간결해지고 컬렉션의 요소를 필터링하거나 매핑해서 원하느 결과를 쉽게 집계할 수 있기 때문이다.
     * 람다식의 형태는 매개 변수를 가진 코드 블록이지만 런타임시에는 익명 구현 객체를 생성한다.
     */

    @Test
    void test() {
        /**
         * 실제로 익명 객체처럼 사용하는 모습.
         */
        Runnable runnable = () -> {
            System.out.println("하이");
        };
        runnable.run();
    }
    
    @Test
    void targetType() {
        /**
         * 람다식의 형태는 매개 변수를 가진 코드 블록이기 때문에 마치 자바의 메서드를 선언하는 것처럼 보여진다.
         * 자바는 메서드를 단독으로 선언할 수 없고 항상 클래스의 구성 멤버로 선언하기 때문에
         * 람다식은 단순히 메서드를 선언하는 것이 아니라 이 메서드를 가지고 잇는 객체를 생성해 낸다.
         * 
         * 람다식은 인터페이스 변수에 대입된다. 이 말은 람다식은 인터페이스의 익명 구현 객체를 생성한다는 뜻이 된다.
         * 인터페이스는 직접 객체화할 수 없기 때문에 구현 클래스가 필요한데, 람다식은 익명 구현 클래스를 생성하고 객체화한다.
         * 람디식은 대입될 인터페이스의 종류에 따라 작성 방법이 달라지기 때문에 람다식이 대입될 인터페이스를 타겟 타입이라고 한다.
         *
         * 모든 인터페이스를 람다식의 타켓 타입으로 사용할 수 없다.
         * 람다식이 하나의 메서드를 정의하기 때문에 두 개 이상의 추상 메서드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.
         * 하나의 추상 메서드가 선언된 인터페이스만이 람다식의 타켓 타입이 될 수 있는데, 이러한 인터페이스를 함수적 인터페이스라고 한다.
         *
         * 함수적 인터페이스를 작성할 때 두 개 이상의 추상 메서드가 선언되지 않도록 컴파일러가 체킹해주는 기능이 있는데,
         * 인터페이스 선언시 @FunctionalInterface 어노테이션을 붙이면 된다.
         * 이 어노테이션은 두 개 이상의 추상 메서드가 선언되면 컴파일 오류를 발생시킨다.
         */
        // 매개 변수와 리턴값이 없는 람다식
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hi");
        myFunctionalInterface.method();

        // 매개변수가 있는 람다식
        // (int x) -> System.out.println(x) 다음과 같은 형태이다.
        MyFunctionalInterface2 myFunctionalInterface2 = System.out::println;
        myFunctionalInterface2.method(10);

        // 리턴값이 있는 람다식
        // (int x, int y, int z) -> { return x + y + z; }; 다음과 같은 형태이다.
        MyFunctionalInterface3 myFunctionalInterface3 = (int x, int y, int z) -> x + y + z;
        myFunctionalInterface3.method(1, 2, 3);
    }

    @Test
    void localValue() {
        /**
         * 람다식의 실행 블록에는 클래스의 멤버 및 로컬 변수를 사용할 수 있다.
         * 클래스의 멤버는 제약 사항 없이 사용 가능하지만, 로컬 변수는 제약 사항이 따른다.
         */

        /**
         * 클래스의 멤버 사용
         * 람다식 실행 블록에는 클래스의 멤버인 필드와 메서드를 제약사항 없이 사용할 수 있다.
         * 하지만 this 키워드를 사용할 때에는 주의가 필요하다.
         * 일반적으로 익명 객체 내부에서 this는 익명 객체의 참조이지만 람다식에서는 this는 내부적으로 생성되는 람다식을 실행하는 객체의 참조이다.
         */
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
        System.out.println();

        /**
         * 로컬 변수 사용
         * 람다식은 메서드 내부에서 주로 작성되기 때문에 로컬 익명 구현 객체를 생성시킨다고 봐야 한다.
         * 람디식에서 바깥 클래스의 필드나 메서드는 제한 없이 사용할 수 있으나
         * 메서드의 매개 변수 또는 로컬 변수를 사용하면 이 두 변수는 final 특성을 가져야 한다.
         */
        UsingLocalVariable usingLocalVariable = new UsingLocalVariable();
        usingLocalVariable.method(10);
    }
}
