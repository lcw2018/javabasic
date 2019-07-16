package com.lcw.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Create by chuanwen.li on 2019/6/22
 */



/*
    练习:
        请使用日期时间相关的API，计算出一个人已经出生了多少天。
    分析:
        1.使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前的日期,转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒差值转换为天(s/1000/60/60/24)
 */
public class Demo02Test {


    public static void main(String[] args) throws ParseException {

        //接收键盘输入，使用Scanner类中的方法next,获取出生日期
        Scanner sc = new Scanner(System.in);

        String myDate = sc.nextLine();

        // 使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse(myDate);

        //把Date格式的出生日期转换为毫秒值
        long time = date.getTime();

        //使用当前日期的毫秒值-出生日期的毫秒值
        long l = System.currentTimeMillis() - time;

        //获取所得天数
        double d = l / 1000 / 60 / 60 / 24;

        System.out.println(d);


    }


}
