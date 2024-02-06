package com.homeworks.hw08_01;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.setCharge(1);
        checkingAccount.deposit(10);
        checkingAccount.printBalance();

        checkingAccount.withdaw(9);
        checkingAccount.printBalance();

    }
}
