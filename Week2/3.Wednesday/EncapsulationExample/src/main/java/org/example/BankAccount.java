package org.example;

public class BankAccount {
    private double balance;
    private String owner;

    //getter and setter
    public double getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setBalance(double balance){
        if(balance <= 0){
            System.out.println("Sorry you cannot deposit a negative number.");
        }
        else{
            this.balance = balance;
        }
    }
}
