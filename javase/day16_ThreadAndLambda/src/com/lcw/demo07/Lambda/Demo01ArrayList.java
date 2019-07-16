package com.lcw.demo07.Lambda;


import java.util.ArrayList;

/*
    Lambda表达式:是可推导,可以省略
    凡是根据上下文推导出来的内容,都可以省略书写
    可以省略的内容:
        1.(参数列表):括号中参数列表的数据类型,可以省略不写
        2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
        3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
            注意:要省略{},return,分号必须一起省略
 */
public class Demo01ArrayList {


    public static void main(String[] args) {

        //在JDK1.7之前，创建集合必须把前后的泛型都加上
        ArrayList<String> list1 = new ArrayList<String>();

       //在JDK1.7之后，"="之后的泛型可以省略，可以根据前面的类型推导出后面的类型
        ArrayList<String> list2 = new ArrayList<>();

    }
}
