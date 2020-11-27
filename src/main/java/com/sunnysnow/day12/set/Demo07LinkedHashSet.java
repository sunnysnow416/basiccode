package com.sunnysnow.day12.set;

import java.util.HashSet;
import java.util.LinkedList;

/*
    java.util.LinkedHashSet集合 extends HashSet
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表，多了一条链表，用来记录元素的存储顺序，保证元素有序
 */
public class Demo07LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("sunnysnow");
        set.add("www");
        System.out.println(set); //[sunnysnow, abc, www]  无序，不允许重复

        LinkedList<String> linkedSet = new LinkedList<>();
        linkedSet.add("abc");
        linkedSet.add("sunnysnow");
        linkedSet.add("www");
        System.out.println(linkedSet); //[abc, sunnysnow, www] 有序，不允许重复


    }
}
