package com.example.javadatastructure.codingtest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTestBasic {
    @Test
    void 문자열의_앞의_n글자() {
        String my_string = "ProgrammerS123";
        int n = 11;

        System.out.println(my_string.substring(0, n));
    }

    @Test
    void 조건에_맞게_수열_반환하기_3() {
        int[] arr = { 1, 2, 3, 100, 99, 98 };
        int k = 3;

        int[] answer = Arrays.stream(arr).map(a -> k % 2 == 0 ? a + k : a * k).toArray();

        for (int a : answer) {
            System.out.println(a);
        }
    }

    @Test
    void n의_배수() {
        int num = 34;
        int n = 3;

        int answer = 0;

        if (num % n == 0) {
            answer = 1;
        }

        System.out.println(answer);
    }

    @Test
    void rny_string() {
        String rny_string = "programmers";

        StringBuilder answer = new StringBuilder();

        // 내가 푼 풀이법
        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                answer.append("rn");
            } else {
                answer.append(c);
            }
        }
        System.out.println(answer);

        // rny_string 정답
        System.out.println(rny_string.replaceAll("m", "rn"));
    }

    @Test
    void 문자열_출력하기() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);
    }

    @Test
    void a와_b_출력하기() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    @Test
    void 문자열_반복해서_출력하기() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int a = 0; a < n; a++) {
            System.out.print(str);
        }
    }
}
