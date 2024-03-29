package com.lcw.demo02Recursion;

/*
    练习:
        使用递归计算1-n之间的和
 */
public class Demo02Recursion {

    public static void main(String[] args) {

        int sum = sum(10);
        System.out.println(sum);


    }
    /*
           定义一个方法,使用递归计算1-n之间的和
           1+2+3+...+n
           n+(n-1)+(n-2)+...+1
           已知:
               最大值:n
               最小值:1
           使用递归必须明确:
               1.递归的结束条件
                   获取到1的时候结束
               2.递归的目的
                   获取下一个被加的数字(n-1)
        */
    private static int sum(int n) {

        if (n==1) {

            return 1;
        }

        //获取下一个被加数字

        return n + sum(n - 1);

    }

}
