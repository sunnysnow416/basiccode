package com.sunnysnow.day14.demo06.Thread;

//1、创建Thread类的子类
public class MyThread extends Thread {
    //2、在Thread类的子类中重写run方法，设置线程任务
    @Override
    public void run() {
       for(int i=0;i<20;i++){
           System.out.println("run:"+i);
       }

    }
}
