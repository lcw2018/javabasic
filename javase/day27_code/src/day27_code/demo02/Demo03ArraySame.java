package day27_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo03ArraySame {

    public static void main(String[] args) {
        int[] arrayA = new int[3];


        System.out.println(arrayA);  //[I@1b6d3586

        System.out.println(arrayA[0]);  //0
        System.out.println(arrayA[1]);  //0
        System.out.println(arrayA[2]);  //0

        System.out.println("==================");

        arrayA[0] = 10;
        arrayA[1] = 20;

        System.out.println(arrayA);  //[I@1b6d3586

        System.out.println(arrayA[0]); //10
        System.out.println(arrayA[1]);  //20
        System.out.println(arrayA[2]);   //0
        System.out.println("==================");


        //将arrayA数组的地址值赋值给arrayB数组

        int[] arrayB = arrayA;

        System.out.println(arrayB);   //[I@1b6d3586
        System.out.println(arrayB[0]);//10
        System.out.println(arrayB[1]);//20
        System.out.println(arrayB[2]); //0
        System.out.println("==================");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); //[I@1b6d3586
        System.out.println(arrayB[0]);//10
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200


    }

}
