package com.lcw.demo01File;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        //show1();
        show2();
    }

    /*
         public boolean isDirectory() ：此File表示的是否为目录。
             用于判断构造方法中给定的路径是否以文件夹结尾
                 是:true
                 否:false
         public boolean isFile() ：此File表示的是否为文件。
             用于判断构造方法中给定的路径是否以文件结尾
                 是:true
                 否:false
         注意:
             电脑的硬盘中只有文件/文件夹,两个方法是互斥
             这两个方法使用前提,路径必须是存在的,否则都返回false
      */
    private static void show2() {
        File file1 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo04File.java");
        if (file1.exists()) {
            System.out.println(file1.isDirectory());//false
            System.out.println(file1.isFile());//true


        }

        File file2 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File");

        if (file2.exists()) {
            System.out.println(file2.isDirectory());//true
            System.out.println(file2.isFile());//false
        }


        File file3 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01");
        if (file3.exists()) {
            System.out.println(file3.isDirectory());
            System.out.println(file3.isFile());

        }
       //不存在的文件或者文件夹

    }


    /*
           public boolean exists() ：此File表示的文件或目录是否实际存在。
           用于判断构造方法中的路径是否存在
               存在:true
               不存在:false
        */
    private static void show1() {
        File file1 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo04File.java");
        System.out.println(file1.exists());//true
        File file2 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File");
        System.out.println(file2.exists());//true
        File file3 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01");
        System.out.println(file3.exists());//false


        File file4 = new File("test.txt");//相对路径。当前项目的根目录D:\Idea_work\based-code
        System.out.println(file4.exists());
        File file5 = new File("Demo99.java");
        System.out.println(file5.exists());//false


    }


}
