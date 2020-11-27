package com.sunnysnow.day11.demo04;

/*
    局部内部类的final问题
    局部内部类，如果希望访问所在方法的局部便令，那么这个局部变量必须是【有效final的】
    从java8+开始，主要局部变量事实不变，那么final关键字可以省略。
    原因：
        1、new出来的对象再堆内存中，
        2、局部变量是跟着方法走的，再栈内存中
        3、方法运行结束后，立刻出栈，局部变量就会立刻消失
        4、new出来的对象会在堆中持续存在，直到垃圾回收

 */
public class MyOuter {
    public void methodOuter(){
        int num =10; //所在方法的局部变量

        class myInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
