package day27_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {

    public static void main(String[] args) {

        int[] arrayA = new int[3];


        int[] arrayB = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};


        int length = arrayB.length;

        System.out.println(length);  //24

        System.out.println("=====================");


        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3

        arrayC = new int[5];

        System.out.println(arrayC.length);//5


    }


}
