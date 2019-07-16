package com.lcw.xml.jsoup;

/**
 * Create by chuanwen.li on 2019/6/20
 */


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document/Element对象功能
 */
public class JsoupDemo3 {

    public static void main(String[] args) throws IOException {


        //获取student.xml文件的路径

        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();

        //解析xml文档，加载文档进内存，获取Document文档

        Document document = Jsoup.parse(new File(path), "utf-8");


        //获取所有的student对象
        Elements elements = document.getElementsByTag("student");

        System.out.println(elements);

        System.out.println("=============");


        //获取属性值为id的所有对象

        Elements elements1 = document.getElementsByAttribute("id");

        System.out.println(elements1);


        System.out.println("====================");


        //获取number属性值为s001的元素对象


        Elements elements2 = document.getElementsByAttributeValue("number", "s001");

        System.out.println(elements2);

        System.out.println("==========================");


        //获取id属性值的元素对象


        Element element = document.getElementById("nba");

        System.out.println(element);


    }


}
