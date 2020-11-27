package com.sunnysnow.day13.demo04.JDK9;

import java.util.List;

/*
    jdk9的新特性：
        List接口、Set接口、Map接口，增加了一个静态的方法of，可给集合一次性添加多个元素。
        使用前提：
            当集合中存储的元素的个数已经确定了，不再改变时使用。
        注意事项：
            1、of方法只适用于List接口、Set接口、Map接口，不适用于接口的实现类
            2、of方法的返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，会抛出异常
            3、Set接口和Map接口再调用of方法的时候，不能有重复的元素，否则也会抛出异常。
 */
public class Demo01JDK9 {
    public static void main(String[] args) {

    }
}
