package com.example.ch2;

public class Calculator {
    int add(int i, int j){
        return i + j;
    }
    int subtract(int i, int j){
        return i - j;
    }

    int multiply(int i, int j){
        return i * j;
    }

    double divide(int i, int j){
        if (j == 0) return 0;

        return (double) i / j;
    }
}
