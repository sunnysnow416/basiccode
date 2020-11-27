package com.sunnysnow.day09.demo03;

public class Zi extends Fu {
    int num =20; //子类成员变量

    public void method(){
        int num=30;  //子类方法的局部变量
        System.out.println(num); //30 局部变量
        System.out.println(this.num); //20 本类的成员变量
        System.out.println(super.num); //10 父类的成员变量
    }
}
