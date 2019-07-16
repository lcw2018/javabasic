package com.lcw.Demo03Exception;

import java.util.List;

//如果finally中有return语句，永远返回return中的结果
public class Demo02Excption {

    public static void main(String[] args) {

        int a = getA();
        System.out.println(a);


    }
    //定义一个方法，返回变量a的值
    private static int getA() {
        int a = 10;

        try {
            return a;
        } catch (Exception e) {

            System.out.println(e);

        } finally {
            //一定会被执行的代码
            a = 100;
            return a;
        }


    }


}
