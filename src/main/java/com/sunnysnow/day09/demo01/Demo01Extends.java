package com.sunnysnow.day09.demo01;
/*
    在继承关系中，“子类就是一个父类”也就是说子类可以被当做父类看待。
    例如父类是员工，紫雷水讲师。那么“讲师就是一个员工”，is -a
    定义父类的格式：（一个普通的类定义）
        public Class 父类名称{
            //...
        }
    定义子类的格式：
        public Class 子类名称 extends 父类名称{
            //...
        }
    好处：代码复用
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher= new Teacher();
        //Teacher类当中虽然什么都没写，三十会集成来自父类的method01方法。
        teacher.method01();  //父类方法执行！

        Assistant ass = new Assistant();
        ass.method01(); //父类方法执行！
    }
}
