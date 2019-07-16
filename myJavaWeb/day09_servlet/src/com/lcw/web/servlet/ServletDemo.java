package com.lcw.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/24
 */
@WebServlet("/servletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取Cookie
        Cookie[] cookies = request.getCookies();

//        非空判断
        if (cookies != null) {

            //遍历数据，得到Cookie
            for (Cookie ck :
                    cookies) {
                String name = ck.getName();
                String value = ck.getValue();
                System.out.println(name + "-----" + value);

            }

            System.out.println("day09-----------------------");


        }



}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
