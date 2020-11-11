package com.sunnysnow.day10.muti;

/*
    在多态的代码中，成员方法的访问规则：
        看new的是谁，就优先用谁，没有则向上找。
    口诀：
        编译看左，运行看右。

    对比：
    成员变量：编译看左边，运行还看左边
    成员方法：编译看左，运行看右
 */
public class Demo02Muti {
    public static void main(String[] args) {
        //多态
        Fu obj = new Zi();

        obj.method();   //父子都有，new的是zi，优先用子   //子类方法
        obj.methodFu(); //子类没有，父类有，向上找到父类  //父类特有方法
        //obj.methodZi();   //错误写法，fu中没有methodZi方法，所以报错
    }
}
