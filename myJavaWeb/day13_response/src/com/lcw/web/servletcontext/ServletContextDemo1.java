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
@WebServlet("/servletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  /*

            ServletContext对象获取：
                1. 通过request对象获取
			        request.getServletContext();
                2. 通过HttpServlet获取
                    this.getServletContext();
         */

        //1. 通过request对象获取
        ServletContext servletContext1 = request.getServletContext();
        System.out.println(servletContext1);//org.apache.catalina.core.ApplicationContextFacade@5687f54d
        //2. 通过HttpServlet获取
        ServletContext servletContext2 = this.getServletContext();
        System.out.println(servletContext2);//org.apache.catalina.core.ApplicationContextFacade@5687f54d

        System.out.println(servletContext1 == servletContext2);//true

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
