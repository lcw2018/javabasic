package day27_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
数组的索引编号从0开始，一直到“数组的长度-1”为止。

如果访问数组元素的时候，索引编号并不存在，那么将会发生
数组索引越界异常
ArrayIndexOutOfBoundsException

原因：索引编号写错了。
解决：修改成为存在的正确索引编号。
 */
public class Demo01ArrayIndex {

    public static void main(String[] args) {

        int[] array = {12, 44, 34};


        System.out.println(array[0]);//12
        System.out.println(array[1]);//44
        System.out.println(array[2]);//34


        //错误，不存在下标为3的数组元素  //ArrayIndexOutOfBoundsException: 3
        System.out.println(array[3]);


    }

}
