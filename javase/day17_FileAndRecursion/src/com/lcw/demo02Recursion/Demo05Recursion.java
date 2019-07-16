package com.lcw.demo02Recursion;


/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        只要.java结尾的文件
        c:\\abc
        c:\\abc\\abc.txt
        c:\\abc\\abc.java
        c:\\abc\\a
        c:\\abc\\a\\a.jpg
        c:\\abc\\a\\a.java
        c:\\abc\\b
        c:\\abc\\b\\b.java
        c:\\abc\\b\\b.txt
 */


import java.io.File;

public class Demo05Recursion {


    public static void main(String[] args) {

        File file = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo02Recursion");
        getAllFiles(file);


    }
    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */
    private static void getAllFiles(File file) {

        File[] files = file.listFiles();
        for (File f :// //对遍历得到的File对象f进行判断,判断是否是文件夹
                files) {
            if (f.isDirectory()) {

                getAllFiles(f); //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)

            } else {
                if (f.getName().toLowerCase().endsWith(".java")) {

                    System.out.println(f);//f是文件，并且文件名是以”>.java“结尾的，则打印出文件

                }

            }
        }


    }
}
