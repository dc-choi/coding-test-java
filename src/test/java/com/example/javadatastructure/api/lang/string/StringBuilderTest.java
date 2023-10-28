package com.example.javadatastructure.api.lang.string;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {
    /**
     * StringBuffer && StringBuilder
     *
     * String은 내부의 문자열을 수정할 수 없다.
     * replace()와 같은 메서드처럼 + 연산를 통해 문자열을 합치게 되면 새로운 문자열을 반환한다.
     *
     * 문자열을 결합하는 + 연산자를 많이 사용하면 그만큼 String 객체의 수가 늘어나기 때문에 프로그램이 느려진다.
     * 문자열을 변경하는 작업이 많을 경우에는 String을 사용하는 것보다 StringBuffer && StringBuilder를 사용하는게 좋다.
     * 두 클래스 모두 내부 버퍼에 문자열을 저장하고 그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 설계되어있다.
     * String처럼 새로운 객체를 만들지 않고도 문자열을 조작할 수 있는 것이다.
     *
     * StringBuffer와 StringBuilder의 사용방법은 동일하다.
     * 차이점은 StringBuffer는 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용되어 있어 스레드에 안전하다
     * StringBuilder는 단일 스레드 환경에서만 사용될 수 있도록 설계되어 있다.
     *
     * 여기서는 StringBuilder만 사용해본다.
     */
    @Test
    void testStringBuilder() {
        /**
         * 기본 버퍼의 크기는 16이다.
         * 하지만 버퍼의 크기가 동적으로 변하기 때문에 선언을 하지않아도 상관이 없다.
         */
        StringBuilder stringBuilder = new StringBuilder();

        /**
         * append()
         * 문자열 끝에 주어진 매개값 추가
         */
        stringBuilder.append("안녕하세요. ");
        stringBuilder.append("최동철입니다.");
        System.out.println(stringBuilder);

        /**
         * insert()
         * 문자열 중간에 주어진 매개값을 추가
         */
        stringBuilder.insert(7, "저는 ");
        System.out.println(stringBuilder);

        /**
         * delete()
         * 문자열의 일부분을 삭제
         */
        stringBuilder.delete(7, 10);
        System.out.println(stringBuilder);

        /**
         * deleteCharAt()
         * 문자열에서 주어진 인덱스의 문자를 삭제
         */
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);

        /**
         * replace()
         * 문자열의 일부분을 다른 문자열로 대치
         */
        stringBuilder.replace(5, 6, "!");
        System.out.println(stringBuilder);

        /**
         * setCharAt()
         * 문자열에서 주어진 인덱스의 문자를 다른 문자로 대치
         */
        stringBuilder.setCharAt(5, '.');
        System.out.println(stringBuilder);

        /**
         * reverse()
         * 문자열의 순서를 바꿈
         */
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
