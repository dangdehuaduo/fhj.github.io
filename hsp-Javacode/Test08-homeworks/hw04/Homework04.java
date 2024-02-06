package com.homeworks.hw04;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("tiger", 200, 20, 1500);
        manager.introduce();
        Worker worker = new Worker("tom", 150, 30);
        worker.introduce();
    }
}
