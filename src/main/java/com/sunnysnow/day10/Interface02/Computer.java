package com.sunnysnow.day10.Interface02;

public class Computer {
    public void open(){
        System.out.println("打开电脑");
    }

    public void close(){
        System.out.println("关闭电脑");
    }

    public void useDevice(Usb usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if(usb instanceof Keybord){
            ((Keybord) usb).type();
        }
        usb.closeDevice();
    }
}
