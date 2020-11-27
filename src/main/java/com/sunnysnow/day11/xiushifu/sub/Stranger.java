package com.sunnysnow.day11.xiushifu.sub;

import com.sunnysnow.day11.xiushifu.MyClass;

public class Stranger {
    public void strange(){
        System.out.println(new MyClass().num4); //不同包非子类，只能访问public
    }
}
