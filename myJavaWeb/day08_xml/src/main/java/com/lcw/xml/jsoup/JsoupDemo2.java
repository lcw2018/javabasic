package com.lcw.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Create by chuanwen.li on 2019/6/20
 */
public class JsoupDemo2 {


    public static void main(String[] args) throws IOException {

        //获取student.xml文件的路径
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();

    /*    //解析xml文档，加载文档进内存，获取Document文件
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);*/


        // parse​(String html)：解析xml或html字符串

        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\n" +
                "    <student number=\"s001\">\n" +
                "\n" +
                "        <name id=\"nba\">\n" +
                "            <xing>张</xing>\n" +
                "            <ming>三</ming>\n" +
                "        </name>\n" +
                "\n" +
                "        <age>25</age>\n" +
                "\n" +
                "        <sex>male</sex>\n" +
                "\n" +
                "    </student>\n" +
                "\n" +
                "    <student number=\"s002\">\n" +
                "\n" +
                "        <name>jack</name>\n" +
                "\n" +
                "        <age>18</age>\n" +
                "\n" +
                "        <sex>female</sex>\n" +
                "\n" +
                "    </student>\n" +
                "\n" +
                "</students>";

        //解析xml字符串
        Document document = Jsoup.parse(str);

        System.out.println(document);
*/


        //parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象

        URL url = new URL("https://www.baidu.com");//代表网络中的资源路径

        Document document = Jsoup.parse(url, 100000);


        System.out.println(document);


    }


}
