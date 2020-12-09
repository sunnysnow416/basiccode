package com.sunnysnow.day19.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 需求：
 *      写一个"框架"，不改变任何代码的情况下，可以帮我们创建任意类的对象，并执行其中任意方法。
 * 实现：
 *      1、配置文件
 *      2、反射
 *  步骤：
 *      1、将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 *      2、在程序中加载读取配置文件
 *      3、使用反射技术加载类文件进内容
 *      4、创建对象
 *      5、执行方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1 创建properties对象
        Properties pro =new Properties();
        //1.2加载配置文件，转化为一个集合
        //1.2.1 获取class下的目录文件
        InputStream in = ReflectDemo5.class.getClassLoader().getResourceAsStream("19.properties");
        pro.load(in);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);  //est...
    }
}
