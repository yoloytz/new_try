package com.encap;

public class Student {
    public String name;
    public int age;
    protected double score;

    public Student() {
        System.out.println("父类默认构造器被调用");
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("父类有参构造器被调用");
    }

    public void setScore(double score) {
        this.score = score;
    }


}
