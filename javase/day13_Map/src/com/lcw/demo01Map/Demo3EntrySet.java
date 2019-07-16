package com.lcw.demo01Map;


/*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3EntrySet {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("杨颖", 92);
        hashMap.put("赵丽颖", 93);
        hashMap.put("王丽坤", 96);
        hashMap.put("景甜", 98);
        hashMap.put("关晓彤", 97);
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        //使用Iterator遍历

        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + "=====" + next.getValue());

         /*   景甜=====98
            杨颖=====92
            赵丽颖=====93
            王丽坤=====96
            关晓彤=====97*/
        }
        System.out.println("===========");

        //使用增强for循环遍历
        for (Map.Entry<String, Integer> entry : entrySet
        ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=======" + value);


        }
       /* 景甜=======98
        杨颖=======92
        赵丽颖=======93
        王丽坤=======96
        关晓彤=======97*/

    }


}
