package com.homeworks.hw15;

public class hw15 {
    public static void main(String[] args) {
        AA aa = new AA();
        //BB bb = (BB)aa;//不可以将一个 父类的对象转换为子类对象

        AA aa1 = new BB();
        BB bb1 = (BB)aa1;//aa1实际上就是个BB类的子类  所以可以转换

    }
}

class AA{

}

class BB extends AA{

}

class cc extends BB{

}
