package com.Chapter02.new01;

public class Abstract01 {
    public static void main(String[] args) {

        Animal01 a = new Animal555("AC");
        a.eat();
    }
}

abstract class Animal01{
    private String name;

    public Animal01(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("不知道该干嘛的方法，称为抽象方法");
    }

    public abstract void Hello();
}


class Animal666 extends Animal01{
    public Animal666(String name) {
        super(name);
    }

    @Override
    public void Hello() {
        System.out.println("我是666的继承方法");
    }
}

class Animal555 extends Animal01{
    public Animal555(String name) {
        super(name);
    }

    @Override
    public void eat() {

        System.out.println("5555anleat");
    }

    @Override
    public void Hello() {
        System.out.println("我是555的抽象方法");
    }
}
