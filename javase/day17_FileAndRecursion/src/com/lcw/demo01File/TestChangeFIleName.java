package com.lcw.demo01File;

import java.io.File;

/**
 * Create by chuanwen.li on 2019/4/11
 */
public class TestChangeFIleName {

    public static void main(String[] args) {
        File file = new File("G:\\王道计算机\\Nginx入门与实战\\Nginx入门与实战");
        //File[] files = file.listFiles();
        getAllFiles(file);

    }
   //定义递归遍历文件夹的方法
    private static void getAllFiles(File file) {

        //获取改目录下的所有子文件或者目录
        File[] files = file.listFiles();

        for (File f :
                files) {
            if (f.isDirectory()) {
                getAllFiles(f);

            } else {
                String name = f.getName();
                //修改文件名

                String newName = name.replace("Java自学网【www.javazx.com】", "");
                File file1 = new File(file, newName);
                f.renameTo(file1);
              //删除指定名称的文件
              /*  if(name.equals("Java自学网_用户必读.txt"))
                {
                    f.delete();

                }*/
            }

        }

    }


}
