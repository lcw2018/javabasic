package day27_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */


public class Demo01ArrayOne {

    public static void main(String[] args) {


        //动态初始化
        int[] array = new int[3];

        System.out.println(array); //地址值 [I@1b6d3586
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0

        // 改变数组当中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);//地址值 [I@1b6d3586

        System.out.println(array[0]);//0
        System.out.println(array[1]);//10
        System.out.println(array[2]);//20

    }
}
