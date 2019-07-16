package com.lcw.demo01Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
    Map集合的第一种遍历方式:通过键找值的方式
    Map集合中的方法:
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */
public class Demo02KeySet {


    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("杨颖", 92);
        hashMap.put("赵丽颖", 93);
        hashMap.put("王丽坤", 96);
        hashMap.put("景甜", 98);
        hashMap.put("关晓彤", 97);

        Set<String> set = hashMap.keySet();

        //使用Iterator迭代器遍历set集合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.println(next + "---" + hashMap.get(next));
        }
        //景甜---98
        //杨颖---92
        //赵丽颖---93
        //王丽坤---96
        //关晓彤---97

        //使用增强for遍历
        for (String str :
                set) {
            System.out.println(str + "---" + hashMap.get(str));
        }
      /*  景甜---98
        杨颖---92
        赵丽颖---93
        王丽坤---96
        关晓彤---97*/

        //增强for遍历

        for (String s :
                hashMap.keySet()) {
            System.out.println(s+"---"+hashMap.get(s));
        }
/*
        景甜---98
        杨颖---92
        赵丽颖---93
        王丽坤---96
        关晓彤---97*/


    }


}
