package com.sunnysnow.day12.demo02generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，认为是Object对象
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(3);
        Integer i = gc2.getName();
        System.out.println(i);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("零零落落");
        String name = gc3.getName();
        System.out.println(name);
    }
}
