package day26_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/24
 */

/*
题目要求：
定义一个方法，用来判断两个数字是否相同。
 */
public class Demo01MethodSame {


    public static void main(String[] args) {

        System.out.println(isSame(10, 20));//false

        System.out.println(isSame(20, 20));//true


    }

    private static boolean isSame(int a, int b) {


        return a == b;

    }

}
