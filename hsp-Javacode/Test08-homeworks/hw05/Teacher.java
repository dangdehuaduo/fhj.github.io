package com.homeworks.hw05;

public class Teacher extends Employee {
    private double classSal;
    private int classDay;

    @Override
    public void printYearSal() {
        System.out.println("教师：" + getName() + "的年工资是：" + (getSalary() * getSalaryMonth() + classDay * classSal));
    }

    public Teacher(String name, double salary, double classSal, int classDay) {
        super(name, salary);
        this.classSal = classSal;
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }
}
