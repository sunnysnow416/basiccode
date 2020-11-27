package com.sunnysnow.day18.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地（打印流的流向）
    输出语句默认再控制台输出
    再System类中有个方法setOut方法可以改变输出语句的目的地为参数传递的打印流的目的地
        static void setOut(PrintStream out) 重新分配标准输出流
 */
public class
Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\目的地是打印流.txt");
        System.setOut(ps); //改变流的目的地
        System.out.println("我是在打印流的目的地输出");


    }
}
