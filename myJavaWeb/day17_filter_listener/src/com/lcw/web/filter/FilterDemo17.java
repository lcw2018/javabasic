package com.lcw.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/6/4
 */
@WebFilter("/*")
public class FilterDemo17 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("filterDemo7执行了...");

        chain.doFilter(req, resp);

        System.out.println("filterDemo7回来了");


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
