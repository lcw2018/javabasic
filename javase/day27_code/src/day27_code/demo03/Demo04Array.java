package day27_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
遍历数组，说的就是对数组当中的每一个元素进行逐一、挨个儿处理。默认的处理方式就是打印输出。
 */
public class Demo04Array {


    public static void main(String[] args) {


        int[] array = {23, 343, 45, 32, 45, 34, 43, 63};


        //首选使用原始的遍历方式

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);

        System.out.println("=======================");
        //使用循环的方式简化


        for (int i = 0; i < 8; i++) {

            System.out.println(array[i]);


        }


        System.out.println("=======================");

        //        int len = array.length; // 长度
        for (int i = 0; i < array.length; i++) {


            System.out.println(array[i]);
        }


    }


}
