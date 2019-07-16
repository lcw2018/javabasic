package com.lcw.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class Demo03Writer {


    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day18_IOAndPrroperyties\\f.txt");
        char c[] = {'a', 'c', 'w', 'e'};

        //  fw.write(c);//void write(char[] cbuf)写入字符数组

        //abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        //  fw.write(c,0,2); ac


        //void write(String str)写入字符串。
      //  fw.write("你好！");  你好


        fw.write("黑马程序员", 1, 2);//马程
        //void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数
        fw.close();


    }

}
