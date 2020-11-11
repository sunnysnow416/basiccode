package com.sunnysnow.day10.abstractDemo02;

public class Zi extends Fu{
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }

    public Zi(){
        //super();
        System.out.println("子类构造方法执行！");
    }
}
