package com.lcw.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Create by chuanwen.li on 2019/6/4
 */

@WebListener
public class ContextLoadListener implements ServletContextListener {


    /**
     * 监听ServletContext对象创建的。ServletContext对象服务器启动后自动创建。
     * <p>
     * 服务器启动后自动调用
     *
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {


        //获取servletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        //加载资源文件
        String initParameter = servletContext.getInitParameter("contextConfigLoadcation");

        //获取真实路径
        String realPath = servletContext.getRealPath(initParameter);


        //加载进内存
        try {
            FileInputStream fis = new FileInputStream(realPath);

            System.out.println(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("servletContext对象被创建了...");


    }

    /**
     * 在服务器关闭后，ServletContext对象被销毁。当服务器正常关闭后该方法被调用
     *
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext对象被撤销了...");


    }
}
