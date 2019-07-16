package com.lcw.demo06.StringBuilder;

/**
 * Create by chuanwen.li on 2019/6/22
 */

/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class Demo02StringBuilder {


    public static void main(String[] args) {


        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象bu,this==bu
      /*  StringBuilder sb2 = sb.append("abc");


        System.out.println(sb);//abc

        System.out.println(sb2);//abc


        System.out.println(sb == sb2);//true
*/


        //使用append方法无需接收返回值
/*

        sb.append("abc");
        sb.append(1);
        sb.append(true);
        sb.append(22.4);
        sb.append('中');

        System.out.println(sb);//abc1true22.4中
*/

         /*
            链式编程:方法返回值是一个对象,可以继续调用方法
         */


        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());


        sb.append("abc").append(1).append(true).append(22.4).append('中');

        System.out.println(sb);//abc1true22.4中


    }


}
