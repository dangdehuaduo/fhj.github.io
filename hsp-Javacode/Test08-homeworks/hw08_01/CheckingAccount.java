package com.homeworks.hw08_01;

public class CheckingAccount extends BankAccount{
    private double charge;

    @Override
    public void deposit(double amount) {
        super.deposit(amount - charge);
    }

    @Override
    public void withdaw(double amount) {
        super.withdaw(amount + charge);
    }

    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
