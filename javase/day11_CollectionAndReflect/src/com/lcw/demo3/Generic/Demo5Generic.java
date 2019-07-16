package com.lcw.demo3.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5Generic {


    /*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */


    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("美国");
        list1.add("法国");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(52);
        printArray(list1);
        printArray(list2);

      // 不能创建对象使用
      //  ArrayList<?> objects = new ArrayList<?>();
    }
     //创建一个方法，不知道参数的类型，这是使用通配符?来接收数据类型
    private static void printArray(ArrayList<?> list) {

        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
           //it,next取出来的元素是object类型，可以接受任意类型的数据
            Object o = it.next();
            System.out.println(o);


        }

    }


}
