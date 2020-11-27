package com.sunnysnow.day12.demo05.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections  是集合工具类，用来对集合进行操作，部分方法如下：
        static <T> void sort(List<T> list) 将集合中元素使用默认规则排序，默认升序。
    注意事项：
        sort(List<T> list)使用前提：
        被排序的集合里存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则
    Comparable排序规则：
        自己（this）-参数：升序
        参数-自己（this）：降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01); //[1, 3, 2] ArrayList是有序集合，存的是132，取的也是132

        Collections.sort(list01); //默认升序
        System.out.println(list01); //[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02); //[a, c, b]
        Collections.sort(list02);
        System.out.println(list02); //[a, b, c]

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张安",18));
        list03.add(new Person("李四",20));
        list03.add(new Person("王五",15));
        System.out.println(list03); //[Person{name='张安', age=18}, Person{name='李四', age=20}, Person{name='王五', age=15}]
        Collections.sort(list03);
        System.out.println(list03);//[Person{name='王五', age=15}, Person{name='张安', age=18}, Person{name='李四', age=20}]


    }
}
