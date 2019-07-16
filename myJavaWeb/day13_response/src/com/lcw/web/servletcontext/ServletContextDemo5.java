package com.lcw.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/6/1
 */
@WebServlet("/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


      /*

            ServletContext功能：
               1. 获取MIME类型：

                2. 域对象：共享数据
                3. 获取文件的真实(服务器)路径
         */


        //通过HttpServlet获取

        ServletContext servletContext = this.getServletContext();


        String realPath1 = servletContext.getRealPath("b.txt");
        System.out.println(realPath1);//D:\Idea_work\artifacts\day13_response_war_exploded\b.txt


        String realPath2 = servletContext.getRealPath("/WEB-INF/c.txt");
        System.out.println(realPath2);//D:\Idea_work\artifacts\day13_response_war_exploded\WEB-INF\c.txt


        String realPath3 = servletContext.getRealPath("/WEB-INF/classes/a.txt");


        System.out.println(realPath3);//D:\Idea_work\artifacts\day13_response_war_exploded\WEB-INF\classes\a.txt


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
