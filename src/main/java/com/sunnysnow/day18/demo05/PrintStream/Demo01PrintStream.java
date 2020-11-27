package com.sunnysnow.day18.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream  :打印流
         PrintStream:为其他输出流添加了功能，使他们能改方便的打印各种数据值表示形式。
    PrintStream特点：
        1、只负责数据输出，不能负责数据的读取
        2、与其他输出流不同，永远不输出IOException
        3、有特有的方法：print、println。可以输出任务的数据值
        void print(任务数据类型)
        void println(任务数据类型)
    构造方法：
        PrintStream(File file) 输出的目的地是一个文件
        PrintStream(OutputStream out) 输出的目的地是一个文件输出流
        PrintStream(String fileName) 输出的目的地是一个文件路劲
    PrintStream extends OutputStream
    继承自父类的成员方法:
        定义了一些子类共性的成员方法：
        void close():关闭此输出流并释放与此流相关联的任何系统资源。
        void flush():刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b):将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len):从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b):将指定的字节写入此输出流。
    注意：
        如果使用继承自父类的write方法，会查编码表：97-->a
        如果使用自己特有的方法print或者println写数据，数据原样输出97-->97
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.println('a');
        ps.println("你好");
        ps.println(true);
        ps.close();
    }
}
