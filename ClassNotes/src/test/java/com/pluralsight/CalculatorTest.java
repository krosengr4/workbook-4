package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /*
    Arrange, Act, Assert

    Arrange:
    - Declare all variables that you will need to use throughout your test
    - ex: Calculator calculator = new Calculator();
          int expectedResult = 5;

    Act:
    - Call the function that is being tested
    - ex: int actualResult = calculator.add(i,j)

    Assert:
    - Verify that your test either passed or failed
    - There are many assertions:
        assertEquals
        assertNotEquals
        assertArrayEquals
        assertTrue
    - Syntax:
        Assertions.assertEquals(expected, actual)
        Assertions.assertArrayEquals(expectedArray, actualArray)

        */
    @Test
    void add_should_produceCorrectSum() {

        //Arrange
        Calculator calculator = new Calculator();
        int expectedResult = 5;

        //Act
        int actualResult = calculator.add(2, 3);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_should_produceCorrectProduct() {

        //Arrange
        Calculator calculator = new Calculator();
        int expected = 15;

        //Act
        int actual = calculator.multiply(3, 5);

        //Assert
        assertEquals(15, actual);
    }

    @Test
    void subtract_should_produceCorrectDifference() {
        //! This test is meant to fail!
        Calculator calculator = new Calculator();
        int expected = 20;
        int actual = calculator.subtract(70, 15);

        //actual = 55, but expected = 20
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divide() {
        //Arrange
        Calculator calculator = new Calculator();
        int expected = 3;

        //Act
        int actual = calculator.divide(9, 3);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}