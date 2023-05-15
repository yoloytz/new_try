package com.Chapter02.new01;

public class finalEx{
    public static void main(String[] args) {
        new A().hi();
        System.out.println("==========");
        new B().hi();
    }
}

class A{
    public void hi(){
        System.out.println("A方法的hi");
    }
}

class B extends A{
//    @Override
//    public void hi() {
//        super.hi();
//        System.out.println("A方法被重写");
//    }
}
