package com.sunnysnow.day10.Interface02;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();

        Usb mouse = new Mouse(); //多态写法
        computer.useDevice(mouse);

        Keybord keybord = new Keybord();//非多态写法
        //参数是Usb,传递的是实现类对象
        computer.useDevice(keybord); //类型自动转化，正确写法

        computer.useDevice(new Mouse()); //正确写法，使用匿名对象

        computer.close();
    }
}
