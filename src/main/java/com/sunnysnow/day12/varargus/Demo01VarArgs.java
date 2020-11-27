package com.sunnysnow.day12.varargus;

/*
    可变参数：是jdk1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数个数不确定，就可使用可变参数
    使用个数：定义方法时使用
        修饰符 返回值类型 方法名（数据类型...变量名）{}
    可变参数的原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数可以是0（不传递），1，2,3...多个
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10,20,67);
        System.out.println(i);
    }
    /*
        定义计算（0-n）个整数的和
        已知：计算整数的和，数据类型是int
        不知道：参数个数不确定
     */
    public static int add(int...arr){
        //System.out.println(arr); //是一个数组
        //System.out.println(arr.length); //数组的长度
        int num =0;
        for (int i : arr) {
           num = num+i ;
        }
        return num;
    }

    /*
    //定义一个方法，计算两个整数的和
    public static int  add(int a,int b){
        return a+b;
    }

    //定义一个方法，计算三个整数的和
    public static int  add(int a,int b,int c){
        return a+b+c;
    }
     */
}
