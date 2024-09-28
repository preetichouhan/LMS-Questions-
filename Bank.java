package com.day1;

public class Bank {
    private double amount;

    // Parameterized constructor to initialize variable "amount" with value 10000
    public Bank() {
        this.amount = 10000.0;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? "Withdrawal successful" : "Insufficient balance";
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdraw(2000.0);
        bank.deposit(5000.0);
        bank.displayBalance();
    }
}