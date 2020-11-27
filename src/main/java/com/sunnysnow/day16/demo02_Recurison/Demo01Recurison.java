package com.sunnysnow.day16.demo02_Recurison;

/**
 *  递归：方法自己调用自己
 *      递归的分类：直接递归和间接递归
 *       直接递归：成为方法自身调用自己
 *       间接递归：可以A方法调用B方法，B方法调用C方法，C方法调用A方法
 *     注意事项：
 *       递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 *       在递归中虽然有限定条件，但递归次数不能太多，否则也会发生栈内存溢出。
 *       构造方法禁止递归
 *     递归的使用前提：
 *       当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归。
 */
public class Demo01Recurison {
    public static void main(String[] args) {
        b(1);
    }

    /**
     * 构造方法禁止递归
     * 编辑报错：构造方法是创建对象使用的，一直递归会导致内存中有无数多个对象，直接编译报错
     */
    public Demo01Recurison(){
//        Demo01Recurison();
    }

    /**
     * 在递归中虽然有限定条件，但递归次数不能太多，否则也会发生栈内存溢出。
     * java.lang.StackOverflowError
     * @param i
     */
    private static void b(int i) {
        System.out.println("i:"+i);
        if(i==10000){
            return;//结束方法
        }
        b(++i);
    }

    /**
     * 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
     * java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a方法！");
        a();
    }
}
