package day25_code;

/**
 * Create by chuanwen.li on 2019/6/24
 */

// 题目：使用三元运算符和标准的if-else语句分别实现：取两个数字当中的最大值
public class Demo06Max {


    public static void main(String[] args) {

        //使用三元运算符

        int a=200;

        int b=39;

        int max1=a>b?a:b;


        System.out.println(max1);

        //使用if-else语句


        int max;
        if(a>b){


            max=a;
        }
        else {

            max=b;


        }

        System.out.println(max);



    }

}
