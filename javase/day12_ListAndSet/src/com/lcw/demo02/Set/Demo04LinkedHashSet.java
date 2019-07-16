package com.lcw.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("James");
        hashSet.add("abc");
        hashSet.add("curry");
        hashSet.add("aa");
        System.out.println(hashSet);//[aa, abc, James, curry] 元素不允许重复，且无序

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("James");
        linkedHashSet.add("abc");
        linkedHashSet.add("curry");
        linkedHashSet.add("aa");
        System.out.println(linkedHashSet);
        //[abc, James, curry, aa]  元素不允许重复，且有序
    }
}
