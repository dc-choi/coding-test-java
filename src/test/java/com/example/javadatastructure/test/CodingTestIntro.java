package com.example.javadatastructure.test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

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

    @Test
    void 편지() {
        String message = "happy birthday!";
        System.out.println(message.length() * 2);
    }

    @Test
    void 점의_위치_구하기() {
        int[] dot = { -3, -2 };
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) answer = 1;
        if (dot[0] < 0 && dot[1] > 0) answer = 2;
        if (dot[0] < 0 && dot[1] < 0) answer = 3;
        if (dot[0] > 0 && dot[1] < 0) answer = 4;

        System.out.println(answer);
    }

    @Test
    void 배열_원소의_길이() {
        String[] strlist = { "We", "are", "the", "world!" };
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        for (int a : answer) {
            System.out.println(a);
        }
    }

    @Test
    void 중복된_숫자의_개수() {
        int[] array = { 1, 1, 2, 3, 4, 5, 6 };
        int n = 1;

        int answer = 0;
        for(int a : array) if (a == n) answer++;

        System.out.println(answer);
    }

    @Test
    void 배열_자르기() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int num1 = 1;
        int num2 = 3;

        // int[] answer = Arrays.stream(numbers, num1, num2 + 1).toArray();

        List<Integer> list = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }

    @Test
    void 자릿수_구하기() {
        int n = 1234;

        int answer = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - 48;
        }

        System.out.println(answer);
    }

    @Test
    void 문자열안에_문자열() {
        String str1 = "cd";
        String str2 = "abcd";

        int answer = 0;
        if (str1.contains(str2)) answer = 1;
        else answer = 2;

        System.out.println(answer);
    }

    @Test
    void 머쓱이보다_키_큰_사람() {
        int[] array = { 111, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int height = 4;

        int answer = 0;
        for (int i = 0; i < array.length; i++) if (array[i] > height) answer++;

        System.out.println(answer);
    }

    @Test
    void 배열의_유사도() {
        String[] s1 = { "a", "b", "c" };
        String[] s2 = { "com", "b", "d", "p", "c" };

        int answer = 0;
        for (String str : s1) {
            for (String str2 : s2) {
                if (str.equals(str2)) answer++;
            }
        }

        System.out.println(answer);
    }

    @Test
    void 최대값_만들기_1() {
        int[] numbers = { 0, 31, 24, 10, 1, 9 };

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    @Test
    void 순서쌍의_개수() {
        int n = 100;

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        System.out.println(answer);
    }

    @Test
    void 삼각형의_완성조건_1() {
        int[] sides = { 199, 72, 222 };

        int answer = 0;
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) answer = 1;
        else answer = 2;

        System.out.println(answer);
    }

    @Test
    void 모음_제거() {
        String my_string = "nice to meet you";

        System.out.println(my_string.replaceAll("[aeiou]", ""));
    }

    @Test
    void 제곱수_판별하기() {
        int n = 966;

        int answer = 1;
        int count = 0;
        while (count * count < n) {
            count++;
        }

        answer = count * count == n ? 1 : 2;
        System.out.println(answer);
    }

    @Test
    void 숨어있는_숫자의_덧셈_1() {
        String my_string = "1a2b3c4d123";

        int sum = 0;

        for (int i = 0; i < my_string.length(); i++) {
            int charset = my_string.charAt(i);
            if (charset >= 48 && charset <= 57) sum += charset - 48;
        }

        System.out.println(sum);
    }

    @Test
    void 세균_증식() {
        int n = 7;
        int t = 15;

        int sum = n;
        for (int i = 1; i <= t; i++) {
            sum *= 2;
        }

        System.out.println(sum);
    }

    @Test
    void 개미_군단() {
        int hp = 999;

        int count = hp / 5; // 장군개미
        hp %= 5; // 장군개미수 만큼 피가 없어짐.

        count += hp / 3; // 병정개미
        hp %= 3; // 병정개미수 만큼 피가 없어짐.

        count += hp;

        System.out.println(count);
    }

    @Test
    void 대문자와_소문자() {
        String my_string = "cccCCC";
        StringBuffer str = new StringBuffer();

        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            else if (c >= 'a' && c <= 'z') c =  (char)(c - 32);
            str.append(c);
        }

        System.out.println(str);
    }

    @Test
    void 암호_해독() {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        char[] chars = cipher.toCharArray();
        StringBuffer str = new StringBuffer();

        for (int i = code; i <= cipher.length(); i = i + code) {
            str.append(chars[i - 1]);
        }

        System.out.println(str);
    }

    @Test
    void n의_배수_고르기() {
        int n = 3;
        int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        List<Integer> list = new ArrayList<>();
        for (int a : numlist) {
            if (a % n == 0) list.add(a);
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        for (int a : arr) {
            System.out.println(a);
        }
    }

    @Test
    void 가위_바위_보() {
        String rsp = "205";

        char[] rspChars = rsp.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : rspChars) {
            switch (c) {
                case '0' -> stringBuffer.append("5");
                case '2' -> stringBuffer.append("0");
                case '5' -> stringBuffer.append("2");
            }
        }

        System.out.println(stringBuffer);
    }

    @Test
    void 최댓값_만들기_2() {
        int[] numbers = { 1, 2, -3, 4, -5 };

        int answer = 0;

        Arrays.sort(numbers);

        if (numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }

        System.out.println(answer);
    }

    @Test
    void 주사위의_개수() {
        int[] box = { 10, 8, 6 };
        int n = 3;

        System.out.println((box[0] / n) * (box[1] / n) * (box[2] / n));
    }

    @Test
    void 문자열_정렬하기_1() {
        String my_string = "hi12392";

        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') list.add(c - '0');
        }

        for (int i : list.stream().sorted().mapToInt(Integer::intValue).toArray()) {
            System.out.println(i);
        }
    }

    @Test
    void 가장_큰_수_찾기() {
        int[] array = { 11, 10, 12, 8 };

        int[] answer = { 0, 0 };
        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    @Test
    void 인덱스_바꾸기() {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        char[] chars = my_string.toCharArray();
        char temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;

        System.out.println(String.valueOf(chars));
    }

    @Test
    void 외계행성의_나이() {
        int age = 98;

        char[] parseAge = Integer.toString(age).toCharArray();
        char[] chars = "abcdefghij".toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for(char p : parseAge) {
            stringBuffer.append(chars[p - 48]);
        }

        System.out.println(stringBuffer);
    }

    @Test
    void 배열_회전시키기() {
        int[] numbers = { 4, 455, 6, 4, -1, 45, 6 };
        String direction = "right";

        int[] result = new int[numbers.length];

        switch (direction) {
            case "left" -> {
                result[result.length - 1] = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    result[i - 1] = numbers[i];
                }
            }
            case "right" -> {
                result[0] = numbers[result.length - 1];
                for (int i = 1; i < numbers.length; i++) {
                    result[i] = numbers[i - 1];
                }
            }
        }

        for (int a : result) {
            System.out.println(a);
        }
    }

    @Test
    void 약수_구하기() {
        int n = 29;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }

        for (int a : list.stream().mapToInt(Integer::intValue).toArray()) {
            System.out.println(a);
        }
    }

    @Test
    void _369게임() {
        int order = 1369123;

        int count = 0;
        char[] parseOrder = Integer.toString(order).toCharArray();
        for (char c : parseOrder) {
            if (c == '3' || c == '6' || c == '9') count++;
        }

        System.out.println(count);
    }

    @Test
    void 숫자_찾기() {
        int num = 29183;
        int k = 1;

        int answer = -1;
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0;  i < chars.length; i++) {
            if (chars[i] == k + 48) {
                answer = i + 1;
                break;
            }
        }

        System.out.println(answer);
    }

    @Test
    void 합성수_찾기() {
        int n = 10;

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }

            if (count >= 3) answer++;
        }

        System.out.println(answer);
    }

    @Test
    void 중복된_문자_제거() {
        String my_string = "people";

        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int[] strCheck = new int[str.length()];
        StringBuffer stringBuffer = new StringBuffer();

        for (char c : my_string.toCharArray()) {
            strCheck[str.indexOf(c)]++;
            if (strCheck[str.indexOf(c)] <= 1) stringBuffer.append(c);
        }

        System.out.println(stringBuffer);
    }

    @Test
    void 문자열_정렬하기_2() {
        String my_string = "Bcad";

        System.out.println(my_string
                .toLowerCase()
                .chars()
                .sorted()
                .collect(
                        StringBuffer::new,
                        StringBuffer::appendCodePoint, // char를 String으로 변경
                        StringBuffer::append
                )
                .toString());
    }

    @Test
    void _2차원으로_만들기() {
        int[] num_list = { 100, 95, 2, 4, 5, 6, 18, 33, 948 };
        int n = 3;

        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        for (int[] as: answer) {
            for (int a : as) System.out.println(a);
            System.out.println();
        }
    }

    @Test
    void A로_B만들기() {
        String before = "hello";
        String after = "olleh";

        int answer = 0;

        String str = "abcdefghijklmnopqrstuvwxyz";
        int[] beforeCheck = new int[str.length()];
        int[] afterCheck = new int[str.length()];

        for (char c : before.toCharArray()) beforeCheck[str.indexOf(c)]++;
        for (char c : after.toCharArray()) afterCheck[str.indexOf(c)]++;

        if (Arrays.equals(beforeCheck, afterCheck)) answer = 1;

        System.out.println(answer);
    }

    @Test
    void 모스부호_1() {
        String letter = ".... . .-.. .-.. ---";

        String[] mos = {
                ".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };

        StringBuffer stringBuffer = new StringBuffer();
        String[] split = letter.split(" ");
        for (String s : split) {
            char c = (char)(Arrays.asList(mos).indexOf(s) + 'a');
            stringBuffer.append(c);
        }

        System.out.println(stringBuffer);
    }

    @Test
    void 팩토리얼() {
        int n = 120;

        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            int count = factorial(i);
            if (count <= n) answer = i;
        }

        System.out.println(answer);
    }

    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    @Test
    void k의_개수() {
        int i = 1;
        int j = 13;
        int k = 1;

        int answer = 0;
        char kChar = (char) Character.toTitleCase(k);

        for (int n = i; n <= j; n++) {
            char[] chars = Character.toChars(n);
            for (char c : chars) {
                if (c == kChar) answer++;
            }
        }

        System.out.println(answer);
    }
}
