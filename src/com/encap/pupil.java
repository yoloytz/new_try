package com.encap;

class pupil extends Student {

    public pupil(){

        System.out.println("子类无参构造器被调用");
    }

    public pupil(String name, int age, double score) {

        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("子类有参构造器被调用");
    }


    public void info() {
        System.out.println("小学生 name = " + this.name + "age = " + this.age + "score = " + this.score);
    }
}
