package com.sunnysnow.day15.demo07.Sychronized;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl r =new RunnableImpl();
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t0.start();
        t1.start();
        t2.start();
    }
}
