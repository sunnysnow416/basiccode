package com.sunnysnow.day09.demo05;
/*
    方法的覆盖重写的注意事项：
        1、必须保证父子类之间方法的名称相同，参数列表也相同
            @Override 写在方法前面，用来检测是不是有效的正确覆盖重写。
            这个注解即使不写，也是正确的覆盖重写。是安全检测
        2、子类方法的返回值，必须小于等于父类方法的返回值范围。
            扩展提示：Java.lang.Object类是所有类的公共最高父类（祖宗类）,Java.long.String就是Object的子类
        3、子类方法的权限，必须大于等于父类方法的权限修饰符
            扩展提示：public>protected>(default)>private
            (default)不是default关键字，而是什么都不写
        2、3了解即可，一般情况下返回值和权限都是相等的。
    什么情况下会使用覆盖重写：
        对于已经投入使用的类，尽量不要进行修改，推荐定义一个新的类，来重复利用其中共性内容，并且添加改动新内容。
 */
public class Demo01Override {
}
