package day25_code;

/**
 * Create by chuanwen.li on 2019/6/24
 */
public class Demo05IfElsePractise {


    public static void main(String[] args) {


        int score = 120;

        if (score >= 90 && score <= 100) {

            System.out.println("优");

        } else if (score >= 80 && score < 90) {

            System.out.println("好");


        } else if (score >= 70 && score < 80) {


            System.out.println("中");


        } else if (score >= 60 && score < 70) {

            System.out.println("及格");
        } else if (score < 60) {


            System.out.println("不及格");
        } else {

            System.out.println("数据错误");


        }


    }


}
