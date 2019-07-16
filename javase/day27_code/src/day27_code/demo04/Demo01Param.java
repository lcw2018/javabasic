package day27_code.demo04;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
 */
public class Demo01Param {


    public static void main(String[] args) {


        int[] array = {10, 20, 30, 40, 50};

        System.out.println(array);//地址值

        printArray(array);  // 传递进去的就是array当中保存的地址值
        System.out.println("============AAA===========");
        printArray(array);

        System.out.println("============BBB===========");

        printArray(array);

    }


     /*
    三要素
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素。int[] array
     */

    private static void printArray(int[] array) {


        System.out.println("传进printArray方法中收到的参数是:");

        System.out.println(array);

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }


    }

}
