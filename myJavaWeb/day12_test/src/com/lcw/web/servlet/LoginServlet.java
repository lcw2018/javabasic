package com.lcw.web.servlet;

import com.lcw.dao.UserDao;
import com.lcw.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/6/12
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置编码
        request.setCharacterEncoding("utf-8");

        //获取attribute域的对象
     /*   String username = request.getParameter("username");

        String password = request.getParameter("password");

        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);*/

        //获取所有请求参数
        Map<String, String[]> map = request.getParameterMap();

        //创建User对象
        User loginUser = new User();

        //使用BeanUtils封装
        try {

            BeanUtils.populate(loginUser, map);


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);

        if (user == null) {

            request.getRequestDispatcher("failServlet").forward(request, response);

        } else {

            request.setAttribute("user", user);
            request.getRequestDispatcher("successServlet").forward(request, response);

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
