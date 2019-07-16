package com.lcw.xml.jsoup;

/**
 * Create by chuanwen.li on 2019/6/20
 */


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * XPath查询
 */
public class JsoupDemo6 {

    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {

        //获取student.xml的路径

        String path = JsoupDemo6.class.getClassLoader().getResource("student.xml").getPath();


        //获取Document对象

        Document document = Jsoup.parse(new File(path), "utf-8");


        //根据Document对象，获取JXDocument对象

        JXDocument jxDocument = new JXDocument(document);


        //查询所有student标签

        List<JXNode> jxNodes = jxDocument.selN("//student");

        for (JXNode jx :
                jxNodes) {

            System.out.println(jx);
        }


        System.out.println("============================");

        //查询所有student标签下的所有name标签

        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");

        for (JXNode jx :
                jxNodes1) {
            System.out.println(jx);
        }

        System.out.println("================================");


        //查询所有student标签下带有id属性的name标签

        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");

        for (JXNode jx :
                jxNodes2) {

            System.out.println(jx);

        }


        System.out.println("=========================================");

        //查询所有student标签下id属性值为"nba"的name标签

        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='nba']");


        for (JXNode jx :
                jxNodes3) {


            System.out.println(jx);
        }


    }


}
