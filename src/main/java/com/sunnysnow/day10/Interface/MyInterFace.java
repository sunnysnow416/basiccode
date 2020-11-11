package com.sunnysnow.day10.Interface;

/*
    这个子接口中有几个方法？4个
    methodA：来源于MyInterFaceA
    methodB：来源于MyInterFaceB
    methodComm：来源于MyInterFaceA和MyInterFaceB
    method：来源于自己MyInterFace
 */
public interface MyInterFace extends MyInterFaceA,MyInterFaceB {
    public abstract void method();

    //重写两个父接口同名的默认方法
    @Override
    default void methodDefault() {
        System.out.println("CCC");
    }
}
