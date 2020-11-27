package com.sunnysnow.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/*
    接口作为方法的参数或返回值
    java.util.List正式ArrayList所实现的接口
 */
public class DemoInnerFace {
    public static void main(String[] args) {
        //左边是接口，右边是实现类，多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("小名");
        list.add("马尔扎哈");
        list.add("小名娜拉");
        return list;
    }
}
