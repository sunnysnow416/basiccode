package com.sunnysnow.day17.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法：
    void write(char[] cbuf) 写入一个字符数组。
    abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
    void write(String str) 写一个字符串
    void write(String str, int off, int len) 写一个字符串的一部分。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\f.txt");
        //方法一：写入一个字符数组
        char[] chars = {'a','b','c','d'};
        fw.write(chars); //abcd


        //方法二：写入字符数组的一部分。
        fw.write(chars,1,2); //abcdbc

        //方法三：写一个字符串
        fw.write("你好");  //abcdbc你好

        //方法四：写一个字符串的一部分
        fw.write("你好冬天",1,2); //abcdbc你好好冬

        fw.close();
    }
}
