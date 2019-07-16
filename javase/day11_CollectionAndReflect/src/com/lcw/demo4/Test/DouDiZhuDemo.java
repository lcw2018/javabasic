package com.lcw.demo4.Test;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主：
 * <p>
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 */


public class DouDiZhuDemo {
    public static void main(String[] args) {

        //1.准备牌
        //定义一个集合用来存储54张牌，泛型指定为String
        ArrayList<String> pork = new ArrayList<>();
       //定义两个数组，一个用来存储牌中的序号，另一个来存储花色
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"♠", "♥", "♣", "♦"};

       //先把大王和小王放入集合中
        pork.add("小王");
        pork.add("大王");


        //循环嵌套遍历两个数组，组装成为52张牌
        for (int i = 0; i < color.length; i++) {

            for (int j = 0; j < number.length; j++) {
                pork.add(color[i] + number[j]);

            }

        }




         /*
            2.洗牌
            使用集合的工具类Collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(pork);


        //定义集合，来存储3个玩家所发得的牌以及底牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

       //3,发牌 用%3的方式轮流发给给每个玩家，最后保留3长底牌
        for (int i = 0; i < pork.size(); i++) {

            String s = pork.get(i);

            if (i > 50) {

                dipai.add(s);

            } else if (i % 3 == 0) {

                play1.add(s);
            } else if (i % 3 == 1) {

                play2.add(s);
            } else if (i % 3 == 2) {


                play3.add(s);
            }


        }

        //4.看牌

        System.out.println("郭富城的牌是：" + play1);
     /*   for (String p1:play1
             ) {
            System.out.println(p1);
        }*/
        System.out.println("张学友的牌是：" + play2);
     /*   for (String p2:play2
             ) {
            System.out.println(p2);
        }*/
        System.out.println("刘德华的牌是：" + play3);
     /*   for (String p3:play3
             ) {
            System.out.println(p3);
        }*/

        System.out.println("底牌是：" + dipai);
        /*for (String dp:dipai
             ) {
            System.out.println(dp);
        }*/

    }


}
