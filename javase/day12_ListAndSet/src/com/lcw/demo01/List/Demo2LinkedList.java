package com.lcw.demo01.List;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */

import java.util.LinkedList;

public class Demo2LinkedList {


    public static void main(String[] args) {

        // show1();
        //show2();
        show3();


    }

    private static void show3() {

/*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法等效于removeFirst*/

        LinkedList<String> linked3 = new LinkedList<>();
        linked3.add("小七");
        linked3.add("景甜");
        linked3.add("江疏影");
        linked3.add("张雨绮");
        System.out.println(linked3);
        if (!linked3.isEmpty()) {
            String removeFirst = linked3.removeFirst();
            System.out.println(removeFirst + ":" + linked3);
            String removeLast = linked3.removeLast();
            System.out.println(removeLast + ":" + linked3);
            linked3.pop();
            System.out.println(linked3);
            linked3.clear();
            System.out.println(linked3);
/*[小七, 景甜, 江疏影, 张雨绮]
        小七:[景甜, 江疏影, 张雨绮]
        张雨绮:[景甜, 江疏影]
[江疏影]*/
        }
    }

    private static void show2() {


     /*   - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。*/


        LinkedList<String> liked2 = new LinkedList<>();
        liked2.add("a");
        liked2.add("b");
        liked2.add("c");
        liked2.add("d");
        System.out.println(liked2);
        String liked2First = liked2.getFirst();
        String liked2Last = liked2.getLast();
        System.out.println(liked2First);
        System.out.println(liked2Last);
    /*
        [a, b, c, d]
        a
        d          */


    }

    private static void show1() {

      /*  public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。 此方法等效于addFirst*/


        LinkedList<String> liked = new LinkedList<>();
        liked.add("刘德华");
        liked.add("张学友");
        liked.add("郭富城");
        liked.add("黎明");
        liked.add("成龙");
        System.out.println(liked);
        liked.addFirst("邵逸夫");
        System.out.println(liked);
        liked.addLast("曾志伟");
        System.out.println(liked);
        liked.push("向华强");
        System.out.println(liked);



/* [刘德华, 张学友, 郭富城, 黎明, 成龙]
[邵逸夫, 刘德华, 张学友, 郭富城, 黎明, 成龙]
[邵逸夫, 刘德华, 张学友, 郭富城, 黎明, 成龙, 曾志伟]
[向华强, 邵逸夫, 刘德华, 张学友, 郭富城, 黎明, 成龙, 曾志伟]*/


    }


}
