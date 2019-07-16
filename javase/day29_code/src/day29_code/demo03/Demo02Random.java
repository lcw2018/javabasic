package day29_code.demo03;

import java.util.Random;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo02Random {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 100; i++) {


            int num = r.nextInt(10);  //范围是0~9

            System.out.println(num);


        }


    }


}
