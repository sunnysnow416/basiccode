package com.sunnysnow.day12.set;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理：
    Set集合再调用add方法的时候，add方法会调用方法的hashCode方法和equels方法。
    前提：存储的元素，必须重写hashCode方法和equals方法
 */
public class Demo05HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set); //[重地, 通话, abc]

        /*
            1、add方法会调用s1的hashCode方法，计算字符串“abc”的哈希值963524.
            在集合中找有没有96354这个哈希值的元素，发现没有，就会把s1存储到集合中。
            2、add方法会调用s2的hashCode方法，计算字符串“abc”的哈希值963524.
            在集合中找有没有96354这个哈希值的元素，发现有（哈希冲突），
            s2会调用equals方法和哈希值相同的元素进行比较，s2.equals(s1),返回true，
            两个元素的哈希值相同，equals方法返回true，就认定两个元素相同，不会把s2存储到集合中。
            3、add方法会调用“重地”的hashCode方法，计算字符串“重地”的哈希值1179395，
            在集合中找有没有1179395这个哈希值的元素，发现没有，就会把“重地”存储到集合中。
            4、add方法会调用“通话”的hashCode方法，计算字符串“通话”的哈希值1179395.
            在集合中找有没有1179395这个哈希值的元素，发现有（哈希冲突），
            “通话”会调用equals方法和哈希值相同的元素进行比较，“通话”.equals(“重地”),返回false，
            就认定两个元素不相同，不会把“通话”存储到集合中。
         */

    }
}
