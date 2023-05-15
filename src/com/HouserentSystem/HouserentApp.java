package com.HouserentSystem;

import com.HouserentSystem.View.MainMenu;

public class HouserentApp {
    public static void main(String[] args) {
        //创建house view的对象
        //是整个程序的入口
        new MainMenu().mainMenu();
        System.out.println("===你退出的房屋出租系统===");
    }
}
