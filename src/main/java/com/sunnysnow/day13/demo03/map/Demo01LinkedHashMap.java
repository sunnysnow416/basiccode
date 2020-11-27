package com.sunnysnow.day13.demo03.map;

import com.sunnysnow.day13.demo02.map.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链表实现，具有可预测的迭代次序。
    底层原理：
        哈希表+链表（记录元素顺序：有序集合）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String,String> map = new HashMap<>();
        map.put("a","aa");
        map.put("c","cc");
        map.put("b","bb");
        map.put("a","dd"); //将原来的替换掉了
        System.out.println(map); //{a=dd, b=bb, c=cc}  无序集合，存和取的顺序有可能不一致

        //创建LinkedHashMap集合
        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","aa");
        linked.put("c","cc");
        linked.put("b","bb");
        linked.put("a","dd");//将原来的替换掉了
        System.out.println(linked);//{a=dd, c=cc, b=bb}  key不允许重复，存和取的顺序一致。有序集合
    }
}
