package com.bao.xie.advice1;

/**
 * Created by hzxieshoubao on 2017/2/28.
 */
public class Client {

    public static void main(String[] args) {
        /**
         * count++ 是一个表达式，是有返回值的，它的返回值就是count自加前的值，Java对自加是这样处理的：
         * 首先把 count 的值（不是引用）拷贝到一个临时变量区，然后对count变量加1，最后返回临时变量区的值。
         */
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;
        }
        System.out.println("count: " + count);
    }
}
