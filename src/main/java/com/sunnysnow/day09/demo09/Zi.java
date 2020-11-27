package com.sunnysnow.day09.demo09;

/*
    super关键字用来访问父类内容，this关键字用来访问本类内容。
    1、在本类的成员方法中，访问本类的成员变量。
    2、在本类的成员方法中，访问另一个本类的成员方法
    3、在本来的构造方法中，访问另一个构造方法
        在第三种用法中要注意：
        A. this(...)调用也必须是构造方法的第一个语句
        B. super和this两种构造调用，不能同时使用

 */
public class Zi extends Fu {
    int num =20;

    public Zi(){
        //super(); //super和this两种构造调用，不能同时使用.这一行不再赠送
        this(123);//本类的无参构造调用本类的有参构造
        //this(123,11);  //错误写法，必须是构造方法的第一个语句，只能是第一个语句
    }
    public Zi(int n){
        this(123,11);
    }
    public Zi(int num,int m){
        //this();错误写法，不能循环调用没完没了
    }

    public void showNum(){
        int num =10;
        System.out.println(num);  //10 局部变量
        System.out.println(this.num);  //20 本类的成员变量
        System.out.println(super.num); //30 父类的成员变量
    }

    public void methondA(){
        System.out.println("A方法执行");
    }
    public void methondB(){
        this.methondA();  //访问本类的成员方法
        System.out.println("B方法执行");
    }
}
