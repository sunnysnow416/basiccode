package com.sunnysnow.day10.muti;

public class Zi extends Fu {
    int num =20;
    int age =16;

    public void showNum(){
        System.out.println(num);
    }

    @Override
    public void  method(){
        System.out.println("子类方法");
    }

    public void  methodZi(){
        System.out.println("子类特有方法");
    }
}
