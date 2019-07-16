package com.lcw.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/27
 */
@WebServlet("/sessionDemo3")
public class SessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取session
        HttpSession session = request.getSession();
        System.out.println(session);
       //org.apache.catalina.session.StandardSessionFacade@2da34f5b

        //期待客户端关闭后session也相同
        Cookie cookie = new Cookie("JSESSIONID", session.getId());

        cookie.setMaxAge(60 * 60);

        response.addCookie(cookie);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
