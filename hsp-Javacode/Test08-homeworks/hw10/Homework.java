package com.homeworks.hw10;

public class Homework {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 28, "经理", "男", 10000);
        Doctor doctor2 = new Doctor("jack", 28, "经理", "男", 10000);
        Doctor doctor3 = new Doctor("tom", 30, "经理", "男", 10000);
        System.out.println(doctor1.equals(doctor3));

    }
}
