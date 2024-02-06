package com.homeworks.hw05;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printYearSal() {
        System.out.print("工人：" + getName() + "的年工资是：");
        super.printYearSal();
    }
}
