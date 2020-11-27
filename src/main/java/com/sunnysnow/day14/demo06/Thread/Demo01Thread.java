package com.sunnysnow.day14.demo06.Thread;

/**
 * 创建多线程程序的第一种方式：创建Thread类的子类
 * java.lang.Thread类，是描述线程的类，我们想实现多线程程序就必须继承Thread类
 * 实现步骤：
 * 1、创建Thread类的子类
 * 2、在Thread类的子类中重写run方法，设置线程任务
 * 3、创建Thread类的子类对象
 * 4、调用Thread类中的start()方法，开启新的线程，执行线程任务run方法。
 *      void start() 使该线程开始执行，java虚拟机调用该线程的start方法。
 *      结果是两个线程并发的运行，当前线程（main线程）和另外的线程（创建的新线程，执行run方法）。
 *      多次启动一个线程是非法的，特别是当前线程已经结束执行后，不能再重新启动。
 *  Java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行，同一个优先级，随机选择一个执行。
 *
 */
public class Demo01Thread {

    public static void main(String[] args) {
        //3、创建Thread类的子类对象
        MyThread mt  = new MyThread();
        //4、调用Thread类中的start()方法，开启新的线程，执行线程任务run方法。
        mt.start();

        //main自己的线程
        for(int i=0;i<20;i++){
            System.out.println("main:"+i);
        }

        //结果main线程和run线程交替执行
    }
}
