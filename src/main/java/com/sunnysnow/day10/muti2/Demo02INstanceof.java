package com.sunnysnow.day10.muti2;
/*
如何才能知道应付类引用的对象，本来是什么子类?
格式：
对象 instanceof 类型
这将得到一个boolean值结果，也就是判断前面的对象能不能当做后面类的实例。
 */
public class Demo02INstanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//猫吃鱼

        //如果希望调用子类特有方法，则需要向下转型
        //判断下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        //判断下父类引用animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMoust();
        }

        giveMeAPet(animal);
    }

    private static void giveMeAPet(Animal animal) {
        //如果希望调用子类特有方法，则需要向下转型
        //判断下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        //判断下父类引用animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMoust();
        }
    }
}
