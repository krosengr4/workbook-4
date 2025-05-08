package com.pluralsight;

public class BankAccount {
    //Static variables
    static double interestRate;
    //Instance variables
    String number;
    String name;
    double balance;

    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    /*
    Instance:
        - Everytime an instance of the object(BankAccount) is created, a new instance of
        the variables and methods are created.
        - Instance methods can only access and change variables within the instance of
        the object.

    Static:
        - Static variables or methods are created immediately when a class is loaded
        into memory.
        - The app will only have a single copy of a static method or variable.
        - They are available even when you haven't made an instance of the object

    Static Classes:
        - Java does not have global functions(variables/methods), but sometimes we need a library
        of reusable functions.
        - Static classes are similar to global functions.
        - Static classes ONLY contain static methods and variables.

     */

    //Instance method
    //Changes the variable(balance) within the instance of the object(bank account)
    public void deposit(double amount) {
        this.balance += amount;
    }

    //Instance method
    //Changes the variable(balance) within the instance of the object(bank account)
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    //Static method
    //Changes the value for ALL instances of object(BankAccount)
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    //Static method
    //Gets the value for ALL instances of object(BankAccount)
    public static double getInterestRate() {
        return interestRate;
    }

}
