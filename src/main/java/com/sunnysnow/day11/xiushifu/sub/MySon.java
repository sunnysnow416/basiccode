package com.sunnysnow.day11.xiushifu.sub;

import com.sunnysnow.day11.xiushifu.MyClass;

public class MySon extends MyClass {
    public void method3(){
        System.out.println(super.num3); //不同包子类，能访问protected
        System.out.println(super.num4);//不同包子类，能访问public
    }
}
