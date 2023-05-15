package com.Chapter02.Interface;

public class camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("camera停止了工作");
    }
}
