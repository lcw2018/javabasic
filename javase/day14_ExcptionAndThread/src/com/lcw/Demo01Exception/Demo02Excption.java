package com.lcw.Demo01Exception;

public class Demo02Excption {
    /*

      异常产生的过程解析（分析异常是怎么产生的，怎么处理异常


 */

    public static void main(String[] args) {

        //定义一个数组，并赋值
        int arr[] = {2, 3, 34, 5, 54};

        arr=null;//java.lang.NullPointerException
        int value = getElement(arr, 5);
        System.out.println(value);//java.lang.ArrayIndexOutOfBoundsException: 5


    }

    /**
     *  定义一个方法，获取数组对应索引位置的值
     * @param arr
     * @param index
     * @return
     */

    private static int getElement(int arr[], int index) {


        int value = arr[index];
        return value;

    }
}
