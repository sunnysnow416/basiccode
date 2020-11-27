package com.sunnysnow.day11.finaldemo;

/*
    final 关键字代表最终的，不可改变的
    常见的四种用法：
    1、可以用来修饰一个类
    2、可以用来修饰一方法
    3、可以用来修饰局部变量
    4、可以用来修饰成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 =10;
        System.out.println(num1); //10
        num1 = 20;
        System.out.println(num1); //20
        //一旦使用final修饰局部变量，那么这个局部变量不能进行更改。一次赋值，终生不变
        final  int num2 =200;
        System.out.println(num2);  //200
        //num2=300;//错误写法，不能改变
        //num2 =200; //错误写法

        final  int num3;
        num3=30; //正确写法，只要保证有唯一一次正确赋值即可

        //对于基本类型来说，不可变说的是变量当中的具体数值不可变
        //对于引用类型来说，不可变说的是变量当中的地址值不可变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1.getName());//赵丽颖
        stu1=new Student("霍建华");
        System.out.println(stu1.getName());//霍建华   这两次的地址值改变

        final Student  stu2 = new Student("高圆圆");
        System.out.println(stu2.getName());//高圆圆
        //stu2=new Student("张三");//错误写法,地址值不可变
        stu2.setName("高扁扁");
        System.out.println(stu2.getName());//高扁扁，值是可以变的
    }
}
