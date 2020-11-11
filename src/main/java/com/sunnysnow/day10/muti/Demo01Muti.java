package com.sunnysnow.day10.muti;

/*
    访问成员变量有两种方式：
    1、直接通过对象名称访问成员变量，看等号左边是谁，没有则向上找。
    2、间接通过成员方法访问。看该方法属于谁，优先用谁，没有则向上找。
 */
public class Demo01Muti {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象。
        // 1、直接通过对象名称访问成员变量，看等号左边是谁，没有则向上找。
        Fu obj = new Zi();
        System.out.println(obj.num);  //fu 10
        //obj.age;   //错误写法

        //2、间接通过成员方法访问。看该方法属于谁，优先用谁，没有则向上找。
        obj.showNum();  //如果子类中没有覆盖重写showNum方法，只有父类有，则显示 10.
                        //如果子类覆盖重写了showNum方法，则显示 20
    }

}
