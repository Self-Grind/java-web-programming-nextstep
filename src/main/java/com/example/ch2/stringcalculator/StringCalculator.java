package com.example.ch2.stringcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    /**
     * 초기 작성 - step 1
     * 숫자 계산
     * regex -
     */
    public int addV1(String text) {
        String num = "";
        String pattern = ":,";

        if (text == null || text.isEmpty())
            return 0;
        // 만약 커스텀 구분자가 있다면 커스텀 구분자까지 pattern에 포함한다.
        // V
        if (text.contains("\n")) {
            num = text.substring(text.indexOf("\n") + 1);
            pattern += text.substring(text.indexOf("/") + 2, text.indexOf("\n"));
        }

        //음수가 포함됐을 경우 RuntimeException
        //V
        if (num.contains("-")) throw new RuntimeException();

        System.out.println("num = " + num);
        pattern = "[" + pattern + "]";
        String[] lst = num.split(pattern);
        // 계산
        int answer = 0;
        for (String s : lst) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }

    /**
     * addV2
     */
    /**
     * 초기 작성 - step 1
     * 숫자 계산
     * regex -
     * 리팩토링
     */
    public int addV2(String text) {
        // 빈문자열
        if (isBlank(text))
            return 0;

        return sum(toInts(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String delimeter = m.group(1);
            return m.group(2).split(delimeter);
        }
        return text.split("[,:]");
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

}
