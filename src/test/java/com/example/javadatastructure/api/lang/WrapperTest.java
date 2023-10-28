package com.example.javadatastructure.api.lang;

import org.junit.jupiter.api.Test;

public class WrapperTest {
    /**
     * Wrapper
     * 기본 타입의 값을 갖는 객체를 생성할 수 있다.
     * 이런 객체를 Wrapper 객체라고 한다.
     * 기본 타입의 값을 내부에 두고 포장하기 때문이다.
     *
     * 다음 값들이 Wrapper 클래스라고 불린다.
     * Byte, Character, Short, Integer, Long, Float, Double, Boolean
     */

    @Test
    void boxAndUnBox() {
        /**
         * Boxing
         * 기본 티입의 값을 포장 객체로 만드는 과정
         *
         * Unboxing
         * 포장 객체에서 기본 타입의 값을 얻어내는 과정
         *
         * 자동으로 박싱되고 언박싱된다.
         */
        Byte b = 10;
        Character c = '가';
        Short s = 100;
        Integer i = 1000;
        Long l = 10000L;
        Float f = 3.14F;
        Double d = 3.14;
        Boolean bool = true;
    }

    @Test
    void equals() {
        /**
         * Wrapper 객체도 객체이기 때문에 equals()로 비교 연산을 해야한다.
         * 다만, boolean, char의 경우 ==으로 연산이 가능하다.
         * byte, short, int의 경우 -128 ~ 127까지는 참으로 나온다.
         */
        Integer i = 1;
        Integer i2 = 1;
        System.out.println(i == i2); // true
        System.out.println(i.equals(i2)); // true

        Integer i3 = 300;
        Integer i4 = 300;
        System.out.println(i3 == i4); // false
        System.out.println(i3.equals(i4)); // true
    }
}
