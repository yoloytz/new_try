package com.xiaoyun;
/**
  *         对java的继承原理进行讲解
 **/
public class ExtendTheory {
    public static void main(String[] args) {
        son y = new son();
        System.out.println(y.name);
        System.out.println(y.scy);
        System.out.println("pull尝试");

    }
}
class Grandpa{
    String name = "爷爷";
    int age = 80;
    int scy = 3000;
}

class Father extends Grandpa{
    String name = "爸爸";
    int age = 35;
}

class son extends Father{
    String name = "ytz";
}
