package com.sunnysnow.day09.demo07;

public class Zi extends Fu{
    //情况一
//    public Zi(){
//        //super(); 在调用父类无参构造方法，写不写都默认存在
//        System.out.println("子类构造方法");
//    }

    //情况二
    public Zi(){
        super(10);  //调用父类重载的有参构造方法
        System.out.println("子类构造方法");
    }

    public void method(){
        //super();//错误写法！只有子类构造方法，才能调用父类构造方法
    }
}
