package cn.lcw.day03.demo6;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest2 {

    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
     //定义每个字符串出出现次数的方法
        findCharNum(str);


    }

    private static void findCharNum(String s) {
        //创建一个集合存储字符串和其出现次数
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //判断该字符串是否在键集中
            if (map.containsKey(s.charAt(i))) {

                //获取此字符串已经出现的次数
                Integer num = map.get(s.charAt(i));
                map.put(s.charAt(i), ++num);


            } else {

                //字符串中没有出现过此字符，将其存入结合中
                map.put(s.charAt(i), 1);

            }


        }

        System.out.println(map);
    }


}
