package com.sunnysnow.day11.xiushifu;

public class MyAnother {
    public void method(){
        MyClass myClass =new MyClass();
       // System.out.println(myClass.num); //错误，不能引用同一个包下其他类中private修饰的变量
        System.out.println(myClass.num2);
        System.out.println(myClass.num3);
        System.out.println(myClass.num4);
    }
}
