package com.example.ch2.stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    private static StringCalculator stringCalculator;

    @BeforeEach
    void setup(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void addText(){
//        String input = "//.\n1,2,3,4:5";
        String input = "4";
        Assertions.assertThat(stringCalculator.addV1(input)).isEqualTo(15);

    }

    @Test
    void addV2_빈문자열(){
        Assertions.assertThat(stringCalculator.addV2("")).isEqualTo(0);
        Assertions.assertThat(stringCalculator.addV2(null)).isEqualTo(0);
    }
    @Test
    void addV2_숫자하나(){
        Assertions.assertThat(stringCalculator.addV2("1")).isEqualTo(1);
    }

    @Test
    public void addV2_쉼표() throws Exception {
        assertEquals(stringCalculator.addV2("1,2:3"), 6);

    }

    @Test
    public void addV2_여러구분자() throws Exception{
        assertEquals(stringCalculator.addV2("//;\n1;2;3"), 6);
    }

    @Test
    public void add_negative() throws Exception {
        assertThrows(RuntimeException.class, ()->{
            stringCalculator.addV2("-1,2,3");
        });
    }

}
