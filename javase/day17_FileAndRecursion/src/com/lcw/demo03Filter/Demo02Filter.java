package com.lcw.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
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
    我们可以使用过滤器来实现
    在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
        作用:用来过滤文件(File对象)
        抽象方法:用来过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数:
                File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
        作用:用于过滤文件名称
        抽象方法:用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
            参数:
                File dir:构造方法中传递的被遍历的目录
                String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
    注意:
        两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class Demo02Filter {
    public static void main(String[] args) {

        File file = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo03Filter");
        getAllFiles(file);


    }
    /*
            定义一个方法,参数传递File类型的目录
            方法中对目录进行遍历
         */
    private static void getAllFiles(File file) {


        //传递过滤对象，使用匿名内部类
      /*  File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {


                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

        //将相关条件表达式合并到一个return语句上面
     /*   File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
*/

        //使用lambda表达式改造

      /*  File[] files = file.listFiles((File pathname) -> {
                    return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
                }
        );*/
        //简化lamdda表达式

/*
        File[] files = file.listFiles((pathname) ->
                pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));*/

       /*File[] files = file.listFiles(new FilenameFilter() {
            @Override
           public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
           }
        });*/

         //使用lambda表达式优化匿名内部类（接口中只有一个抽象方法）

/*
        File[] files = file.listFiles((File d, String name) -> {
            return new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        //优化lambda表达式

        File[] files = file.listFiles((d, name)
                -> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java"));


        for (File f :
                files) {
            if (f.isDirectory()) {

                getAllFiles(f);

            } else {

                System.out.println(f);

            }
        }


    }


}
