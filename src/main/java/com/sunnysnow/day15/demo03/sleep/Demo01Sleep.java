package com.sunnysnow.day15.demo03.sleep;

/**
 * public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 * 毫秒数结束之后，线程继续执行
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for(int i=0;i<60;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
