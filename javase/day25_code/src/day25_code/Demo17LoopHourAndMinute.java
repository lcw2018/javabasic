package day25_code;

/**
 * Create by chuanwen.li on 2019/6/24
 */
public class Demo17LoopHourAndMinute {


    public static void main(String[] args) {


        for (int i = 0; i < 24; i++) {  //外层控制时


            for (int j = 0; j < 60; j++) {   //内存控制分


                System.out.println(i + "点" + j + "分");


            }


        }


    }


}
