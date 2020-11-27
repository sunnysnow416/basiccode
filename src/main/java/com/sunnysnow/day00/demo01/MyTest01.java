package com.sunnysnow.day00.demo01;

import java.net.URL;

public class MyTest01 {
    public static void main(String[] args) {

        System.out.println(MyTest01.class.getResource("")); //file:/E:/eclipse/IJworkspace/allitems/basiccode/target/classes/com/sunnysnow/day00/demo01/
        System.out.println(MyTest01.class.getResource("/")); //file:/E:/eclipse/IJworkspace/allitems/basiccode/target/classes/
        System.out.println(MyTest01.class.getClassLoader().getResource("")); //file:/E:/eclipse/IJworkspace/allitems/basiccode/target/classes/

    }
}
