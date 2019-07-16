package com.lcw.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01Set {
    /*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */


    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(43);
        hashSet.add(32);
        hashSet.add(3);
        hashSet.add(5);
        System.out.println(hashSet);


        //[32, 2, 3, 5, 43]存储的元素和取出的元素不一致


        //使用Iterator迭代器遍历集合
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        //使用增强for循环遍历集合
        for (Integer i :
                hashSet) {
            System.out.println(i);
        }


    }


}
