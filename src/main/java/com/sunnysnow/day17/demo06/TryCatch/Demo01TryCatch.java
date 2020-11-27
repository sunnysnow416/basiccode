package com.sunnysnow.day17.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在java1.7之前使用try catch finally处理流中的异常
    格式：
        try{
            可能会产生异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally{
            一定会执行的代码
            资源释放
        }
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw = new FileWriter("E:\\eclipse\\IJworkspace\\allitems\\basiccode\\src\\main\\resources\\17files\\h.txt");
            fw.write("你好呀");
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
