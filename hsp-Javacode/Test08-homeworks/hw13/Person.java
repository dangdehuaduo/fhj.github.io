package com.homeworks.hw13;

public class Person {
    private String name;
    private char sex;
    private int age;
    private String hob;

    public Person(String name, char sex, int age, String hob) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hob = hob;
    }

    public String getHob() {
        return hob;
    }

    public void setHob(String hob) {
        this.hob = hob;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String play(){
        return name + "爱玩" + hob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", hob='" + hob + '\'' +
                '}';
    }
}
