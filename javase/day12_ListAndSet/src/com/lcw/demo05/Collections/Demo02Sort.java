package com.lcw.demo05.Collections;


    /*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Demo02Sort {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        list.add("d");
        System.out.println(list);//[a, d, c, b, d]
        Collections.sort(list);
        System.out.println(list);//[a, b, c, d, d]

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(44);
        list1.add(54);
        list1.add(1);
        list1.add(56);
        System.out.println(list1);//[3, 44, 54, 1, 56]
        Collections.sort(list1);
        System.out.println(list1);//[1, 3, 44, 54, 56]

        //  public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("李晨", 34));
        people.add(new Person("刘德华", 54));
        people.add(new Person("郭富城", 38));
        people.add(new Person("黎明", 58));
        people.add(new Person("张学友", 47));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }


}
