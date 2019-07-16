package com.lcw.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //post获取请求参数

        //根据参数名称，获取参数值
        String username = request.getParameter("username");

        System.out.println(username);

        System.out.println("====================================");



        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");

        for (String h :
                hobbies) {
            System.out.println(h);
        }



        System.out.println("==========================================");
        //获取所有请求参数的名称

        Enumeration<String> names = request.getParameterNames();

        while (names.hasMoreElements()) {

            String name = names.nextElement();

            System.out.println(name);

            String value = request.getParameter(name);
            System.out.println(value);
            //这种方法，如果name对应的值有多个，只能输出一个

        }

        //获取所有请求参数的map集合


        System.out.println("======================================");

        Map<String, String[]> map = request.getParameterMap();

        Set<String> set = map.keySet();


        for (String s :
                set) {

            String[] strings = map.get(s);

            for (String v :
                    strings) {

                System.out.println(v);

            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
