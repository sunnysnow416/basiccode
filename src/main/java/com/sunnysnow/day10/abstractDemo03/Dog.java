package com.sunnysnow.day10.abstractDemo03;

/*
    抽象类的子类，必须重写重写父类中所有的抽象方法，否则子类也必须是抽象类。
 */
public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    //没有覆盖重写父类的抽象方法sleep。
    //所以这个类只能是抽象类
}
