package com.lcw.xml.jsoup;

/**
 * Create by chuanwen.li on 2019/6/20
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 选择器查询
 */
public class JsoupDemo5 {


    public static void main(String[] args) throws IOException {


        //获取student.xml文档的路径
        String path = JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();

        //解析xml文档，加载文档进内存，获取Document对象

        Document document = Jsoup.parse(new File(path), "utf-8");


        //查询name标签
        Elements elements = document.select("name");

        System.out.println(elements);

        System.out.println("======================================");


        //查询id值为nbd的标签

        Elements elements1 = document.select("#nba");

        System.out.println(elements1);

        System.out.println("=========================================");


        //获取student标签，并且number属性的值为"s001"

        Elements select = document.select("student[number='s001']");

        System.out.println(select);

        System.out.println("============================================");


        //获取student标签，并且number属性值为”s002"的标签的age子标签


        Elements select1 = document.select("student[number='s001'] > age");
        System.out.println(select1);
        System.out.println("========================================");


    }
}
