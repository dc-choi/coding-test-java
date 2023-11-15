package com.example.javadatastructure.grammar.variable;

import org.junit.jupiter.api.Test;

public class Primitive {
    @Test
    void literal_integer() {
        /**
         * 정수 리터럴을 저장할 수 있는 타입
         * byte, char, short, int, long
         */
        int score = 10; // 10진수
        System.out.println(score);
        score = 0; // 10진수
        System.out.println(score);
        score = -100; // 10진수
        System.out.println(score);
        score = 02; // 8진수
        System.out.println(score);
        score = -04; // 8진수
        System.out.println(score);
        score = 0x5; // 16진수
        System.out.println(score);
        score = 0xA; // 16진수
        System.out.println(score);
        score = 0xB3; // 16진수
        System.out.println(score);
        score = 0xAC08; // 16진수
        System.out.println(score);
    }

    @Test
    void literal_realNumber() {
        double score = 0.25;
        System.out.println(score);
        score = -3.14;
        System.out.println(score);
        score = 5E7; // 5 X 10^7
        System.out.println(score);
        score = 0.12E-5; // 0.12 X 10^-5
        System.out.println(score);
    }

    @Test
    void literal_charset() {
        char charset = '\t'; // 이스케이프 문자
        System.out.println(charset);
        charset = '\n';
        System.out.println(charset);
        charset = '\\';
        System.out.println(charset);
    }

    @Test
    void literal_string() {
        String str = "대한민국";
        System.out.println(str);
        str = "탭만큼 이동 \t 합니다.";
        System.out.println(str);
        str = "한줄 내려 쓰기 \n 합니다.";
        System.out.println(str);
    }

    @Test
    void type_byte() {
        /**
         * byte 타입은 메모리 1byte를 차지한다.
         * 주로 색상 정보 및 파일 또는 이미지 등의 바이너리 데이터를 처리할 때 사용
         * 값의 범위: -128 ~ 127
         */
        byte bar = -128;
        System.out.println(bar);
        // bar = 128; // error
    }

    @Test
    void type_char() {
        /**
         * JAVA에서는 모든 문자를 유니코드로 처리한다. (0 ~ 65535의 2byte 크기를 지님)
         * char 타입은 메모리 2byte를 차지한다.
         * 유니코드는 음수가 없기 때문에 char에는 음수를 저장할 수 없다.
         */
        char charset = 'A';
        int parseCharset = charset;
        System.out.println(parseCharset);
        charset = 'B';
        parseCharset = charset;
        System.out.println(parseCharset);
        charset = '가';
        parseCharset = charset;
        System.out.println(parseCharset);
        charset = '각';
        parseCharset = charset;
        System.out.println(parseCharset);
    }

    @Test
    void type_short() {
        /**
         * short 타입은 메모리 2byte를 차지한다.
         * 값의 범위: -32768 ~ 32767
         * C언어와의 호환을 위해 사용되며 JAVA에서는 잘 사용하지 않는 타입이다.
         */
    }

    @Test
    void type_integer() {
        /**
         * int 타입은 메모리 4byte를 차지한다.
         * 값의 범위: -2147483648 ~ 2147483647
         *
         * JAVA에서는 정수 연산을 int로 변환된 후 처리하기 때문에
         * byte나 short로 변수 선언된 것을 연산하는 것과 int로 선언한 변수를 처리하는데 성능 차이가 거의 없다.
         */
        int num = 10;
        System.out.println(num);
        num = 012;
        System.out.println(num);
        num = 0x16;
        System.out.println(num);
    }

    @Test
    void type_long() {
        /**
         * long 타입은 메모리 8byte를 차지한다.
         * 값의 범위: -9223372036854775808 ~ 9223372036854775807
         * long 타입의 변수를 초기화 할 때에는 정수값 뒤에 소문자 l이나 대문자 L을 붙일 수 있다.
         */
        long ll = 10;
        System.out.println(ll);
        ll = 20l;
        System.out.println(ll);
        ll = 30L;
        System.out.println(ll);
        // ll = 10000000000; // error
        ll = 10000000000L;
        System.out.println(ll);
    }

    @Test
    void type_double() {
        /**
         * double 타입은 메모리 8byte를 차지한다.
         * 실수는 부동 소수점 방식으로 저장된다.
         *
         * 부동 소수점 방식은 실수를 다음과 같은 형태로 표현한다.
         * +     m   X  10^n
         * 부호  기수   10^지수
         *
         * 실 메모리 상에서는 다음과 같이 표현한다.
         * 부호 1bit + 지수 11bit + 기수 52bit
         */
        double dd = 3.14;
        System.out.println(dd);
        dd = 4.11;
        System.out.println(dd);
        dd = 5.19;
        System.out.println(dd);
        dd = 6.66;
        System.out.println(dd);
        dd = 7.77;
        System.out.println(dd);
    }

    @Test
    void promotion() {
        /**
         * 자동 타입 변환
         *
         * 프로그램 실행 도중에 자동적으로 타입 변환이 일어나는 것을 말한다.
         * 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생한다.
         */

        byte b = 1;
        int i = b;
        System.out.println(i);
    }

    @Test
    void casting() {
        /**
         * 강제 타입 변환
         *
         * 자동 타입 변환과 달리 강제적으로 타입 변환을 해주는 것을 말한다.
         * 큰 크기를 가지는 타입이 작은 타입으로 쪼개어서 저장하는 것이다.
         */

        long l = 1000;
        int i = (int) l;
        System.out.println(i);
    }
}
