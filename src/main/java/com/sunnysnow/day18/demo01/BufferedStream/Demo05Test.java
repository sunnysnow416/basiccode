package com.sunnysnow.day18.demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
    练习：对文本的内容进行排序
    按照（1、2、3...）顺序排序

    分析：
        1、创建一个HashMap集合对象，key：可以存储每行文本的序号（1234...），value:存储文本
        2、创建字符缓冲输入流对象，构造方法中绑定字符输入流
        3、场景字符缓冲输出流对象，构造方法中绑定字符输出流
        4、使用字符缓冲输入流的方法readLine逐行读取文本
        5、对读取到的文本进行切割，获取行中的序号和文本内容
        6、把切割好的序号和文本内容存储到HashMap中，key中的序号是有序的，会按1234自动排序
        7、遍历HashMap获取每一个键值对
        8、把每一个键值对拼接为一个文本行
        9、使用舒服缓存输出流中的方法write写入到文件中
        10、释放资源
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\出师表.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\18files\\出师表顺序.txt"));
        Map<String,String> map = new HashMap<>();
        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");  //.需要转义字符
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()) {
            bw.write(key+"."+map.get(key));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
