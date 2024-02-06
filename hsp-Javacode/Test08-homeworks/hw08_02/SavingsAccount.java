package com.homeworks.hw08_02;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class SavingsAccount extends BankAccount {
    private double rate = 0.01;//利率
    private YearMonth month = YearMonth.now();
    private int depositTimes = 3; //每个月三次的免手续费机会
    private int withdrawTimes = 3;
    private double charge = 10;//存款、取款手续费

    public void earnMonthlyInterest(){
        if(month.isBefore(YearMonth.now())){
            this.month = YearMonth.now();
            super.deposit(getBalance() * rate);//利息存入账户
            this.depositTimes = 3;
            this.withdrawTimes = 3;
        }
    }

    @Override
    public void deposit(double amount) {
        earnMonthlyInterest();
        if(depositTimes > 0){
            super.deposit(amount);
            depositTimes--;
        }else {
            super.deposit(amount - charge);
        }
    }

    @Override
    public void withdaw(double amount) {
        earnMonthlyInterest();
        if(withdrawTimes > 0){
            super.withdaw(amount);
            withdrawTimes--;
        }else {
            super.withdaw(amount + charge);
        }

    }

    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    public double getInterest() {
        return rate;
    }

    public void setInterest(double interest) {
        this.rate = interest;
    }

    public YearMonth getMonth() {
        return month;
    }

    public void setMonth(YearMonth month) {
        this.month = month;
    }
}
