package com.sunnysnow.day12.demo05.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections  是集合工具类，用来对集合进行操作，部分方法如下：
        static <T> boolean addAll(Collection<? super T> c, T... elements) 将所有指定的元素添加到指定的集合。
        static void shuffle(List<?> list) 使用默认的随机源随机排列指定的列表。

 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
         */

        //static <T> boolean addAll(Collection<? super T> c, T... elements) 将所有指定的元素添加到指定的集合。
        //静态方法，类直接调用
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);//[a, b, c, d, e]

        //static void shuffle(List<?> list) 使用默认的随机源随机排列指定的列表。
        Collections.shuffle(list);
        System.out.println(list); //[a, b, d, c]  每次执行结果都不一样，打乱集合中元素的顺序

    }
}
