package com.homeworks.hw05;

public class Waiter extends Employee {
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printYearSal() {
        System.out.print("服务员：" + getName() + "的年工资是：");
        super.printYearSal();
    }
}
