package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String state;
    private double yearlyIncome;
    private String job;

    public Person(String firstName, String lastName, int age, String state, double yearlyIncome, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
        this.yearlyIncome = yearlyIncome;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age + ", State: " + state +
                ", Yearly Income: $" + yearlyIncome + ", Job: " + job;
    }
}

