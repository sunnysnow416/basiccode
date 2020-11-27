package com.sunnysnow.day10.Interface02;

public class Keybord implements Usb {
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
