<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/5/28
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>



</head>
<body>


<%

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
%>

                   <h1>欢迎回来，您上次的访问时间为:<%=decode%> </h1>
<%

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
%>

      <h1>您好欢迎首次访问！</h1>
<%
    }

%>
</body>
</html>
