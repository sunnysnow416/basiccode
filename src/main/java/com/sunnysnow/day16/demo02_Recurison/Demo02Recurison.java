package com.sunnysnow.day16.demo02_Recurison;

/**
 *  练习：
 *  使用递归计算1...n之间的和
 */
public class Demo02Recurison {
    public static void main(String[] args) {
        int i = sum(100);
        System.out.println(i);
    }

    /**
     * 定义一个方法，使用蒂芙尼极端1--n之间的和
     * 1+2+3+...+n
     * n+(n-1)+(n-2)+...+1
     * 已知：
     *      最大值n
     *      最小值1
     * 使用递归必须明确：
     *      1.递归的结束条件：获取到1的时候节数
     *      2.递归的目的：获取下一个被加的数字(n-1)
     * @param n
     * @return
     */
    private static int sum(int n) {
        //获取到1的时候结束
        if(n==1){
            return 1;
        }
        //获取下一个被加的数字n-1
        return n+sum(n-1);

    }

}
