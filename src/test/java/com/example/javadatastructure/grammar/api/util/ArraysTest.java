package com.example.javadatastructure.grammar.api.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {
    /**
     * Arrays
     * 배열 조작 기능을 가진 클래스
     * 복사, 정렬, 검색과 같은 기능을 가지고 있다.
     */

    @Test
    void copyOf() {
        /**
         * copyOf()
         * 원본의 0번 인덱스에서 복사할 길이만큼 복사한다.
         */
        char[] arr = { 'J', 'A', 'V', 'A' };
        char[] arr2 = Arrays.copyOf(arr, arr.length);
        for (char c : arr2) System.out.print(c);
    }

    @Test
    void copyOfRange() {
        /**
         * copyOfRange()
         * 원본의 시작 인덱스부터 끝 인덱스까지 복사한다.
         */
        char[] arr = { 'J', 'A', 'V', 'A' };
        char[] arr2 = Arrays.copyOfRange(arr, 1, 3);
        for (char c : arr2) System.out.print(c);
    }

    @Test
    void equals() {
        /**
         * equals()
         * 1차 항목의 값만 비교한다.
         *
         * deepEquals()
         * 중첩된 배열의 항목까지 비교한다.
         */
        int[][] origin = { { 1, 2 }, { 3, 4 } };

        System.out.println("얕은 복사후 비교");
        int[][] clone = Arrays.copyOf(origin, origin.length);
        System.out.println("배열 번지 비교: " + origin.equals(clone));
        System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin, clone));
        System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(origin, clone));

        System.out.println("=========================================");

        System.out.println("깊은 복사후 비교");
        int[][] clone2 = Arrays.copyOf(origin, origin.length);
        clone2[0] = Arrays.copyOf(origin[0], origin[0].length);
        clone2[1] = Arrays.copyOf(origin[1], origin[1].length);
        System.out.println("배열 번지 비교: " + origin.equals(clone2));
        System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin, clone2));
        System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(origin, clone2));
    }

    @Test
    void sort() {
        /**
         * sort()
         * 기본 타입, String 배열은 자동으로 오름차순으로 정렬이 된다.
         * 사용자 정의 클래스 타입의 경우 Comparable 인터페이스를 구현하고 있어야 정렬이 된다.
         */
        int[] arr = { 3, 1, 4, 1, 5, 9, 2 };

        Arrays.sort(arr);
        for (int a : arr) System.out.print(a + " ");
        System.out.println();

        User user = new User("홍길동");
        User user2 = new User("박동수");
        User user3 = new User("김민수");
        User[] users = { user, user2, user3 };

        Arrays.sort(users);
        for (User u : users) System.out.print(u.name + " ");
        System.out.println();
    }

    @Test
    void search() {
        /**
         * binarySearch()
         * 특정 값이 위치한 인덱스를 얻는 행위
         * 즉, 배열 검색을 위한 메서드이다.
         */
        int[] scores = { 100, 90, 95, 80 };
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 90);
        System.out.println("찾은 인덱스: " + index);

        String[] names = { "홍길동", "박동수", "김민수" };
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);

        User user = new User("홍길동");
        User user2 = new User("박동수");
        User user3 = new User("김민수");
        User[] users = { user, user2, user3 };

        Arrays.sort(users);
        index = Arrays.binarySearch(users, user);
        System.out.println("찾은 인덱스: " + index);
    }
}
