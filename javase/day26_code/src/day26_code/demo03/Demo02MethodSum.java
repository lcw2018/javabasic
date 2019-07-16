package day26_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/24
 */

/*
题目要求：
定义一个方法，用来求出1-100之间所有数字的和值。
 */
public class Demo02MethodSum {


    public static void main(String[] args) {


        System.out.println("结果是：" + getSum()); //5050


    }

    /*
     三要素
     返回值：有返回值，计算结果是一个int数字
     方法名称：getSum
     参数列表：数据范围已经确定，是固定的，所以不需要告诉我任何条件，不需要参数
      */
    private static int getSum() {

        int result = 0;

        for (int i = 1; i <= 100; i++) {

            result += i;


        }

        return result;
    }


}
