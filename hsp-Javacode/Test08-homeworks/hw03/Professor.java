package com.homeworks.hw03;

public class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.print(getName() + "\t" + getAge() + "\t" + getPost() + "\t" + getSalary() * 1.3);
    }
}
