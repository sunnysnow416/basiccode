package com.sunnysnow.day18.demo03.ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader 可以读取IDE默认编码格式（UTF-8）的文件
    FileReader  读取系统默认编码（GBK）会产生乱码
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\我是gbk格式的文本.txt");
        int len=0;
        char[] chars =new char[1024];
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));   //出现乱码
        }
        fr.close();
    }
}
