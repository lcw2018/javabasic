package com.lcw.demo06.StringBuilder;

/**
 * Create by chuanwen.li on 2019/6/22
 */


/*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Demo01StringBuilder {


    public static void main(String[] args) {


        //构造一个不带任何字符的字符串生成器
        StringBuilder sb1 = new StringBuilder();


        System.out.println(sb1);//""


        //构造一共初始化为指定字符串的字符串生成器
        StringBuilder sb2 = new StringBuilder("abc");

        System.out.println(sb2);//abc


    }


}
