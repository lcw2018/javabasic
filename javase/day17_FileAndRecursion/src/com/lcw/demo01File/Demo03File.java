package com.lcw.demo01File;

import java.io.File;

/*
    File类获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class Demo03File {

    public static void main(String[] args) {
        show1();
       // show2();
    //    show3();
    //    show4();*/

    }

    /*
          public long length()  ：返回由此File表示的文件的长度。
          获取的是构造方法指定的文件的大小,以字节为单位
          注意:
              文件夹是没有大小概念的,不能获取文件夹的大小
              如果构造方法中给出的路径不存在,那么length方法返回0
       */
    private static void show4() {
        File file1 = new File("d:\\Idea_work");
        long length1 = file1.length();
        System.out.println(length1);//8192
        File file2 = new File("d:\\adea_work");
        long length2 = file2.length();
        System.out.println(length2);//路径不存在，length返回值为0
        File file3 = new File("d:\\Idea_work\\day17_FileAndRecursion");
        long length3 = file3.length();
        System.out.println(length3);//路径不存在，length返回值为0

        File file4 = new File("D:\\");//24576
        long length4 = file4.length();
        System.out.println(length4);
    }

    /*
         public String getName()  ：返回由此File表示的文件或目录的名称。
         获取的就是构造方法传递路径的结尾部分(文件/文件夹)
      */
    private static void show3() {
        File file1 = new File("D:\\Idea_work\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo03File.java");
        String name1 = file1.getName();
        System.out.println(name1);//Demo03File.java

        File file2 = new File("D:\\Idea_work\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File");
        String name2 = file2.getName();
        System.out.println(name2);//demo01File

    }

    /*
        public String getPath() ：将此File转换为路径名字符串。
        获取的构造方法中传递的路径

        toString方法调用的就是getPath方法
        源码:
            public String toString() {
                return getPath();
            }
     */
    private static void show2() {
        File file = new File("D:\\Idea_work\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo03File.java");
        String path1 = file.getPath();
        System.out.println(path1);
        //D:\Idea_work\day17_FileAndRecursion\src\com\lcw\demo01File\Demo03File.java
        File file2 = new File("Demo03File.java");
        System.out.println(file2); //Demo03File.java
        String path2 = file2.getPath();
        System.out.println(path2);
        //Demo03File.java

    }

    /*
          public String getAbsolutePath() ：返回此File的绝对路径名字符串。
          获取的构造方法中传递的路径
          无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
       */
    private static void show1() {

/*      File file = new File("D:\\Idea_work\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo03File.java");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);*/
        File file1 = new File("Demo03File.java");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);

    }

}
