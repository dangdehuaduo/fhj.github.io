package com.homeworks.hw13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age, String hob) {
        super(name, sex, age, hob);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }


}
