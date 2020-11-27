package com.sunnysnow.day11.finaldemo;
/*
    对于成员变量来说，如果用final关键字修饰，那么这个变量也不可变
    1、由于成员变量有默认值，所以用了final后，必须手动赋值
    2、对于final的变量，要么直接赋值，要么使用构造方法赋值。二者选其一
    3、必须保证类当中所有的重载的构造方法，都最终会对final的衬衣变量进行赋值。
 */
public class Person {
    //private final String name ; //错误写法，没有赋值

    private final String name ="鹿晗"; //如果直接赋值，则构造方法中赋值的和set方法都会报错，不可以同时使用
    public Person() {
    }

//    public Person(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
