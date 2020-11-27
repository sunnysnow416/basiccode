package com.sunnysnow.day11.finaldemo;

public class Person2 {
    private final String name;

    public Person2() {
        //通过构造赋值，则set不能再进行赋值，去掉
        name="赵丽颖";
    }

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
