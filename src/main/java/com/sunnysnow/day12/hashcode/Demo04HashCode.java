package com.sunnysnow.day12.hashcode;

/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）
    在Object类中有一个方法，可以获取对象的哈希值：
        int hashCode(); 返回对象的哈希码值
    hashcode方法的源码：
        public native int hashCode();
        native 代表方法调用的是本地操作系统的方法
 */
public class Demo04HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        p1.toString();
        System.out.println(h1);//1020371697   //person类重写hashcode方法后，显示1

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//789451787   //person类重写hashcode方法后，显示1

        /*
            toString方法的源码
             return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1); //com.sunnysnow.day12.collecttion.Person@3cd1a2f1   //person类重写hashcode方法后，显示com.sunnysnow.day12.collecttion.Person@1
        System.out.println(p2); //com.sunnysnow.day12.collecttion.Person@2f0e140b  //person类重写hashcode方法后，显示com.sunnysnow.day12.collecttion.Person@1
        System.out.println(p1==p2);//false。虽然hashCode是一样的，但实际物理地址是不相等的

        /*
            String 类的哈希值
                String类重写了Object的hashCode方法
         */
        String s1 =new String("abc");
        String s2 =new String("abc");
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354

        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
    }
}
