package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void add_two_numbers_succeeds(){
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        double sum = calculator.add(4, 5);

        //Assert
        assertEquals(9, sum);
    }

    @Test
    public void divide_by_zero(){
        Calculator calculator = new Calculator();

        //double quotient = calculator.divide(10, 0);

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}