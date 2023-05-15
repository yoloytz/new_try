package com.Chapter02.new01;

public class CodeBlock {
    public static void main(String[] args) {

        new BB();

    }

}

class AA{
    static public int x = 5;

    static {
        System.out.println("父类静态代码块被调用");
    }

    {
        System.out.println("父类类普通代码块被调用");
    }

    public AA(){
        System.out.println("父类构造器被调用");
    }
}

class BB extends AA{
    public static double n = 999;

    static {
        System.out.println("子类静态代码块被调用");
    }

    {
        System.out.println("子类普通代码块被调用");
    }

    public BB(){
        super();
        System.out.println("子类构造器被调用");
    }
}


