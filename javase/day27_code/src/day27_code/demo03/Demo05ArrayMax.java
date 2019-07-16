package day27_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo05ArrayMax {


    public static void main(String[] args) {


        int[] array = {23, 34, 455, 65776, 344, 23, 544, 131, 64, 24, 12, 53, 564, 67};

        int max = array[0];


        for (int i = 1; i < array.length; i++) {


            if (array[i] > max) {
                max = array[i];

            }


        }

        System.out.println("最大值为:" + max); //65776


    }


}
