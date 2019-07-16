package com.lcw.demo02Map;


/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */

        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("杨颖", 31), "黄晓明");
        hashMap.put(new Person("赵丽颖", 29), "袁绍峰");
        hashMap.put(new Person("孙俪", 42), "邓超");
        hashMap.put(new Person("范冰冰", 36), "李晨");
        hashMap.put(new Person("李小璐", 40), "贾乃亮");
        hashMap.put(new Person("景甜", 31), "张继科");

        //使用增强for遍历和entrySet遍历map集合
        Set<Map.Entry<Person, String>> entries = hashMap.entrySet();

        Iterator<Map.Entry<Person, String>> it = entries.iterator();
        while (it.hasNext()) {


            Map.Entry<Person, String> next = it.next();
            Person key = next.getKey();
            String value = next.getValue();
            System.out.println(key + ":" + value);
        }
     /*   Person{name='杨颖', age=31}:黄晓明
        Person{name='赵丽颖', age=29}:袁绍峰
        Person{name='李小璐', age=40}:贾乃亮
        Person{name='范冰冰', age=36}:李晨
        Person{name='孙俪', age=42}:邓超
        Person{name='景甜', age=31}:张继科*/


       /*
        HashMap存储自定义类型键值
        key:String类型
            String类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复(姓名和年龄一样视为同一个人

     */

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("杨颖", 32);
        hashMap1.put("赵丽颖", 29);
        hashMap1.put("范冰冰", 39);
        hashMap1.put("景甜", 23);
        hashMap1.put("小七", 18);
        Set<String> set = hashMap1.keySet();

        for (String s :
                set
        ) {
            Integer integer = hashMap1.get(s);
            System.out.println(s + ":" + integer);
        }
/*
        景甜:23
        杨颖:32
        赵丽颖:29
        范冰冰:39
        小七:18*/
    }


}
