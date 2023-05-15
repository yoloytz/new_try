package com.xiaoyun;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("云天泽",20);
        System.out.println(person.say());
        Student student = new Student("张美美",24,981104,100);
        System.out.println(student.say());
        System.out.println(student.say2());

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "我是 " + this.name + "   我今年"  + age + "岁了";
    }
}

class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return "我是 " + getName() + "   我今年年"  + getAge() + "岁了" + "我的id为 "
                + id + "我的分数是  " + score;
    }

    public String say2(){
         return super.say();
    }
}
