package com.example.javadatastructure.grammar.exception;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

public class ExceptionTest {
    @Test
    void test() {
        /**
         * Error와 Exception의 차이점
         *
         * Error: JVM 실행에 문제가 생겼다는 것. 개발자가 대처할 방법이 없는 오류
         * Exception: 사용자의 잘못된 조작 및 개발자의 잘못된 코딩으로 인해 발생하는 오류
         *
         * Exception의 종류
         * 1. Exception
         * 컴파일러 체크 예외라고도 부른다. 자바 소스를 컴파일하는 과정에서 예외 처리 코드가 필요한지 검사하기 때문이다.
         * 만약 예외 처리 코드가 없다면 컴파일 오류가 발생한다.
         *
         * 2. RunTime Exception
         * 컴파일하는 과정에서 체크하지 않는 예외이다. 마찬가지로 예외처리가 필요하다.
         * JAVA에서는 예외를 클래스로 관리한다.
         * JVM은 프로그램을 실행하는 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성한다.
         * 그러고나서 예외 처리 코드에서 예외 객체를 이용할 수 있도록 해준다.
         */
        Exception e = null; // 모든 예외객체는 Exception을 상속받는다.
    }

    /**
     * 자주 발생하는 실행 예외
     */
    @Test
    void runtimeException() {
        /**
         * 1. NullPointerException
         * 객체 참조가 없는 상태에서 객체에 접근하려고 했을 때 발생하는 예외
         */
        String data = null;
        // System.out.println(data.length()); // NullPointerException 발생

        /**
         * 2. ArrayIndexOutOfBoundsException
         * 배열에서 인덱스의 범위를 초과하여 사용할 때 발생하는 예외
         */
        int[] arr = new int[5];
        // arr[5] = 1; // ArrayIndexOutOfBoundsException 발생

        /**
         * 3. NumberFormatException
         * 숫자로 변환될 수 없는 경우 발생하는 예외
         */
        String data2 = "qwer";
        // int parseInt = Integer.parseInt(data2); // NumberFormatException 발생
    }

    @Test
    void autoResource() {
        /**
         * JAVA 1.7 부터 추가된 try-with-resources를 사용한다.
         * 사용하게 되면 예외 발생 여부와 상관없이 사용했던 리소스 객체의 close() 메서드를 호출해서 안전하게 리소스를 닫아준다.
         *
         * 리소스 객체란?
         * 각종 입출력 스트림, 서버 소켓, 소켓, 각종 채널
         */
        // 자동으로 close가 호출된다.
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            System.out.println("성공");
        } catch (Exception e) {
            System.out.println("실패");
        }
    }

    @Test
    void trycatch() {
        try {
            ErrorTest errorTest = new ErrorTest();
            errorTest.print();
        } catch (Exception e) {
            System.out.println(e); // java.lang.Exception: 예외발생
        }
    }

    @Test
    void trycatch2() {
        try {
            ErrorTest errorTest = new ErrorTest();
            errorTest.userExceptionTest();
        } catch (Exception e) {
            System.out.println(e); // com.example.javadatastructure.exception.UserException: 사용자 정의 예외 발생
            e.printStackTrace(); // 예외의 발생경로 추적
        }
    }
}
