package org.example;

public class Calculator {
    public double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public double divide(double numerator, double denominator){
        if(denominator == 0){
            throw new ArithmeticException();
        }
        else{
            return numerator / denominator;
        }
    }
}
