package com.lcw.demo2.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02Foreach {
    /*
    增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。

    增强for循环:用来遍历集合和数组

    格式:
        for(集合/数组的数据类型 变量名: 集合名/数组名){
            sout(变量名);
        }
 */

    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("西游记");
        col.add("三国演义");
        col.add("红楼梦");
        col.add("水浒传");
        //用增强for遍历集合
        for (String str : col
        ) {
            System.out.println(str);
        }
        System.out.println("==============================");
        //用增强for遍历数组

        int arr[] = {23, 343, 543, 343, 3454};
        for (int number : arr
        ) {
            System.out.println(number);
        }


    }


}
