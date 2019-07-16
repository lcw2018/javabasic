package com.lcw.demo02CopyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习:一读一写

    明确:
        数据源: c:\\1.jpg
        数据的目的地: d:\\1.jpg

    文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源
    文件的大小:8,155,386  字节
    一次读写一个字节:90176毫秒
    使用数组缓冲读取多个字节,写入多个字节:171毫秒
 */
public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {


        long e = System.currentTimeMillis();

        //  1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("d:\\my.JPG");

        //   2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("day18_IO\\my.JPG");
       /* int len = 0;
        //一次读一个字节的方式 一次写入一个字节的方式 复制文件共耗时：90176毫秒
        while ((len = fis.read()) != -1) {
            fos.write(len);

        }*/
        //使用数组缓冲读取多个字节,写入多个字节
              //复制文件共耗时：197毫秒
        int len=0;
        byte[] bytes = new byte[1024];

        // 3.使用字节输入流对象中的方法read读取文件
        while ((len=fis.read(bytes))!=-1){


            //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,len);

        }

          //5.释放资源
        fos.close();
        fis.close();
        long c = System.currentTimeMillis();

        System.out.println("复制文件共耗时："+(c-e)+"毫秒");
    }
}
