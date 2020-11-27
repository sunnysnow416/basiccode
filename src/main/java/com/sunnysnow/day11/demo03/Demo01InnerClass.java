package com.sunnysnow.day11.demo03;

/*
    内部类概念：
     如果一个事物的内部含另一个事物，那么则就是一个类内部包含另一个类。
     例如；身体和心脏的关系，又如汽车和发动机的关系
    分类：
        1、成员内部类
        2、局部内部类（包含匿名内部类）

    成员内部类的定义格式“
        修饰符 class 外部类名称{
            修饰符 class 内部类名称{
                 // ...
            }
            //...
        }
     注意：内用外，可以随意访问。外用内一定需要借助内部类对象。
     ============================================================
     如何使用成员内部类：有两种方式：
     1、间接方式：在外部类的方法中使用内部类，然后main只是调用外部类的方法
     2、直接方式：公式：
     类名称 对象名 = new 类名称();
     【外部类名称.内部类名称 对象名 =new 外部类名称().new 内部类名称();】
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody(); //在外部类的方法中使用内部类，然后main只是调用外部类的方法

        System.out.println("============================");
        Body.Heart heart = new Body().new Heart();  //直接方式,按公式写
        heart.beat();
    }
}
