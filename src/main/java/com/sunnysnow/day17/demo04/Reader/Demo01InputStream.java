package com.sunnysnow.day17.demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文
    1个中文
        GBK:占用两个字节
        UTF-8:占用三个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\c.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.println((char)len); //中文产生乱码，所以使用字符流读取中文。
        }
        fis.close();
    }
}
