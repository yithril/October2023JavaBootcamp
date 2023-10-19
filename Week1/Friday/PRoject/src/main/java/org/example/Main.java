package org.example;

public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double interestRate = 10.5;
        double loanLength = 20;

        //P[r(1+r)^n] / [(1+r)^n-1]

        double numerator = principal * (Math.pow(interestRate * (1 + interestRate), loanLength));
        double denominator = Math.pow(1 + interestRate, loanLength - 1);

        double monthlyPayment = numerator / denominator;


        double initialDeposit = 150000;
        double annualInterestRate = 15.6;
        double numberOfYears = 10;

        //FV = P(1 + r/n)^(n*t)

        double fv = Math.pow(initialDeposit * (1 + annualInterestRate/365), 365 * numberOfYears);

    }
}