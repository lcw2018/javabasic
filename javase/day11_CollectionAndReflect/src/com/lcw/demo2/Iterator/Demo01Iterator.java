package com.lcw.demo2.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
/*
    java.util.Iterator接口:迭代器(对集合进行遍历)
    有两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
            判断集合中还有没有下一个元素,有就返回true,没有就返回false
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
       Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
       Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
       Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */

    public static void main(String[] args) {

        Collection<String> col = new ArrayList<>();
        col.add("科比");
        col.add("詹姆斯");
        col.add("库里");
        col.add("哈登");
        col.add("韦德");

        //Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。
        //1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        Iterator<String> iterator = col.iterator();

        //使用Iterator接口中的方法hasNext判断还有没有下一个元素
        while (iterator.hasNext()) {

            //使用Iterator接口中的方法next取出集合中的下一个元素
            String next = iterator.next();
            System.out.println(next);
        }

       //改为for循环方式实现
        for (Iterator<String> iterator1 = col.iterator(); iterator1.hasNext(); ) {
            String next = iterator1.next();
            System.out.println(next);

        }


    }


}
