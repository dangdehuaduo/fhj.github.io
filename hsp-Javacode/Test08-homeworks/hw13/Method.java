package com.homeworks.hw13;

public class Method {

    public void sort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if(persons[j].getAge() > persons[i].getAge()){
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public void print(Person p){
        if(p instanceof Student){
            Student s = (Student)p;
            System.out.println("学生的信息：" + "\n" + "姓名：" + s.getName() + "\n" +
                    "年龄：" + s.getAge() + "\n" + "性别：" + s.getSex() + "\n" + "学号：" + s.getStu_id());
            s.study();
            System.out.println(s.play() + "\t");
            System.out.println("--------------------------");
        }else if(p instanceof Teacher){
            Teacher t = (Teacher)p;
            System.out.println("老师的信息：" + "\n" + "姓名：" + t.getName() + "\n" +
                    "年龄：" + t.getAge() + "\n" + "性别：" + t.getSex() + "\n" + "工龄：" + t.getWork_age());
            t.teach();
            System.out.println(t.play() + "\t");
            System.out.println("--------------------------");

        }
    }


}
