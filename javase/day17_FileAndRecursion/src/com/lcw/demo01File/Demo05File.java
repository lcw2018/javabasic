package com.lcw.demo01File;

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        - public boolean delete() ：删除由此File表示的文件或目录。
        - public boolean mkdir() ：创建由此File表示的目录。
        - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        // show1();
        // show2();
          show3();

    }

    /*
          public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
          创建文件的路径和名称在构造方法中给出(构造方法的参数)
          返回值:布尔值
              true:文件不存在,创建文件,返回true
              false:文件存在,不会创建,返回false
          注意:
              1.此方法只能创建文件,不能创建文件夹
              2.创建文件的路径必须存在,否则会抛出异常

          public boolean createNewFile() throws IOException
          createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
       */
    private static void show1() throws IOException {
        File file1 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\1.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
        File file2 = new File("day17_FileAndRecursion\\2.txt");
        boolean newFile2 = file2.createNewFile();
        System.out.println(newFile2);
        File file3 = new File("day17_FileAndRecursion\\新建文件夹");
        boolean newFile3 = file3.createNewFile();
        System.out.println(newFile3);

        File file4 = new File("day17_File\\3.txt");
        boolean newFile4 = file4.createNewFile();
        System.out.println(newFile4);

    }

    /*
          public boolean mkdir() ：创建单级空文件夹
          public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
          创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
           返回值:布尔值
               true:文件夹不存在,创建文件夹,返回true
               false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
           注意:
               1.此方法只能创建文件夹,不能创建文件
        */
    private static void show2() {

        File file1 = new File("day17_FileAndRecursion\\dir");
        boolean b = file1.mkdir();
        System.out.println(b);//true
        File file2 = new File("day17_FileAndRecursion\\a\\a\\b");
        boolean b1 = file2.mkdirs();
        System.out.println(b1);//true
        File file3 = new File("day17_FileAndRecursion\\b.txt");
        boolean b2 = file3.mkdirs();
        System.out.println(b2);//false
        File file4 = new File("day17\\a");
        boolean b3 = file4.mkdir();
        System.out.println(b3);//false

    }

    /*
        public boolean delete() ：删除由此File表示的文件或目录。
        此方法,可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */

    private static void show3() {

        File file1 = new File("day17_FileAndRecursion\\2.txt");
        System.out.println(file1.delete());
        File file2 = new File("day17_FileAndRecursion\\a");
        System.out.println(file2.delete());//D:\Idea_work\based-code\day17_FileAndRecursion\a\a\b
        //a中有内容，不能直接删除
        File file3 = new File("day17_FileAndRecursion\\dir");
        System.out.println(file3.delete());//文件夹里面没有内容，可以删除
    }

}
