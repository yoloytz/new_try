package com.Chapter02.new01;

public class ChildGame {

    public static void main(String[] args) {
        Child kid1 = new Child("ytz");
        Child kid2 = new Child("zmy");
        Child kid3 = new Child("zwy");


        Child.count = 50;
        Child.count++;
        System.out.println(Child.count);
    }
}

class Child{
    private String name;

    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(this.name + "加入了游戏");
    }
}
