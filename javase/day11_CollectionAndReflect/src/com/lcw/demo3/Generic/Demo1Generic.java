package com.lcw.demo3.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1Generic {

    /*
          创建集合对象,使用泛型
          好处:
              1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
              2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
           弊端:
              泛型是什么类型,只能存储什么类型的数据
       */
    public static void main(String[] args) {


        Collection<String> col = new ArrayList<>();
        col.add("库里");
        // col.add(30);Error:(22, 17) java: 不兼容的类型: int无法转换为java.lang.String
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next + "------" + next.length());

        }

 /*
        创建集合对象,不使用泛型
        好处:
            集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
        弊端:
            不安全,会引发异常
     */

        Collection col2 = new ArrayList();
         col2.add("库里");
         col2.add(30);
        Iterator iterator = col2.iterator();
         while (iterator.hasNext()){

             Object next = iterator.next();
             System.out.println(next);
            //object类向下转型成为String类，以此来使用String；类所特有的length()方法
             String next1 = (String) next;
             System.out.println(next1.length());
             //当此时30不能转换成String类型
             //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

         }

    }


}
