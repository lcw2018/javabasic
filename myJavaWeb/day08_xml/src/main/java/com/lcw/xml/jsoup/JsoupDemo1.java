package com.lcw.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/6/20
 */
public class JsoupDemo1 {


    public static void main(String[] args) throws IOException {


        //获取student.xml文件的路径
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        //解析xml文件，加载进内存，获取DOM树，Document

        Document document = Jsoup.parse(new File(path), "utf-8");

        //获取元素对象Elements
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());

        //获取第一个name的Element对象
        Element element = elements.get(0);

        System.out.println(element);

        //获取元素内容
        String text = element.text();

        System.out.println(text);


    }


}
