package day23_code;

/**
 * Create by chuanwen.li on 2019/6/21
 */


/*
变量：程序运行期间，内容可以发生改变的量。

创建一个变量并且使用的格式：

数据类型 变量名称; // 创建了一个变量
变量名称 = 数据值; // 赋值，将右边的数据值，赋值交给左边的变量

一步到位的格式：

数据类型 变量名称 = 数据值; // 在创建一个变量的同时，立刻放入指定的数据值
*/
public class Demo02Variable {


    public static void main(String[] args) {

        //创建一个变量
        //格式：数据类型 变量名称;
        int num1;

        //向变量中存入一个数据

        //格式： 变量名称=数据值


        num1 = 10;


        //改变变量中的数字。变成新的数字


        num1 = 20;

        System.out.println(num1);

        //使用一步到位的方式来定义变量
        //格式：变量类型 变量名称=变量值


        int num2 = 100;


        System.out.println(num2);


        System.out.println("========================");


        byte num3 = 30;  //右侧数值的类型不能超过左侧数据类型的数值取值范围
        System.out.println(num3);


        // byte num4 = 400;//右侧数值类型超过左侧数据类型的取值范围


        short num5 = 50;

        System.out.println(num5);


        long num6 = 3000000000l;

        System.out.println(num6);


        float num7 = 3.4f;

        System.out.println(num7);


        double num8 = 2.4;
        System.out.println(num8);


        char zifu1 = 'A';

        System.out.println(zifu1);


        zifu1 = '中';

        System.out.println(zifu1);


        boolean var1 = true;

        System.out.println(var1);


        var1 = false;

        System.out.println(false);


        // 将一个变量的数据内容，赋值交给另一个变量
        // 右侧的变量名称var1已经存在，里面装的是false布尔值
        // 将右侧变量里面的false值，向左交给var2变量进行存储

        boolean var2 = var1;


        System.out.println(var2);


    }


}
