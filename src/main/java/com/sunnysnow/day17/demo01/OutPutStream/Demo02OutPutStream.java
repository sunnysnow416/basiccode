package com.sunnysnow.day17.demo01.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次写多个字节的方法
        void write(byte[] b):将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len):从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
 */
public class Demo02OutPutStream {
    public static void main(String[] args) throws IOException {
        Demo02OutPutStream d2 = new Demo02OutPutStream();
        String filePath = d2.getFilePath();

        //FileOutputStream fos = new FileOutputStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\b.txt");
        FileOutputStream fos = new FileOutputStream(new File(filePath));
        //按字节写入多个
        byte[] bytes={65,66,67};//ABC
        fos.write(bytes);
        //按索引和个数写入
        byte[] bytes2={80,81,82};
        fos.write(bytes2,1,2);//从数组的所以1开始写，写2个。结果是ABCQR你好
        //写入字符串
        fos.write("你好".getBytes());//ABC你好
        fos.close();
    }
    private  String getFilePath() {
        String path = this.getClass().getClassLoader().getResource("17files/b.txt").getPath();
        return path;
    }
}
