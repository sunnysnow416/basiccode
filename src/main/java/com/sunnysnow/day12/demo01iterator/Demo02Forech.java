package com.sunnysnow.day12.demo01iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强for循环，底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    jdk1.5之后出现的新特性
    public interface Collection<E> extends Iterable<E>  所有的单列集合都可以使用增强for
    public interface Iterator<E> 实现这个接口，允许对象成为foreach语句的目标

    增强for循环，用来遍历集合/数组
    格式：
        for(集合/数组的数据类型 变量名：集合/数组){
            sout(变量名);
        }
 */
public class Demo02Forech {
    public static void main(String[] args) {
        demo02();
    }

    //使用for循环遍历一个集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("尚三");
        list.add("李四");
        list.add("王五");
        for (String s : list) {
            System.out.println(s);
        }
    }

    //使用for循环遍历一个数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
