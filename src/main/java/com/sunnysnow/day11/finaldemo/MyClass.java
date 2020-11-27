package com.sunnysnow.day11.finaldemo;
/*
    当final关键字用来修饰一个类
    格式：
    public final class 类名称{
    //...
    }
    含义：当前这个子类不能有任何子类，太监类。
    注意：如果一个类是final。那么其中所有的成员方法都无法进行覆盖重写（因为没儿子）
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
