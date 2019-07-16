package com.lcw.demo03Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {


    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "c");
        hashMap.put("d", "g");
        hashMap.put("c", "g");
        hashMap.put("d", "k");
        hashMap.put("d", "g");
        hashMap.put("a", "c");


        System.out.println(hashMap);//hashMap,key不允许重复,value可以重复。无序{a=c, c=g, d=g}
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "c");
        linkedHashMap.put("d", "g");
        linkedHashMap.put("c", "g");
        linkedHashMap.put("d", "k");
        linkedHashMap.put("d", "g");
        linkedHashMap.put("a", "c");
        System.out.println(linkedHashMap);
        //{a=c, d=g, c=g} linkedHashMap,key不允许重复，value可以重复，有序

    }

}
