package com.lcw.demo01.Object;

import java.util.Objects;

/**
 * Create by chuanwen.li on 2019/6/21
 */
public class Demo03Objects {


    public static void main(String[] args) {


        String s1 = "abc";


        //    String s2=null;
        String s2 = "abc";

        boolean b = s2.equals(s1);//java.lang.NullPointerException null是不能调用方法的，会抛出空指针异常；

        System.out.println(b);


         /*
            Objects类的equals方法:对两个对象进行比较,防止空指针异常
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }
         */

        boolean b1 = Objects.equals(s1, s2);


        System.out.println(b1);

    }


}
