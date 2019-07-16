package day30_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */
public class Demo05StringSplit {

    public static void main(String[] args) {

        String strA = "aaa,bbb,ccc";
        String[] array1 = strA.split(",");

        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i]);

        }


        String strB = "aaa bbb ccc";

        String[] array2 = strB.split(" ");


        for (int i = 0; i < array2.length; i++) {

            System.out.println(array2[i]);

        }


        String strC = "aaa.bbb.ccc";


        String[] array3 = strC.split("\\.");

        for (int i = 0; i < array3.length; i++) {

            System.out.println(array3[i]);
        }


    }
}
