package com.homeworks.hw04;

public class Worker extends Employee{
    private double grade = 1.0;

    @Override
    public void introduce() {
        System.out.println("工人：" + getName() + "的工资是：" + (getDaySalary() * getDays() * grade));
    }

    public Worker(String name, double daySalary, int days) {
        super(name, daySalary, days);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
