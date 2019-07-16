package com.lcw.demo02.Set;

import java.util.HashSet;

public class Demo02HashSetSaveString {


    //hashSet不运行存储重复元素
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("english");
        hashSet.add("abc");
        hashSet.add("chinese");
        System.out.println(hashSet);
       //[chinese, abc, english]
    }
}
