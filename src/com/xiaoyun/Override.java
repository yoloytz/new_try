package com.xiaoyun;

public class Override {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
//        dog.cry();
        cat.cry();
        cat.cry2();
    }
}

class Dog{
    public void cry(){
        System.out.println("云天泽起床了");
    }
}

class Cat extends Dog{
    public void cry2(){
        System.out.println("云天泽睡觉了");
    }
}

