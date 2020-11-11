package com.sunnysnow.day10.abstractDemo03;

public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();//错误写法，抽象类不能直接new对象
        //Dog dog = new Dog() ;//错误写法，抽象类不能直接new对象
        GoldenDog goldenDog = new GoldenDog();
        goldenDog.sleep();//呼呼呼。。。
        goldenDog.eat(); //狗吃骨头

        ErHaDog erHaDog = new ErHaDog();
        erHaDog.sleep(); //嘿嘿嘿。。。
        erHaDog.eat(); //狗吃骨头
    }
}
