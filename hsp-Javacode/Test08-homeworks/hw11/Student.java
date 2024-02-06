package com.homeworks.hw11;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Student run()");
    }

    public void study(){
        System.out.println("Student study()");
    }
}
