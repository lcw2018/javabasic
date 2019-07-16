package com.lcw.demo06.StringBuilder;

/**
 * Create by chuanwen.li on 2019/6/24
 */

/*
    StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
 */
public class Demo03StringBuilder {


    public static void main(String[] args) {

        // String->StringBuilder

        String str = "hello";

        System.out.println("str: " + str);


        StringBuilder sb = new StringBuilder(str);


        sb.append("world!");

        System.out.println(sb);//helloworld!


        //StringBuilder->String

        String s = sb.toString();

        System.out.println(s);//helloworld!


    }


}
