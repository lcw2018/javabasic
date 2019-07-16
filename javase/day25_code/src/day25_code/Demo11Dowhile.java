package day25_code;

/**
 * Create by chuanwen.li on 2019/6/24
 */

/*
do-while循环的标准格式：

do {
	循环体
} while (条件判断);

扩展格式：

初始化语句
do {
	循环体
	步进语句
} while (条件判断);
*/
public class Demo11Dowhile {


    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {


            System.out.println("原谅你了，起来吧，免得着凉了" + i);
        }


        System.out.println("====================================");


        int i = 1;//初始化值

        do {

            System.out.println("原谅你了，起来吧，免得着凉了" + i);//循环体


            i++; //步进语句


        } while (i <= 10);//条件判断


    }


}
