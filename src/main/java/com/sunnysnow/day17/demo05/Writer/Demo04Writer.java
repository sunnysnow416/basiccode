package com.sunnysnow.day17.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写/追加写，使用两个参数的构造方法
        FileWriter(File file, boolean append) 给一个File对象构造一个FileWriter对象。
        FileWriter(String fileName, boolean append) 构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。
        参数：
        File file、String fileName文件写入的目的地
        boolean append 续写开关。true不会创建新的文件，可以续写；false穿件新的文件覆盖文件
    换行：
        windows：\r\n
        linux:/n
        mac:/r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\g.txt",true);
        for (int i=0;i<10;i++){
            fw.write("2020年的冬天"+i+"\r\n");
        }
        fw.close();
    }
}
