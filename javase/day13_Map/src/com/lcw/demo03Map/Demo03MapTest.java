package com.lcw.demo03Map;


/*
    练习:
        计算一个字符串中每个字符出现次数

    分析:
        1.使用Scanner获取用户输入的字符串
        2.创建Map集合,key是字符串中的字符,value是字符的个数
        3.遍历字符串,获取每一个字符
        4.使用获取到的字符,去Map集合判断key是否存在
            key存在:
                通过字符(key),获取value(字符个数)
                value++
                put(key,value)把新的value存储到Map集合中
            key不存在:
                put(key,1)
        5.遍历Map集合,输出结果
 */


import java.util.HashMap;
import java.util.Scanner;

public class Demo03MapTest {


    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        //使用scanner类接收用户输入
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        //将string类型转换成字符数组
        char[] chars = next.toCharArray();
        //创建MAP集合，key是字符，value是字符的格式
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //遍历集合找到找出每一个字符
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                //key存在
                Integer integer = hashMap.get(chars[i]);
                integer++;
                hashMap.put(chars[i], integer);


            } else {//key不存在
                hashMap.put(chars[i], 1);

            }

        }
        //输出集合
        System.out.println(hashMap);
    }
}
