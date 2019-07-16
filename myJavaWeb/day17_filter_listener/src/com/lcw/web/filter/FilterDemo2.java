package com.lcw.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/6/4
 */
//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        //对request的请求消息增强
        System.out.println("demo2执行了");


        //放行
        chain.doFilter(req, resp);

        //对response响应消息增强
        System.out.println("demo2回来了");


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
