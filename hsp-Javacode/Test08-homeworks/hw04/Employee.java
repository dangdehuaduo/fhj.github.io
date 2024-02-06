package com.homeworks.hw04;

public class Employee {
    private String name;
    private double daySalary;
    private int days;

    public void introduce(){
        System.out.println("工资是：" + daySalary * days);
    }

    public Employee(String name, double daySalary, int days) {
        this.name = name;
        this.daySalary = daySalary;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
