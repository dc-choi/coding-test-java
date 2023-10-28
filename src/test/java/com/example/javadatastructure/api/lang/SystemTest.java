package com.example.javadatastructure.api.lang;

import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.Set;

public class SystemTest {
    /**
     * JAVA는 운영체제상에서 바로 실행되지 않고 JVM에서 실행되기에 운영체제의 모든 기능을 코드로 직접 접근이 어렵다.
     * 하지만 java.lang.System 클래스를 사용하면 운영체제의 일부 기능을 이용할 수 있다.
     *
     * 다음 기능을 사용할 수 있다.
     * 프로그램 종료, 키보드 입력, 모니터 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기
     */

    @Test
    void programExit() {
        /**
         * exit()
         * 강제적으로 JVM을 종료할 경우 이 메서드를 호출한다.
         */
        System.exit(0);
    }

    @Test
    void gcTest() {
        /**
         * gc()
         * 개발자가 gc에게 쓰레기를 빠르게 처리해달라고 하는 메서드
         * 쓰레기가 생길 때마다 gc가 쓰레기처리를 한다면 수행할 프로그램의 속도가 느려질 수 있다.
         * 그리고 메모리가 충분하다면 굳이 실행할 필요가 없다.
         */
        System.gc();
    }

    @Test
    void timeTest() {
        /**
         * 현재 시간
         * 컴퓨터의 시간으로부터 현재 시간을 읽는다.
         */
        System.out.println(System.currentTimeMillis()); // 밀리초
        System.out.println(System.nanoTime()); // 나노초
    }

    @Test
    void property() {
        /**
         * JVM이 시작할 때 자동 설정되는 시스템의 속성값
         */

        String version = System.getProperty("java.version");
        String home = System.getProperty("java.home");
        String os = System.getProperty("os.name");
        String fileSeparator = System.getProperty("file.separator");
        String username = System.getProperty("user.name");
        String userhome = System.getProperty("user.home");
        String userdir = System.getProperty("user.dir");

        System.out.println("version : " + version);
        System.out.println("home : " + home);
        System.out.println("os : " + os);
        System.out.println("fileSeparator : " + fileSeparator);
        System.out.println("username : " + username);
        System.out.println("userhome : " + userhome);
        System.out.println("userdir : " + userdir);

        System.out.println("=======================================");

        Properties properties = System.getProperties();
        Set<Object> keys = properties.keySet();
        for (Object o : keys) {
            String key = (String) o;
            String value = System.getProperty(key);
            System.out.println(key +  " : " + value);
        }
    }

    @Test
    void env() {
        /**
         * 환경변수
         * 운영체제상에서 키, 값으로 관리되는 문자열 정보
         */
        System.out.println(System.getenv("JAVA_HOME"));
    }
}
