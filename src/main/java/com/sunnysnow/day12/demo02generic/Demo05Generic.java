package com.sunnysnow.day12.demo02generic;

import java.util.ArrayList;

/*
    泛型的通配符：
        ?:代表任意的数据类型
    使用方式：
        不能创建对象使用，只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        //ArrayList<?> list03 = new ArrayList<?>();//错误写法，不能定义，只能做参数使用
    }

    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        不知道ArrayList集合到底使用什么数据类型，可以使用泛型的通配符来接收数据类型
        泛型是没有继承概念的，不能写Object，要写成?
     */
    public static void printArray(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
