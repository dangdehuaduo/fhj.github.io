package com.homeworks.hw13;

public class Homework13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("小明", '男', 20, "00023102", "足球");
        persons[1] = new Student("小红", '女', 19, "00023111", "羽毛球");
        persons[2] = new Teacher("张飞", '男', 30, 5, "象棋");
        persons[3] = new Teacher("刘备", '男', 45, 10, "乒乓球");

        Method method = new Method();

        method.sort(persons);

        for (int i = 0; i < persons.length; i++) {
            method.print(persons[i]);
        }



    }

}
