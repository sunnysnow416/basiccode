package com.sunnysnow.day12.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口  extends Collection 接口
    Set接口特点：
        1、不允许存储重复的元素
        2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历

    有两个实现类：HashSet、TreeSet

    java.util.HashSet集合 implements Set接口
    HashSet特点：
        1、不允许存储重复的元素
        2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
        3、存储元素和取出元素的顺序有可能不一致，无序
        4、底层是hash表结构，特点，查询速度快
 */
public class Demo03Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //1.使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());  //1,2,3
        }

        System.out.println("====================");

        //2.使用增强for遍历
        for (Integer integer : set) {
            System.out.println(integer); //1,2,3
        }


    }
}
