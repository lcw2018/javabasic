package day30_code.demo04;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num)：获取绝对值。有多种重载。
public static double ceil(double num)：向上取整。
public static double floor(double num)：向下取整。
public static long round(double num)：四舍五入。

Math.PI代表近似的圆周率常量（double）。
 */
public class Demo03Math {

    public static void main(String[] args) {

        //获取绝对值
        System.out.println(Math.abs(1.6));  //1.6
        System.out.println(Math.abs(0));   //0
        System.out.println(Math.abs(-3.5)); //3.5

        System.out.println("===========================");


        //向上取整

        System.out.println(Math.ceil(3.1));  //4.0
        System.out.println(Math.ceil(2.9));  //3.0
        System.out.println(Math.ceil(3.0));  //3.0
        System.out.println(Math.ceil(-2.9)); //-2.0

        System.out.println("==============================");


        //向下取整

        System.out.println(Math.floor(3.1)); //3.0
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println(Math.floor(-2.1));//-3.0
        System.out.println(Math.floor(-2.6)); //-3.0


        System.out.println("===============================");


        //四舍五入


        System.out.println(Math.round(4.2)); //4
        System.out.println(Math.round(4.5)); //5
        System.out.println(Math.round(4.9)); //5
        System.out.println(Math.round(-3.2)); //-3


        System.out.println("=================================");


        System.out.println(Math.PI);  //3.141592653589793

    }

}
