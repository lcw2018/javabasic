package com.lcw.demo02CopyFile;

/*
    文件复制练习:一读一写

    明确:
        数据源: c:\\1.jpg
        数据的目的地: d:\\1.jpg
    文件复制的步骤:
        1.创建字节缓冲输入流对象,构造方法中传递字节输入流
        2.创建字节缓冲输出流对象,构造方法中传递字节输出流
        3.使用字节缓冲输入流对象中的方法read,读取文件
        4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
        5.释放资源(会先把缓冲区中的数据,刷新到文件中)

    文件的大小:8,155,386  字节
    一次读写一个字节:304毫秒
    使用数组缓冲读取多个字节,写入多个字节:62毫秒
 */

import java.io.*;

public class Demo02CopyFile {


    public static void main(String[] args) throws IOException {

        long e = System.currentTimeMillis();
        // 1.创建字节缓冲输入流对象,构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\my.JPG"));


        //2.创建字节缓冲输出流对象,构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day18_IO\\my.JPG"));
        //一次读取一个字节的方式
        /*   int len = 0;

        //   3.使用字节缓冲输入流对象中的方法read,读取文件
        while ((len = bis.read()) != -1) {

            // 4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
            bos.write(len);

        }*/

       //使用数组缓存一次读取多个字节，写入多个字节
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);

        }


        // 5.释放资源(会先把缓冲区中的数据,刷新到文件中)
        bos.close();
        bis.close();
        long c = System.currentTimeMillis();


        System.out.println("复制文件耗时：" + (c - e) + "毫秒");


    }
}
