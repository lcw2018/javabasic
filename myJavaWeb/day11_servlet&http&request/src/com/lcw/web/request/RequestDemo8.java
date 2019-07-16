package com.lcw.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("888888被访问了");


        //转发到demo9

        //  RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");

        //  requestDispatcher.forward(request, response);


        //存储数据到request域中
        request.setAttribute("msg", "hello demo9!");

        request.getRequestDispatcher("/requestDemo9").forward(request, response);
        //  request.getRequestDispatcher("www.baidu.com").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
