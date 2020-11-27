package com.sunnysnow.day13.demo01.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map.Entry<K,V>在Map接口中有一个内部接口Entry
        作用：当Map集合一创建，则会在Map集合中创建一个Entry对象，用来记录键与值（键值对对象，键与值的映射关系）-->结婚证

    Map集合中的第二种遍历方式：使用Entry对象遍历
    Map集合中的方法：
        Set<Map.Entry<K,V>> entrySet()  返回此映射中包含映射关系的set视图
   实现步骤：
    1、使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个set集合中
    2、遍历set集合，获取每一个Entry对象
    3、使用Entry对象的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        //1、使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //2、遍历set集合，获取每一个Entry对象
        //方式一:迭代器遍历
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"=="+value);
        }
        //方式一:增强for遍历
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"=="+value);
        }
    }
}
