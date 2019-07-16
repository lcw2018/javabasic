package cn.lcw.List_Set.day02.Demo1;

/*
实际开发中对一个集合元素的添加与删除经常涉及到首尾操作，而LinkedList提供了大量首尾操作的方法。这些方
        法我们作为了解即可：
public void addFirst(E e) :将指定元素插入此列表的开头。
public void addLast(E e) :将指定元素添加到此列表的结尾。
public E getFirst() :返回此列表的第一个元素。
public E getLast() :返回此列表的最后一个元素。
public E removeFirst() :移除并返回此列表的第一个元素。
public E removeLast() :移除并返回此列表的最后一个元素。
public E pop() :从此列表所表示的堆栈处弹出一个元素。
public void push(E e) :将元素推入此列表所表示的堆栈。
public boolean isEmpty() ：如果列表不包含元素，则返回true。
*/

import java.util.LinkedList;

public class LinkedListDemo2 {


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("火箭");
        list.addFirst("勇士");
        list.addLast("骑士");
        list.add("猛龙");
        list.add("雄鹿");

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst() + "--------" + list.getLast());
        list.pop();
        System.out.println(list);

        list.push("湖人");
        System.out.println(list.isEmpty());
        System.out.println(list);


    }


}
