package com.homeworks.hw11;

public class Homework11 {
    public static void main(String[] args) {
        Person person = new Student();
        person.run();
        person.eat();

        Student student = (Student)person;
        student.run();
        student.study();
        student.eat();

    }
}
