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
@WebServlet("/servletContextDemo4")
public class ServletContextDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         /*

            ServletContext功能：
               1. 获取MIME类型：

                2. 域对象：共享数据
                3. 获取文件的真实(服务器)路径
         */

        //通过httpServlet获取
        ServletContext servletContext = this.getServletContext();

        //获取值
        Object msg = servletContext.getAttribute("msg");

        System.out.println(msg);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
