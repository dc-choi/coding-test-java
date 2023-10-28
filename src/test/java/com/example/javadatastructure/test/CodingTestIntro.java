package com.example.javadatastructure.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    void 나머지_구하기() {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 % num2);
    }

    @Test
    void 중앙값_구하기() {
        int[] array = { 5, 4, 7, 1, 3 }; // 정렬후: 1, 3, 4, 5, 7
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length / 2];
        System.out.println(answer);
    }

    @Test
    void 최빈값_구하기() {
        int[] array = { 80, 80, 80, 9, 9 };
        int[] index = new int[1000]; // 값별 개수를 구하기 위한 변수
        int rep = 0; // 중복여부
        int max = 0; // 최대값(최빈값)
        int answer = 0; // 결과값

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++; // 값별 개수를 구한다.

            // 값별 개수의 최대값이 곧 최빈값이 됨.
            if (max < index[array[i]]) {
                max = index[array[i]];
                answer = array[i];
            }
        }

        for (int i : index) {
            if (i == max) rep++;
            if (rep > 1) answer = -1;
        }

        System.out.println(answer);
    }

    @Test
    void 짝수는_싫어요() {
        int n = 15;
        int length = 0;

        if (n % 2 != 0) length = (n / 2) + 1;
        else length = n / 2;

        int[] arr = new int[length];

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arr[(n - i) / 2] = i;
            }
        }

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }

    @Test
    void 약수의_합() {
        int n = 12;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }

        System.out.println(answer);
    }

    @Test
    void 피자_나눠_먹기_1() {
        int n = 7;
        int answer = n / 7;
        if (n % 7 != 0) answer++;

        System.out.println(answer);
    }

    @Test
    void 피자_나눠_먹기_2() {
        int n = 10;

        int i = 1;
        while ((n * i) % 6 != 0) {
            i++;
        }

        System.out.println((n * i) / 6);
    }

    @Test
    void 피자_나눠_먹기_3() {
        int slice = 7;
        int n = 10;

        int answer = n / slice;
        if (n % slice != 0) answer++;

        System.out.println(answer);
    }

    @Test
    void 배열의_평균값() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        double sum = 0;
        for (int n : numbers) {
            sum += (double) n;
        }

        System.out.println(sum / numbers.length);
    }

    @Test
    void 옷가게_할인_받기() {
        int price = 100010;

        double answer = 0.0;

        if (price < 100000) answer = price;
        else if (price >= 100000 && price < 300000) answer = price * 0.95;
        else if (price >= 300000 && price < 500000) answer = price * 0.9;
        else if (price >= 500000) answer = price * 0.8;

        System.out.println((int)answer);
    }

    @Test
    void 아이스_아메리카노() {
        int money = 15000;

        int ice = money / 5500;
        int other = money % 5500;

        int[] answer = { ice, other };
    }

    @Test
    void 나이_출력() {
        int age = 27;
        System.out.println(2022 - age + 1);
    }

    @Test
    void 배열_뒤집기() {
        int[] num_list = { 1, 2, 3, 4, 5 };
        int[] answer = new int[num_list.length];

        for (int i = num_list.length; i > 0; i--) {
            answer[num_list.length - i] = num_list[i - 1];
        }

        for (int a : answer) {
            System.out.println(a);
        }
    }

    @Test
    void 문자열_뒤집기() {
        String my_string = "안녕하세요. 적당히 바람이 시원해 기분이 너무 좋아요. 유후~";
        System.out.println(new StringBuffer(my_string).reverse()); // 프로그래머스에서는 toString() 메서드를 사용해야함.
    }

    @Test
    void 직각삼각형_출력하기() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    void 짝수_홀수_개수() {
        int[] num_list = { 1, 2, 3, 4, 5 };
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) even++;
            if (num_list[i] % 2 != 0) odd++;
        }

        int[] answer = { even, odd };

        for (int a : answer) {
            System.out.println(a);
        }
    }

    @Test
    void 문자_반복_출력하기() {
        String my_string = "hello";
        int n = 5;
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        System.out.println(answer);
    }

    @Test
    void 특정_문자_제거하기() {
        String my_string = "abcdefg";
        String letter = "f";

        String answer = my_string.replace(letter, "");
        System.out.println(answer);
    }

    @Test
    void 각도기() {
        int angle = 91;

        int answer = 0;

        if (0 < angle && angle < 90) answer = 1;
        if (angle == 90) answer = 2;
        if (90 < angle && angle < 180) answer = 3;
        if (angle == 180) answer = 4;

        System.out.println(answer);
    }

    @Test
    void 양꼬치() {
        int n = 64;
        int k = 6;

        int answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);

        System.out.println(answer);
    }

    @Test
    void 짝수의_합() {
        int n = 100;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) answer += i;
        }

        System.out.println(answer);
    }
}
