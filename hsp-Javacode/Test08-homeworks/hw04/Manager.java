package com.homeworks.hw04;

public class Manager extends Employee {
    private double bonus;
    private double grade = 1.2;

    @Override
    public void introduce() {
        System.out.println("经理：" + getName() + "的工资是：" + (bonus + getDaySalary() * getDays() * grade));
    }

    public Manager(String name, double daySalary, int days, double bonus) {
        super(name, daySalary, days);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
