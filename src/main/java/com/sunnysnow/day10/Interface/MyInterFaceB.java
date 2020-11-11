package com.sunnysnow.day10.Interface;

public interface MyInterFaceB {
    public abstract void methodB();

    public abstract void methodComm();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
