package com.lcw.Demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。
        Exception:编译期异常,进行编译(写代码)java程序出现的问题
            RuntimeException:运行期异常,java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行(吃点药,继续革命工作)
        Error:错误
            错误就相当于程序得了一个无法治愈的毛病(非典,艾滋).必须修改源代码,程序才能继续执行
 */
public class Demo01Excption {


    public static void main(String[] args) /*throws ParseException*/ {

     //Exception；编译期异常，进行编译（写代码）的JAVA程序出现的异常
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");//用来格式化日期
        Date parse = null;
        try {
            parse = dateFormat.parse("2019-0405");//将字符日期转成Data类型的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }

     //   System.out.println(parse);//java.text.ParseException: Unparseable date: "2019-0405"

     //RuntimeException:运行期异常，程序在运行的过程中出现的问题
        int[] arr = {1, 2, 4, 5, 6};
               try {

           System.out.println(arr[5]);//java.lang.ArrayIndexOutOfBoundsException: 5
           System.out.println(2);
       }catch (Exception e){
           System.out.println(e);
       }
               /*
            Error:错误
            OutOfMemoryError: Java heap space
            内存溢出的错误,创建的数组太大了,超出了给JVM分配的内存
         */

        int[] ints = new int[1024 * 1024 * 1024];
        System.out.println(ints);// java.lang.OutOfMemoryError: Java heap space

    }
}
