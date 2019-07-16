package day26_code.demo04;

/**
 * Create by chuanwen.li on 2019/6/24
 */

// byte short int long float double char boolean
// String
// 在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
public class Demo04OverloadPrint {


    public static void main(String[] args) {


        myPrint(100);//int
        myPrint("hello");//String


    }

    private static void myPrint(byte num) {

        System.out.println(num);
    }

    private static void myPrint(short num) {

        System.out.println(num);
    }

    private static void myPrint(int num) {

        System.out.println(num);
    }


    private static void myPrint(long num) {

        System.out.println(num);
    }


    private static void myPrint(float num) {

        System.out.println(num);
    }


    private static void myPrint(double num) {

        System.out.println(num);
    }


    private static void myPrint(char zifu) {

        System.out.println(zifu);
    }

    private static void myPrint(boolean is) {

        System.out.println(is);
    }

    private static void myPrint(String str) {
        System.out.println(str);
    }


}
