package com.sunnysnow.day13.demo03.map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V> 集合 implements Map<K,V>接口
    Hashtable集合，底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢。
    HashMap集合，底层是一个哈希表，是一个线程不安全的集合，多线程集合，速度快。

    HashMap集合（之前学的所有集合）：可以存储null值，null键
    Hashtable集合：不能存储null值，null键

    Hashtable和Vector集合一样，在jdk1.2之后被更先进的集合（ArrayList和hashMap）替代了。
    Hashtable的子类Properties依然活跃使用
    Properties集合是唯一和IO流形结合的集合。
 */
public class Demo02HashTable {
    public static void main(String[] args) {
        //创建一个Hashtable集合
        HashMap<String,String> map =new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null); //将上面的null取代
        System.out.println(map); //{null=null, b=null}

        //创建一个Hashtable集合
        Hashtable<String,String> table =new Hashtable<>();
        //table.put(null,"a"); //NullPointerException
        //table.put("b",null); //NullPointerException
        //table.put(null,null); //NullPointerException
        table.put("a","a");
        System.out.println(table);//{a=a}
    }
}
