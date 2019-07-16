package day26_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/24
 */


/*
题目要求：定义一个方法，用来【求出】两个数字之和。（你帮我算，算完之后把结果告诉我。）
题目变形：定义一个方法，用来【打印】两个数字之和。（你来计算，算完之后你自己负责显示结果，不用告诉我。）

注意事项：
对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用。
但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用。
 */
public class Demo04MethodReturn {


    public static void main(String[] args) {

        int num = getSum(10, 20);

        System.out.println("返回值是：" + num);


        System.out.println("=====================");


        pringtSum(100, 200);

        System.out.println("=======================");


        System.out.println(getSum(2, 3)); //正确写法

        getSum(3, 5);//正确写法，但是返回值没有用到

        System.out.println("=========================");


        // System.out.println(pringtSum(2,3));//错误写法
        //System.out.println(void);


        //int num2=pringtSum(3,5); //错误写法
        //int num2=void;
        //void num3=void
    }

    private static void pringtSum(int a, int b) {


        int result = a + b;

        System.out.println("结果是：" + result);


    }

    private static int getSum(int a, int b) {

        int result = a + b;

        return result;


    }

}
