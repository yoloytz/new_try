package com.Chapter02.Interface;

public class Interface01 {
    public static void main(String[] args) {
        camera camera = new camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("===============");
        computer.work(camera);
    }
}
