package com.lcw.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by chuanwen.li on 2019/5/24
 */


/**
 * 在服务器中的Servlet判断是否有一个名为lastTime的cookie
 * 1. 有：不是第一次访问
 * 1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
 * 2. 写回Cookie：lastTime=2018年6月10日11:50:01
 * 2. 没有：是第一次访问
 * 1. 响应数据：您好，欢迎您首次访问
 * 2. 写回Cookie：lastTime=2018年6月10日11:50:01
 */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置响应的消息体的数据格式以及编码

        response.setContentType("text/html;charset=utf-8");
        boolean isLogin = false;
        //获取Cookie集合
        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0) {

            for (Cookie ck :
                    cookies) {

                String name = ck.getName();

                if (name.equals("lastTime")) {
                    //不是第一登录

                    isLogin = true;
                    String value = ck.getValue();
                    String ckValue = ck.getValue();

                    System.out.println("解码前：" + ckValue);

                    String decode = URLDecoder.decode(ckValue, "UTF-8");

                    System.out.println("解码后：" + decode);


                    response.getWriter().write("<h1>欢迎回来，您上次的访问时间为：" + decode + " </h1> ");

                    Date date = new Date();


                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                    String formatTime = format.format(date);

                    System.out.println("编码前：" + formatTime);
                    String str_date = URLEncoder.encode(formatTime, "UTF-8");
                    System.out.println("编码后：" + str_date);

                    ck.setValue(str_date);
                    //设置失效时间为一个月
                    ck.setMaxAge(30 * 24 * 60 * 60);

                    response.addCookie(ck);



                    break;

                }


            }


        }


        if (cookies == null || cookies.length == 0 || isLogin == false) {

            //是第一次登录

            System.out.println("您好，欢迎您首次访问");

            Date date = new Date();


            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh时mm分ss秒");

            String formatTime = format.format(date);


            System.out.println("编码前：" + formatTime);

            String encode = URLEncoder.encode(formatTime, "UTF-8");
            System.out.println("编码后：" + encode);


            Cookie cookie = new Cookie("lastTime", encode);

            //设置失效时间为一个月
            cookie.setMaxAge(30 * 24 * 60 * 60);

            response.addCookie(cookie);

            response.getWriter().write("<h1>您好欢迎首次访问！</h1>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
