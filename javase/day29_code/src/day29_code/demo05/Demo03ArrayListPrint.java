package day29_code.demo05;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class Demo03ArrayListPrint {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println(list);  //[10, 20, 30]


        printArrayList(list);   //[10@20@30]


    }

    private static void printArrayList(ArrayList<Integer> list) {


        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {

            if (i == list.size() - 1) {

                System.out.print(list.get(i));
            } else {


                System.out.print(list.get(i) + "@");

            }


        }

        System.out.println("]");
    }
}
