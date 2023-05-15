package com.Polyexerciese;

public class ObjectPoly {
    public static void main(String[] args) {
        //体验对象多态的特点

        Animal animal = new Dog();
        //运行类型为Dog 编译类型为Animal
        animal.cry();

        animal = new Cat();//改变对象animal的运行类型
        animal.cry();

    }
}
