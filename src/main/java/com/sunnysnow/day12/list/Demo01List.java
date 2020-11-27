package com.sunnysnow.day12.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection
    list接口的特点：
        1、有序的集合，存储元素和取出的元素的顺序是一直的，存123，取出123
        2、有索引，包含一些带索引的方法
        3、允许存储重复元素
   list接口中带索引的方法（特有）：
        public void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
        public E get(int index) 返回此列表中指定位置的元素。
        public E remove(int index) 删除该列表中指定位置的元素（可选操作）。
        public E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。
    注意事项：
    操作索引的时候一定要防止索引越界异常。
    IndexOutOfBoundsException ：索引越界异常，一般集合会报
    ArrayIndexOutofBoundsEcption:数组索引越界异常
    StringIndexOutofBoundsEcption:字符串索引越界异常

    java.util.ArrayList集合：
    数据存储的结构是数组结构。元素增删慢，查询快。
    由于日常开发中使用最多的功能未查询数据，遍历数据，所以ArrayList是最常用的集合。

    Vector集合：作为了解即可
    底层数据结构：数组。已经被ArrayList取代不用。
    是同步的--单线程的，效率较慢

 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个list集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法先集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//[a, b, c, d, a] 运行存储重复的元素，重写了toString方法

        //public void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
        //向c和d之间添加sunnysnow
        list.add(3,"sunnysnow");
        System.out.println(list); //[a, b, c, sunnysnow, d, a]

        // public E remove(int index) 删除该列表中指定位置的元素（可选操作）。
        //移除c元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素是："+removeE); //c
        System.out.println(list);//[a, b, sunnysnow, d, a]

        //public E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。
        //把最后一个a替换未A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是："+setE); //a
        System.out.println(list); //[a, b, sunnysnow, d, A]

        // public E get(int index) 返回此列表中指定位置的元素。
        //list集合遍历有三种方式：
        //1、普通for循环
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("==================");
        //2.使用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }
        System.out.println("==================");

        //3.增强for进行遍历
        for (String s : list) {
            System.out.println(s);
        }

        //防止索引越界异常
        String ss = list.get(100);
        System.out.println(ss);  //IndexOutOfBoundsException

    }
}
