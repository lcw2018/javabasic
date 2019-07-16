package day29_code.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
用代码模拟猜数字的小游戏。

思路：
1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
2. 需要键盘输入，所以用到了Scanner
3. 获取键盘输入的数字，用Scanner当中的nextInt方法
4. 已经得到了两个数字，判断（if）一下：
    如果太大了，提示太大，并且重试；
    如果太小了，提示太小，并且重试；
    如果猜中了，游戏结束。
5. 重试就是再来一次，循环次数不确定，用while(true)。
 */
public class Demo04RandomGame {

    public static void main(String[] args) {

        Random r = new Random();

        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请输入你要猜测的数字：");


            int guessNum = sc.nextInt();


            if (guessNum > num) {


                System.out.println("您猜的数字大了，请继续！");


            } else if (guessNum < num) {

                System.out.println("您猜的数字小了，请继续！");

            } else {

                System.out.println("恭喜你，猜对了！");
                break;

            }


        }


        System.out.println("游戏结束！");


    }

}
