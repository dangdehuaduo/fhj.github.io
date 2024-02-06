package com.homeworks.hw08_02;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance += amount;

    }

    public void withdaw(double amount){
        balance -= amount;
    }

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("你的账户余额为：" + balance);
    }

}
