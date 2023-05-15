package com.encap;

import java.util.Scanner;


public class AccountTest {
    public static void main(String[] args) {
        Account ytz = new Account();
        ytz.setName("云天泽12");
        ytz.setBalance(2000);
//        System.out.println(ytz.iofo());
        System.out.println(ytz.getBalance());
    }

}

class Account{
    Scanner myScanner = new Scanner(System.in);
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int x = name.length();
        if(x >= 2 && x <= 4){
            this.name = name;
        }else{
            this.name = "错误姓名";
        }

    }

    public double getBalance() {
        System.out.println("请输入密码");
        String x = myScanner.next();
        if (x.equals("123456")){
            return balance;
        }else {
            System.out.println("密码错误");
            return -1;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String iofo(){
        return "姓名为  " + this.name + "\n" +  "余额为  " + this.balance;
    }
}