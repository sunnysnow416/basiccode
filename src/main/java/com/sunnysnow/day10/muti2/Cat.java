package com.sunnysnow.day10.muti2;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void catchMoust(){
        System.out.println("猫抓老鼠");
    }
}
