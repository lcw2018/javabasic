package com.lcw.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/23
 */
@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 创建Cookie对象
        Cookie cookie = new Cookie("zhangsan", "123");

        //cookie.setMaxAge(30);//将cookie持久化到硬盘，30秒后会自动删除cookie文件

        cookie.setMaxAge(-1);//设置为默认值

        // 发送Cookie

       // cookie.setMaxAge(0);//删除Cookie
        response.addCookie(cookie);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
