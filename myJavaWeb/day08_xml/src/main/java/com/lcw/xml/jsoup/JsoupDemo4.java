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
 * Element对象功能
 */
public class JsoupDemo4 {


    public static void main(String[] args) throws IOException {

      /*
        Element：元素对象
				1. 获取子元素对象
					* getElementById​(String id)：根据id属性值获取唯一的element对象
					* getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
					* getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
					* getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合

				2. 获取属性值
					* String attr(String key)：根据属性名称获取属性值
				3. 获取文本内容
					* String text():获取所有字标签的纯文本内容
					* String html():获取标签体的所有内容(包括子标签的标签和文本内容)

         */


        //获取student.xml文档的路径

        String path = JsoupDemo4.class.getClassLoader().getResource("student.xml").getPath();

        //解析xml文档，加载文档进内存，得到Document对象

        Document document = Jsoup.parse(new File(path), "utf-8");


        //通过Document对象获取name标签，获取所有的标签

        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());

        System.out.println("======================");


        //通过Element标签获取子标签

        Element student_element = document.getElementsByTag("student").get(0);


        Elements elements1 = student_element.getElementsByTag("name");


        System.out.println(elements1.size());

        //获取student对象的属性值

        String number = student_element.attr("number");

        System.out.println(number);

        System.out.println("===============================");

        //获取文本内容

        String text = elements1.text();

        System.out.println(text);

        String html = elements1.html();

        System.out.println(html);


    }


}
