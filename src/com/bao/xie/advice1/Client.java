package com.bao.xie.advice1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by hzxieshoubao on 2017/2/28.
 * 改善Java程序的151个建议 示例代码
 */
public class Client {

    public static void main(String[] args) {
//        countDoublePlus();
        currencyCalculation();
    }

    public static void countDoublePlus () {
        /*
         * count++ 是一个表达式，是有返回值的，它的返回值就是count自加前的值，Java对自加是这样处理的：
         * 首先把 count 的值（不是引用）拷贝到一个临时变量区，然后对count变量加1，最后返回临时变量区的值。
         * 因此运行结果是0，而不是10
         */
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;
            // count++;
        }
        System.out.println("count: " + count);
    }

    public static void currencyCalculation () {
        // 存款
        BigDecimal d =  new BigDecimal(888888);
        // 月利率，乘3表示季度利率
        BigDecimal r = new BigDecimal(0.001875 * 3);
        // 计算利息
        BigDecimal i = d.multiply(r).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("季度利息是：" + i);
    }
}
