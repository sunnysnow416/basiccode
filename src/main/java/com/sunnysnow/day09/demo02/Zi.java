package com.sunnysnow.day09.demo02;

public class Zi extends Fu {
    int numZi = 20;
    int num =200;

    public void  methodZi(){
        //因为本类中有num，所以用的是本类的
        System.out.println(num);
    }

}
