package com.lcw.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //演示获取请求头数据:referer

        String referer = request.getHeader("referer");

        System.out.println(referer); //http://localhost:8099/day11/login.html


        //仿盗链

        if (referer != null) {


            if (referer.contains("/day11")) {

                System.out.println("开始播放电影");

                response.setContentType("text/html;charset=utf-8");

                response.getWriter().write("播放电影...");

            } else {

                System.out.println("想看电影吗？来优酷吧...");

                response.setContentType("text/html;charset=utf-8");

                response.getWriter().write("想看电影吗？来优酷吧...");

            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
