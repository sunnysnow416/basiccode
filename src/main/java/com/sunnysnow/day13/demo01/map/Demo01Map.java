package com.sunnysnow.day13.demo01.map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util Interface Map<K,V> 集合
    Map集合的特点：
        1、Map集合是一个双列集合，一个元素包含两个值（一个是key，一个value）
        2、Map集合中的元素，key和value的数据类型可以相同，也可以不同。
        3、Map集合中的元素，key是不允许重复的，value是可以重复的
        4、Map集合中的元素，key和value是一一对应的。

    java.util.HashMap<K,V>集合  implements Map<K,V>接口
        HashMap特点：
             1、HashMap集合底层是哈希表，查询速度特别快。
                  jdk1.8之前，数组+单向链表
                  jdk1.8之后，数组+单向链表/红黑树（链表长度超过8，变成红黑树，提高查询速度）
             2、HashMap集合是一个无序集合，存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<K,V> 集合 extends HashMap<K,V>集合
        LinkedHashMap特点：
             1、LinkedHashMap集合，底层是哈希表+链表（保证迭代的顺序）
             2、LinkedHashMap集合，是一个有序的集合，存储元素和取出元素的顺序是一致的。
   Map集合的常用方法：
        public V put(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
        public V remove(Object key) 如果存在（从可选的操作），从该地图中删除一个键的映射。
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
        public boolean containsKey(Object key) 判断集合中是否包含指定的元素.
            包含返回true，不包含返回false
     */
    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1); //true
        boolean b2 = map.containsKey("赵丽颖2");
        System.out.println(b2); //false

    }

    /*
        public V get(Object key) 根据指定的键，获取对应的值
        返回值：V
            如果key存在，返回对应的值；
            如果key不存在，返回null
     */
    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Integer v1 = map.get("赵丽颖");
        System.out.println(v1); //168
        Integer v2 = map.get("赵丽颖2");
        System.out.println(v2); //null 没有这个元素
    }

    /*
        public V remove(Object key) 把指定的键所对应的键值对元素在Map集合中删除，返回被删除的元素值
        返回值：V
            如果key存在，V返回被删除的值
            如果key不存在，V返回null
     */
    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println(v1); //178
        System.out.println(map);//{赵丽颖=168, 杨颖=165}

        //int v2 = map.remove("林志颖"); //可以用int接收，自动拆箱，如果返回空会报NullPointerException，应该使用包装类
        Integer v2 = map.remove("林志颖");
        System.out.println(v2);//null
        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

    /*
        public V put(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
            返回值：V
                存储键值对的时候，key不重复，返回值V是null；
                存储键值对的时候，key重复，会使用新的value替换map中重复的value值，返回被替换的value值.
                一般情况下返回值无需接收
     */
    private static void show01() {
        //创建map集合，使用多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1); //null
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2); //范冰冰1
        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷风","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","龙小云");
        System.out.println(map);//{杨过=小龙女, 尹志平=龙小云, 李晨=范冰冰2, 冷风=龙小云}

    }
}
