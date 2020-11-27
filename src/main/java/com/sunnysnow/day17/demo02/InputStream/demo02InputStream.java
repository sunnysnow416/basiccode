package com.sunnysnow.day17.demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
    字节输入流一次读取多个字节的方法：
    int read(byte[] b) ：从该输入流读取最多 b.length个字节的数据为字节数组。
    int read(byte[] b, int off, int len) :从该输入流读取最多 len字节的数据为字节数组。
    明确两件事：
        1、方法中byte[] b的作用？
            起到缓冲作用，存储每次读取到的多个字节.
            一把你定义为1024（1kb）或者1024的整数倍
        2、方法的返回值int是什么？
            每次读取到的有效个数
 */
public class demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\a.txt"));
//        byte[] bytes =new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len);
//        //System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
        int len=0;
        byte[] bytes =new byte[1024];
        while ((len =fis.read(bytes))!=-1){
//            System.out.println(new String(bytes));//这样会打印很多空格
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
    }
}
