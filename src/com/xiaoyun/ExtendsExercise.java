package com.xiaoyun;

import java.util.Scanner;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("I9","16G","512G",1,"联想");
        NotePad notePad = new NotePad("M1","8G","128G",2,"白色");
        pc.setBarnd("华硕");
        notePad.setColor("黑色");
//        pc.setInformation();
//        System.out.println(pc.getDetails());
        System.out.println("PC的信息为"   +  pc.Text1());
        System.out.println("notePad的信息为"   +  notePad.Text2());

    }

}

class Computer{


        private String Cpu;
        private String Memory;
        private String HardDisk;
        private int age;

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer(){

    }

    public Computer(String cpu, String memory, String hardDisk, int age) {
        this.Cpu = cpu;
        this.Memory = memory;
        this.HardDisk = hardDisk;
        this.age = age;
    }

    public String getDetails(){
        return "Cpu" + this.Cpu + "\t" + "Memory" + this.Memory + "\t" + "HardDisk" +
                this.HardDisk + "\t" + "age" + "\t" + this. age ;

    }

}

class PC extends Computer{
    Scanner mySCanner = new Scanner(System.in);
        String Barnd;

    public String getBarnd() {
        return Barnd;
    }

    public void setBarnd(String barnd) {
        Barnd = barnd;
    }

    public PC(String cpu, String memory, String hardDisk, int age, String barnd) {
        super(cpu, memory, hardDisk, age);
        Barnd = barnd;
    }

//    public void setInformation(){
//        System.out.println("请依次输入信息：Cpu、memory、HardDisk、age、Brand");
//        this.Cpu = mySCanner.next();
//        this.Memory = mySCanner.next();
//        this.HardDisk = mySCanner.next();
//        this.age = mySCanner.nextInt();
//        this.Barnd= mySCanner.next();
//
//    }

    public String Text1(){
        return getDetails() +"     " + "ComputerBrand" + "\t" + this.Barnd;
    }
}

class NotePad extends Computer{
    Scanner mySCanner = new Scanner(System.in);
    private String color;

    public NotePad(String cpu, String memory, String hardDisk, int age, String color) {
        super(cpu, memory, hardDisk, age);
        this.color = color;
    }

    //    public void setInformation() {
//        System.out.println("请依次输入信息：Cpu、memory、HardDisk、age、Brand");
//        this.Cpu = mySCanner.next();
//        this.Memory = mySCanner.next();
//        this.HardDisk = mySCanner.next();
//        this.age = mySCanner.nextInt();
//    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String Text2(){
        return getDetails() + " color   " + this.color;
    }
}
