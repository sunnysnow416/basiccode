package com.sunnysnow.day09.demo08;
/*
    super关键字的用法有三种：
    1、在子类的成员方法中，访问父类的成员变量
    2、在子类的成员方法中，访问父类的成员方法
    3、在子类的构造方法中，访问父类的构造方法
 */
public class Zi  extends Fu{
    int num =20;
    public Zi(){
        super();  //访问父类的构造方法
    }

    public void methodZi(){
        System.out.println(num); //20
        System.out.println(super.num);  //10 父类的成员变量num
    }

    public void method(){
        super.method(); //访问父类的成员方法method
        System.out.println("子类类方法");
    }
}
