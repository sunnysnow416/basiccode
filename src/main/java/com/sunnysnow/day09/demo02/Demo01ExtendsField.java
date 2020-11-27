package com.sunnysnow.day09.demo02;

/*
    继承中成员变量的访问特点：
    当父子的集成关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
    1、直接通过子类对象访问成员变量：
        等号左边是谁，优先用谁，没有则向上找。
    2、间接通过成员方法，访问成员变量：
        方法属于谁，就优先用谁，没有则向上找
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu =new Fu(); //创建父类
        System.out.println(fu.numFu); // 10 ，只能使用父类的东西，没有任何子类的内容

        Zi zi =new Zi();
        System.out.println(zi.numFu);// 10 直接访问，子类没有，向上找
        System.out.println(zi.numZi);// 20
        System.out.println(zi.num); //200  直接访问，优先子类

        zi.methodZi();//200  这个方法是子类的，优先用子类的，没有再向上找
        zi.methodFu();//100  这个方法是父类定义的，
     }
}
