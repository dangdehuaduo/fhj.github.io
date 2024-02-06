package com.homeworks.hw05;

public class Scientist extends Employee {
    private double bonus;

    @Override
    public void printYearSal() {
        System.out.println("科学家：" + getName() + "的年工资是：" + (getSalary() * getSalaryMonth() + bonus));
    }

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
