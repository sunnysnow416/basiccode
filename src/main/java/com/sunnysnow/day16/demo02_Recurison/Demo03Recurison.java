package com.sunnysnow.day16.demo02_Recurison;

/**
 * 利用递归求阶乘
 * n的阶乘：n*(n-1)*(n-2)*(n-3)*...*3*2*1
 * 5的阶乘：5！=5*4*3*2*1
 */
public class Demo03Recurison {
    public static void main(String[] args) {
        int result = jieChen(5);
        System.out.println("result:" + result);
    }

    /**
     * 使用递归计算阶乘
     * 5的阶乘：5！=5*4*3*2*1
     * 递归结束的条件:获取到1的时候
     * 递归的目的：获取到下一个乘数i-1
     *
     * @param i
     * @return
     */
    private static int jieChen(int i) {
        if (i == 1) {
            return 1;
        }

        return i * jieChen(i - 1);

    }
}
