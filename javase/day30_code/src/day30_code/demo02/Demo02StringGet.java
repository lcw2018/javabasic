package day30_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo02StringGet {

    public static void main(String[] args) {

        //获取字符串长度


        int lenth = "sdfdgfdafsafsfvsdvsvsv".length();

        System.out.println(lenth); //2

        // 拼接字符串
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1); //hello  //不变
        System.out.println(str2);//world   //不变
        System.out.println(str3);//helloworld  //新的字符串

        System.out.println("=====================");

        // 获取指定索引位置的单个字符

        String str4 = "hello";

        char c = str4.charAt(1);

        System.out.println("1号索引位置的字符值为：" + c);
        //1号索引值位置的字符值为：e

        System.out.println("=======================");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String str5 = "dsadkjskscdcskclskcssd";
        int index = str5.indexOf("scd");

        System.out.println("第一次出现的索引值为：" + index); //第一次穿线的索引值为：8


        System.out.println("dskjcnjscjns".indexOf("llo"));  //-1


    }


}
