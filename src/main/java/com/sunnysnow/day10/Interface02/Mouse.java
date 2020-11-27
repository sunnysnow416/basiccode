package com.sunnysnow.day10.Interface02;

public class Mouse implements Usb {
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
