package com.homeworks.hw13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id, String hob) {
        super(name, sex, age, hob);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
