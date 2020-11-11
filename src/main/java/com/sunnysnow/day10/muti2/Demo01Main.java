package com.sunnysnow.day10.muti2;
/*
    向上转型一定是安全的，没有问题的，正确的，但是也有一个弊端
    对象一旦向上转型为父类，就无法调用子类特有的方法。
    解决方法：
        用对象的向下转型，还原
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类应用只想子类对象
        Animal animal = new Cat();
        animal.eat();  //猫吃鱼

        //animal.catchMoust();//错误写法

        //向下转型，进行还原
        Cat cat = (Cat) animal;
        cat.catchMoust();   //猫抓老鼠

        //下面是错误的向下转型
        //本来new的时候是猫，非要还原为狗
        Dog dog=(Dog)animal;   //ClassCastException 类转换异常
        dog.watchHouse();
    }

}
