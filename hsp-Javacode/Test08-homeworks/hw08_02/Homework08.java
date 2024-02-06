package com.homeworks.hw08_02;

import java.time.YearMonth;

public class Homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500);
        //测试存款
        savingsAccount.deposit(200);
        savingsAccount.deposit(200);
        savingsAccount.deposit(200);
        savingsAccount.printBalance();
        savingsAccount.deposit(200);
        savingsAccount.printBalance();
        //测试取款
        savingsAccount.withdaw(100);
        savingsAccount.withdaw(100);
        savingsAccount.withdaw(100);
        savingsAccount.printBalance();
        savingsAccount.withdaw(100);
        savingsAccount.printBalance();

        //修改month    手动调用下  earnMonthlyInterest()方法
        savingsAccount.setMonth(YearMonth.of(2024, 1));
        System.out.println(savingsAccount.getMonth());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getMonth());
        savingsAccount.printBalance();

        //测试存款
        savingsAccount.deposit(200);
        savingsAccount.deposit(200);
        savingsAccount.deposit(200);
        savingsAccount.printBalance();
        savingsAccount.deposit(200);
        savingsAccount.printBalance();


    }
}
