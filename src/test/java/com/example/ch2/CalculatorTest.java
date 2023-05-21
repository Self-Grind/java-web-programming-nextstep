package com.example.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();



    @Test
    void add(){
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract(){

        Assertions.assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    void multiply(){
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide(){
        Assertions.assertEquals(0.5, calculator.divide(1, 2));
    }
}
