package day28_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */


/*
面向对象三大特征：封装、继承、多态。

封装性在Java当中的体现：
1. 方法就是一种封装
2. 关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见。
 */
public class Demo02Method {

    public static void main(String[] args) {


        int[] array = {23, 34, 45, 322, 566, 43, 1};


        int max = getMax(array);


        System.out.println("数组中的最大值为：" + max);


    }

    //找出数组中的最大值
    private static int getMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {


                max = array[i];
            }


        }


        return max;

    }


}
