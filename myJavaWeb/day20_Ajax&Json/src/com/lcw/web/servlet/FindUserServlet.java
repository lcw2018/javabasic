package com.lcw.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/5/27
 */
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");

         response.setContentType("application/json; charset=utf-8");

        Map<String, Object> map = new HashMap<>();

        if ("curry".equals(username)) {

            map.put("userExist", true);

            map.put("msg", "用户名太热门，请更换一个");


        } else {

            map.put("userExist", false);
            map.put("msg", "用户名可以使用");


        }

        //将map集合对象转换成json

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(response.getWriter(), map);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
