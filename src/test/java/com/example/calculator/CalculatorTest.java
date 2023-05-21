package com.example.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeEach
    void setUp(){
        System.out.println("setUp");
        calculator = new Calculator();
    }

    @AfterEach
    void teardown(){
        System.out.println("teardown");
    }


    @Test
    void add(){
        System.out.println("add");
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract(){
        System.out.println("subtract");
        Assertions.assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    void multiply(){
        System.out.println("multiply");
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide(){
        System.out.println("divide");
        Assertions.assertEquals(0.5, calculator.divide(1, 2));
    }
}
