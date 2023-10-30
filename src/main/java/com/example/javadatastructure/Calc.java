package com.example.javadatastructure;

import java.util.Arrays;
import java.util.List;

public class Calc {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    public static int run(String param) {
        param = param.replaceAll("[a-zA-Z]", "");
        // isBlank()가 빈 문자열을 확인해줘서 isEmpty()를 사용하지 않음
        if (param.isBlank()) return 0;

        List<String> numbers = Arrays.stream(param.replaceAll("\\s", "").split("[+\\-*/]")).toList();
        List<String> operators = Arrays.stream(param.replaceAll("[0-9\\s]", "").split("")).toList();

        int result = 0;

        for (int count = 1; count < numbers.size(); count++) {
            if (operators.get(count - 1).equals(MUL)) {
                if (result == 0) {
                    result = Integer.parseInt(numbers.get(count - 1)) * Integer.parseInt(numbers.get(count));
                }
                else result *= Integer.parseInt(numbers.get(count));
            }

            if (operators.get(count - 1).equals(DIV)) {
                if (result == 0) {
                    result = Integer.parseInt(numbers.get(count - 1)) / Integer.parseInt(numbers.get(count));
                }
                else result /= Integer.parseInt(numbers.get(count));
            }
        }

        for (int count = 1; count < numbers.size(); count++) {
            if (operators.get(count - 1).equals(PLUS)) {
                if (result == 0) result = Integer.parseInt(numbers.get(count - 1)) + Integer.parseInt(numbers.get(count));
                else result += Integer.parseInt(numbers.get(count));
            }
            if (operators.get(count - 1).equals(MINUS)) {
                if (result == 0) result = Integer.parseInt(numbers.get(count - 1)) - Integer.parseInt(numbers.get(count));
                else result -= Integer.parseInt(numbers.get(count));
            }
        }

        return result;
    }
}
