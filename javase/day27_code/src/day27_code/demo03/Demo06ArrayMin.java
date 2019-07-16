package day27_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo06ArrayMin {


    public static void main(String[] args) {


        int[] array = {23, 34, 455, 65776, 344, 23, 544, 131, 64, 24, 12, 53, 564, 67};

        int min = array[0];


        for (int i = 1; i < array.length; i++) {


            if (array[i] < min) {
                min = array[i];

            }


        }

        System.out.println("最小值为:" + min);//12


    }
}
