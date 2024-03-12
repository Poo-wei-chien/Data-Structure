package L01_programming_fundamental.Question3;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate; // Shared by all objects
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() { // Rate means in percentage
        return (annualInterestRate / (12));
    }

    public double getMonthlyInterest() { // take the balance and multiply by the monthly interest rate
        return balance * getMonthlyInterestRate()/100;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }



}
