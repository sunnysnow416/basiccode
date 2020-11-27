package com.sunnysnow.day09.demo06;

/*
    什么情况下会使用覆盖重写：
        对于已经投入使用的类，尽量不要进行修改，推荐定义一个新的类，来重复利用其中共性内容，并且添加改动新内容。
 */
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();  //重复利用父类的方法
        System.out.println("显示姓名"); //添加子类新方法
        System.out.println("显示头像"); //添加子类新方法
    }
}
