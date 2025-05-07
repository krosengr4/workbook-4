package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /*
    Arrange:
    void testAddIntegers() {
        Act:
        int actualResult = calculator.add(i,j)

        Assert:
        Assertions.assertEquals(expected, actualResult)
    }
        */
    @Test
    void add() {

        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.add(2, 3);

        //Assertions.assertEquals(expected, actualResult)
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {

        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.multiply(3, 5);

        assertEquals(15, actual);
    }

    @Test
    void subtract() {
        //* This test is meant to fail!
        Calculator calculator = new Calculator();
        int expected = 20;
        int actual = calculator.subtract(70, 15);

        //actual = 55, but expected = 20
        Assertions.assertEquals(expected, actual);
    }
}