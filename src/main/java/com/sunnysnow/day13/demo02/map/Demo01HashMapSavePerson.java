package com.sunnysnow.day13.demo02.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap 存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素必须重写hashCode方法和equals方法，保证key唯一。

 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
        HashMap 存储自定义类型键值
        key:使用Person类型
            Person类必须重写hashCode和equals方法，保证key是唯一的
        value：可以重复
        要求同名和同龄的人看做是同一个人
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",55),"秦国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //使用entryset和增强for遍历map
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"----"+value);
        }


    }

    /*
        HashMap 存储自定义类型键值
        key:String类型
            String类已经重写了hashCode方法和equals方法，保证key唯一。
        value：Person类型
            value：可以重复（同名同年龄的人视为重复）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person> map = new HashMap<>();
        //往集合添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18)); //会把第一个北京的值替换掉
        //遍历map集合,使用增强for
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"=="+value);
        }
    }
}
