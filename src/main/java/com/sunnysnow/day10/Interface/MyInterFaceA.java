package com.sunnysnow.day10.Interface;

public interface MyInterFaceA {
    public abstract void methodA();

    public abstract void methodComm();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
