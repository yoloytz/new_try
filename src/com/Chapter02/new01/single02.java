package com.Chapter02.new01;

public class single02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
    }
}

class Cat{
    private String name;
    private static Cat cat;

    private Cat(String name){
        this.name = name;
    }
    //1、构造器私有化
    //2、定义一个静态的对象 不new
    //3、提供一个public的static方法，可以返回一个Cat对象

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小喵喵");
        }
        return cat;
    }


}