package com.lcw.demo01.List;

/*
    java.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1List {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list);
        //- public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        list.add(2, "ff");
        System.out.println(list);

        // - public E get(int index):返回集合中指定位置的元素。
        String s = list.get(3);
        System.out.println(s);
        //   public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
        String remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list);
        //- public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String bb = list.set(1, "bb");
        System.out.println(bb);
        System.out.println(list);
        //java.lang.IndexOutOfBoundsException: Index: 5, Size: 5
       // String s1 = list.get(5);
       // System.out.println(s1);
        //list集合遍历有3种方式

        //普通for循环遍历

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        //使用迭代器遍历

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);


        }

        //使用增强for遍历
        for (String str :
                list) {
            System.out.println(str);
        }


    }


}
