package com.example.javadatastructure.grammar.api.lang.string;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest {
    @Test
    void string() {
        /**
         * String
         * 문자열을 관리하는 클래스
         *
         * 자바의 문자열은 java.lang.String 클래스의 인스턴스로 관리된다.
         * 소스상에서 문자열 리터럴은 String 객체로 자동 생성되지만, String 클래스의 다양한 생성자를 이용해서 직접 String 객체를 생성할 수 있다.
         */
        byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

        // byte[]를 매개변수로 받음.
        String str = new String(bytes);
        System.out.println(str);

        String str2 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(str2);
    }

    @Test
    void charAt() {
        /**
         * charAt()
         * 매개값으로 주어진 인덱스의 문자를 반환한다.
         */
        String str = "자바 프로그래밍";
        char c = str.charAt(0);
        System.out.println(c);
    }

    @Test
    void equals() {
        /**
         * equals()
         * 문자열의 값을 비교하기 위해서 사용하는 메서드
         */
        String str = "hello";
        System.out.println("hello".equals(str));
    }

    @Test
    void getBytes() {
        /**
         * getBytes()
         * 문자열을 바이트 배열로 변환하는 메서드
         * 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다.
         */
        byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
        String str = new String(bytes);

        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void indexOf() {
        /**
         * indexOf()
         * 매개값으로 주어진 문자열이 시작되는 인덱스를 반환한다.
         * 주어진 문자열이 없으면 -1을 반환한다.
         */
        String str = "hello";
        System.out.println(str.indexOf("h"));
        System.out.println(str.indexOf("a"));
    }

    @Test
    void replace() {
        /**
         * replace()
         * 첫 번째 매개값을 찾아서 두 번째 매개값으로 대치한 새로운 문자열을 생성하고 반환한다.
         *
         * String 객체의 문자열은 변경이 불가한 특성을 갖기 때문에 이 메서드가 반환하는 문자열은 새 문자열이다.
         */
        String oldstr = "1234";
        String newstr = oldstr.replace("1", "11");
        System.out.println(newstr);
    }

    @Test
    void substring() {
        /**
         * substring()
         * 주어진 인덱스에서 문자열을 추출한다.
         * 주어진 시작(포함)과 끝(제외) 인덱스를 지정해야한다.
         */
        String ssn = "960805-1111111";
        String first = ssn.substring(0, 6);
        String second = ssn.substring(7);
        System.out.println(first + "-" + second);
    }

    @Test
    void toCase() {
        /**
         * toLowerCase()
         * 모든 문자열을 소문자로 변경
         *
         * to UpperCase()
         * 모든 문자열을 대문자로 변경
         *
         * String 객체의 문자열은 변경이 불가한 특성을 갖기 때문에 위 두 메서드가 반환하는 문자열은 새 문자열이다.
         */
        String origin = "AbCdEfGh";
        String lower = origin.toLowerCase();
        String upper = origin.toUpperCase();

        System.out.println(lower);
        System.out.println(upper);
    }

    @Test
    void trim() {
        /**
         * trim()
         * 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 반환한다.
         *
         * String 객체의 문자열은 변경이 불가한 특성을 갖기 때문에 이 메서드가 반환하는 문자열은 새 문자열이다.
         */
        String origin = "            AbCdEfGh              ";
        String str = origin.trim();
        System.out.println(str);
    }

    @Test
    void valueOf() {
        /**
         * valueOf()
         * 기본 타입의 값을 문자열로 반환하는 메서드
         */
        String str = String.valueOf(10000);
        System.out.println(str);
    }

    @Test
    void split() {
        /**
         * split()
         * 문자열이 특정 구분자로 연결되어 있을 경우 구분자를 기준으로 부분 문자열을 분리하는 메서드
         *
         * 정규표현식이나 일반 문자열 사용가능
         */
        String str = "c,c,c,c!c,c,c#c,c,c,c,c,c.c";
        String str2 = "c c c c c c c c c c c c c";

        String regex = "[,.!#]";
        String regex2 = " ";
        
        for (String s : str.split(regex)) System.out.println(s);
        for (String ss : str2.split(regex2)) System.out.println(ss);
    }
}
