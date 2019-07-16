package day29_code.demo02;

import java.util.Scanner;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo02Anonymous {


    public static void main(String[] args) {

        //使用普通方式
        //  Scanner sc = new Scanner(System.in);

        //   int num = sc.nextInt();

        //使用匿名对象的方式

        //   int num2 = new Scanner(System.in).nextInt();


        //使用一般写法传入参数


        //  Scanner sc = new Scanner(System.in);

        //   methodParam(sc);


        //使用匿名对象进行传参

 /*       methodParam(new Scanner(System.in));


        Scanner sc = methodReturn();
*/

        Scanner sc = methodReturn();

        int num = sc.nextInt();
        System.out.println("输入的是：" + num);


    }

    private static Scanner methodReturn() {



       /* Scanner sc = new Scanner(System.in);
        return sc;
*/

        return new Scanner(System.in);


    }

    private static void methodParam(Scanner sc) {

        int num = sc.nextInt();
        System.out.println("输入的是" + num);

    }
}
