package com.lcw.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据

        //1.获取所有请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();

        //2.遍历
        while (headerNames.hasMoreElements()) {


            String element = headerNames.nextElement();

            String value = request.getHeader(element);


            System.out.println(element + ":" + value);


            //     host:localhost:8099
            //      user-agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0
            //      accept:text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
            //     accept-language:zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
            //     accept-encoding:gzip, deflate
            //     connection:keep-alive
            //     cookie:JSESSIONID=0D5CEA39F0B202B9AF19E690B8E00570
            //     upgrade-insecure-requests:1


        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
