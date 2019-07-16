package com.lcw.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/29
 */


/**
 * Servlet路径配置
 */
//@WebServlet({"/demo4","/h","/hh"})
//@WebServlet({"/user/demo4"})
//@WebServlet({"/user/*"})
//@WebServlet({"/*"})
@WebServlet("*.do")
public class ServletDemo4 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4");


        System.out.println(req);
    }
}
