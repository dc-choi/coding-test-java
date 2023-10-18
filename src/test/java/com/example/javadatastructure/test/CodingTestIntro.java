package com.example.javadatastructure.test;

import org.junit.jupiter.api.Test;

public class CodingTestIntro {
    @Test
    void 두수의_합() {
        int num1 = 1;
        int num2 = 2;
        int answer = -1;

        if (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
            answer = num1 + num2;
        }

        System.out.println(answer);
    }

    @Test
    void 두수의_차() {
        int num1 = 1;
        int num2 = 2;
        int answer = num1 - num2;

        System.out.println(answer);
    }

    @Test
    void 두수의_곱() {
        int num1 = 1;
        int num2 = 2;

        int answer = 0;

        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            answer = num1 * num2;
        }

        System.out.println(answer);
    }

    @Test
    void 몫_구하기() {
        int num1 = 1;
        int num2 = 2;

        int answer = 0;
        if (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
            answer = num1 / num2;
        }

        System.out.println(answer);
    }

    @Test
    void 두_수의_나눗셈() {
        int num1 = 1;
        int num2 = 2;

        double mod = (double) num1 / (double) num2;
        double answer = mod * 1000.0;

        System.out.println((int)answer);
    }

    @Test
    void 숫자_비교하기() {
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1 == num2 ? 1 : -1);
    }

    @Test
    void 분수의_덧셈() {
        int num1 = 1;
        int de1= 2;
        int num2 = 3;
        int de2 = 4;

        int top = (num1 * de2) + (num2 * de1); // 분자를 각 상대의 분모를 곱한 값끼리 더함.
        int bottom = de1 * de2; // 분모끼리 곱한다.

        int lcm = 1;

        // 최소공배수(두 자연수의 공통된 배수중 가장 작은 수)를 구하는 로직
        for (int i = 1; i <= bottom && i <= top; i++) {
            if (bottom % i == 0 && top % i == 0) {
                lcm = i;
            }
        }

        // 최소공배수로 약분한다.
        int[] answer = { top / lcm, bottom / lcm } ;

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    @Test
    void 배열_두배_만들기() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
