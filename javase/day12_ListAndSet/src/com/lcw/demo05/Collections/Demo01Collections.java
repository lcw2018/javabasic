package com.lcw.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    /*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        // - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "b", "c", "d", "e");
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);//[c, d, e, b, a]...


    }


}
