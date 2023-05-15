package com.Chapter02.Interface;

//

public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("手机开始了工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止了工作");
    }
}
