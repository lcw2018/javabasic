package com.lcw.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo04Writer {

    public static void main(String[] args) throws IOException {


        /*String s = "传智播客";
        System.out.println(s.length());//4, private final char value[]; 一个汉字占一个字符
        1个中文
        GBK:占用两个字节
        UTF-8:占用3个字节
*/

        FileWriter fw = new FileWriter("day18_IOAndPrroperyties\\g.txt", true);

        for (int i = 0; i < 10; i++) {
            fw.write("hello world !" + i + "\n\r");
        }
        fw.close();


    }


}
