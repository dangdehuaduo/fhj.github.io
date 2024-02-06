package com.homeworks.hw05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("tom", 5000);
        worker.setSalaryMonth(15);//灵活修改  改为15薪
        worker.printYearSal();

        Teacher teacher = new Teacher("lucy", 6000, 220, 300);
        teacher.printYearSal();

        Scientist scientist = new Scientist("tiger", 10000, 8000);
        scientist.setSalaryMonth(10);
        scientist.printYearSal();
    }
}
