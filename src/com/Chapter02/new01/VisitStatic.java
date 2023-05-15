package com.Chapter02.new01;


public class VisitStatic {


    public static void main(String[] args) {

//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        System.out.println(args[0]);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Student tom = new Student("tom");
        tom.payFee(100);

        Student mary = new Student("mary");
        mary.payFee(200);

        Student.showFee();


    }

}

class Student{
    private String name;
    private static double fee;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double Fee){
        Student.fee += Fee;
        //累计学费
    }

    public static void showFee(){
        System.out.println("总学费 " + fee);
    }
}
