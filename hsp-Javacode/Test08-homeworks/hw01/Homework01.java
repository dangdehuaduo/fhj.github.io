package com.homeworks.hw01;

public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("jack", 18, "works");
        person[1] = new Person("tom", 60, "boss");
        person[2] = new Person("lucy", 30, "doctor");
        person[3] = new Person("tiger", 80, "doctor");
        person[4] = new Person("echo", 10, "doctor");
        Person personTemp = null;
        //先把最大的找出来放在最前面
//        for (int i = 0; i < person.length - 1; i++) {
//            for (int j = i + 1; j < person.length; j++) {
//                if(person[j].getAge() > person[i].getAge()){
//                    personTemp = person[j];
//                    person[j] = person[i];
//                    person[i] = personTemp;
//                }
//            }
//        }

        //先把最小的找出来放在最后面
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if(person[j].getAge() < person[j + 1].getAge()){
                    personTemp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = personTemp;
                }

            }

        }

        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);
        System.out.println(person[4]);



    }
}
