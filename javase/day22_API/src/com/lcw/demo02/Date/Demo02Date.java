package com.lcw.demo02.Date;

import java.util.Date;

/**
 * Create by chuanwen.li on 2019/6/22
 */
public class Demo02Date {

    public static void main(String[] args) {

        //demo01();
       // demo02();
        demo03();

    }

    /*
      long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
         返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    */
    private static void demo03() {

        Date date = new Date();

        long time = date.getTime();

        System.out.println(time);//1561181205706


    }

    /*
        Date类的带参数构造方法
        Date(long date) :传递毫秒值,把毫秒值转换为Date日期
     */
    private static void demo02() {

        Date date = new Date(0l);

        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

    }


    /**
     * Date的无参构造函数
     * <p>
     * Date()获取系统当前日期和时间
     */
    private static void demo01() {

        Date date = new Date();

        System.out.println(date);//Sat Jun 22 13:15:11 CST 2019


    }


}
